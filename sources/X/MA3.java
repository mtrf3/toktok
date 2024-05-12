package X;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.view.View;
import com.ss.android.ugc.aweme.story.widget.SmallStoryWidget;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class MA3 implements View.OnClickListener {
    public final /* synthetic */ View LJLIL;
    public final /* synthetic */ Context LJLILLLLZI;
    public final /* synthetic */ C34K LJLJI;

    public MA3(View view, Context context, C34K c34k) {
        this.LJLIL = view;
        this.LJLILLLLZI = context;
        this.LJLJI = c34k;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View customView = this.LJLIL;
        o.LJIIIIZZ(customView, "customView");
        ASQ.LIZLLL(customView, ASX.LIZ);
        Context context = this.LJLILLLLZI;
        o.LJIIIZ(context, "context");
        if (Build.VERSION.SDK_INT >= 26 && AppWidgetManager.getInstance(context).isRequestPinAppWidgetSupported()) {
            this.LJLJI.element = true;
            AppWidgetManager.getInstance(this.LJLILLLLZI).requestPinAppWidget(new ComponentName(this.LJLILLLLZI, (Class<?>) SmallStoryWidget.class), null, null);
        } else {
            MCT.LIZ("StoryWidgetGuideUtil", "do not support request pin widget");
        }
    }
}
