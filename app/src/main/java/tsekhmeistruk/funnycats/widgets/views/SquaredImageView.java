package tsekhmeistruk.funnycats.widgets.views;

import android.content.Context;
import android.util.AttributeSet;

/**
 * Created by Roman Tsekhmeistruk on 16.05.2017.
 * An image view which always remains square with respect to its width.
 */

public class SquaredImageView extends android.support.v7.widget.AppCompatImageView {

    public SquaredImageView(Context context) {
        super(context);
    }

    public SquaredImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
        setAdjustViewBounds(true);
    }

}
