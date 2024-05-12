package X;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.Button;
import com.twitter.sdk.android.core.TwitterSession;
import com.twitter.sdk.android.core.identity.TwitterAuthClient;
import java.lang.ref.WeakReference;

/* renamed from: X.Q4s, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66414Q4s extends Button {
    public final WeakReference<Activity> LJLIL;
    public volatile TwitterAuthClient LJLILLLLZI;
    public View.OnClickListener LJLJI;
    public AbstractC65259PjL<TwitterSession> LJLJJI;

    public TwitterAuthClient getTwitterAuthClient() {
        if (this.LJLILLLLZI == null) {
            synchronized (C66414Q4s.class) {
                if (this.LJLILLLLZI == null) {
                    this.LJLILLLLZI = new TwitterAuthClient();
                }
            }
        }
        return this.LJLILLLLZI;
    }

    public Activity getActivity() {
        if ((getContext() instanceof ContextThemeWrapper) && (((ContextWrapper) getContext()).getBaseContext() instanceof Activity)) {
            return (Activity) ((ContextWrapper) getContext()).getBaseContext();
        }
        if (getContext() instanceof Activity) {
            return (Activity) getContext();
        }
        if (isInEditMode()) {
            return null;
        }
        throw new IllegalStateException("TwitterLoginButton requires an activity. Override getActivity to provide the activity for this button.");
    }

    public AbstractC65259PjL<TwitterSession> getCallback() {
        return this.LJLJJI;
    }

    public C66414Q4s(Context context) {
        super(context, null, R.attr.buttonStyle);
        this.LJLIL = new WeakReference<>(getActivity());
        this.LJLILLLLZI = null;
        Resources resources = getResources();
        setCompoundDrawablesWithIntrinsicBounds(resources.getDrawable(com.zhiliaoapp.musically.R.drawable.dd6), (Drawable) null, (Drawable) null, (Drawable) null);
        setCompoundDrawablePadding(resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.aj9));
        setText(com.zhiliaoapp.musically.R.string.t6t);
        setTextColor(resources.getColor(com.zhiliaoapp.musically.R.color.abq));
        setTextSize(0, resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.ajd));
        setTypeface(Typeface.DEFAULT_BOLD);
        setPadding(resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.aja), 0, resources.getDimensionPixelSize(com.zhiliaoapp.musically.R.dimen.ajc), 0);
        setBackgroundResource(com.zhiliaoapp.musically.R.drawable.dd7);
        super.setOnClickListener(new ViewOnClickListenerC65286Pjm(this));
        setAllCaps(false);
        if (isInEditMode()) {
            return;
        }
        try {
            C65263PjP.LIZIZ();
        } catch (IllegalStateException e) {
            C44432HcC LIZIZ = C65265PjR.LIZIZ();
            e.getMessage();
            LIZIZ.getClass();
            setEnabled(false);
        }
    }

    public void setCallback(AbstractC65259PjL<TwitterSession> abstractC65259PjL) {
        if (abstractC65259PjL != null) {
            this.LJLJJI = abstractC65259PjL;
            return;
        }
        throw new IllegalArgumentException("Callback cannot be null");
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.LJLJI = onClickListener;
    }
}
