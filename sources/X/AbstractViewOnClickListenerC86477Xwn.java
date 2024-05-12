package X;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;
import com.ss.android.ugc.aweme.innerpush.idl.InnerPushApi;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* renamed from: X.Xwn, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractViewOnClickListenerC86477Xwn extends FrameLayout implements View.OnClickListener {
    public java.util.Map<Integer, View> _$_findViewCache;
    public InnerPushMessage curMsg;
    public PopupWindow popupWindowRef;
    public InnerPushUITemplate templatePushMsg;

    public void _$_clearFindViewByIdCache() {
        this._$_findViewCache.clear();
    }

    public View _$_findCachedViewById(int i) {
        java.util.Map<Integer, View> map = this._$_findViewCache;
        View view = map.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        if (findViewById == null) {
            return null;
        }
        map.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract String getSchemaUrl(View view);

    public abstract boolean handleClick(View view);

    public void resetViewsParams() {
    }

    private final void mobInnerPushClick() {
        InnerPushMessage innerPushMessage = this.curMsg;
        if (innerPushMessage != null) {
            C86496Xx6.LJI(innerPushMessage, "click");
            C86478Xwo.LIZIZ("InnerPushPopupCommonView", "mobInnerPushClick... ");
            InnerPushApi.LIZ(innerPushMessage, EnumC86511XxL.CLICK);
        }
    }

    public final InnerPushMessage getCurMsg() {
        return this.curMsg;
    }

    public final PopupWindow getPopupWindowRef() {
        return this.popupWindowRef;
    }

    public final InnerPushUITemplate getTemplatePushMsg() {
        return this.templatePushMsg;
    }

    public void bindContent(InnerPushMessage message) {
        o.LJIIIZ(message, "message");
        this.templatePushMsg = message.getUiTemplate();
        this.curMsg = message;
        setOnClickListener(new ViewOnClickListenerC13880ga(this));
        resetViewsParams();
    }

    public final void bindWindow(PopupWindow window) {
        o.LJIIIZ(window, "window");
        this.popupWindowRef = window;
    }

    public final void jumpWithRouter(String url) {
        o.LJIIIZ(url, "url");
        o.LJIIIIZZ(UriProtector.parse(url), "parse(url)");
        boolean z = getContext() instanceof Activity;
        Integer num = null;
        if (((Boolean) C53334KwU.LIZJ.getValue()).booleanValue()) {
            SmartRoute buildRoute = SmartRouter.buildRoute(getContext(), url);
            o.LJIIIIZZ(buildRoute, "buildRoute(context, url)");
            buildRoute.withParam("video_from", "from_inner_push");
            C57419MgB.LJII(buildRoute, this.curMsg);
            InnerPushMessage innerPushMessage = this.curMsg;
            if (innerPushMessage != null) {
                num = Integer.valueOf(innerPushMessage.getType());
            }
            buildRoute.withParam("inner_push_type", num);
            buildRoute.open();
        } else {
            SmartRoute buildRoute2 = SmartRouter.buildRoute(getContext(), url);
            o.LJIIIIZZ(buildRoute2, "buildRoute(context, url)");
            C57419MgB.LJII(buildRoute2, this.curMsg);
            InnerPushMessage innerPushMessage2 = this.curMsg;
            if (innerPushMessage2 != null) {
                num = Integer.valueOf(innerPushMessage2.getType());
            }
            buildRoute2.withParam("inner_push_type", num);
            buildRoute2.open();
        }
        PopupWindow popupWindow = this.popupWindowRef;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        mobInnerPushClick();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String globalSchemaUrl;
        if (C6ZT.LIZ(view)) {
            return;
        }
        InnerPushMessage innerPushMessage = this.curMsg;
        if (innerPushMessage != null) {
            List list = (List) C86506XxG.LIZ().get(Integer.valueOf(innerPushMessage.getType()));
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((InterfaceC86533Xxh) it.next()).LJI(innerPushMessage);
                }
            }
            Iterator<InterfaceC86533Xxh> it2 = C86506XxG.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJI(innerPushMessage);
            }
            if (handleClick(view)) {
                return;
            }
            InterfaceC86486Xww LIZ = C58242MtS.LIZ(innerPushMessage.getType());
            if (LIZ != null && LIZ.LIZIZ(0, innerPushMessage)) {
                return;
            }
        }
        InnerPushUITemplate innerPushUITemplate = this.templatePushMsg;
        if (innerPushUITemplate != null && (globalSchemaUrl = innerPushUITemplate.getGlobalSchemaUrl()) != null) {
            jumpWithRouter(globalSchemaUrl);
        }
    }

    public final void setCurMsg(InnerPushMessage innerPushMessage) {
        this.curMsg = innerPushMessage;
    }

    public final void setPopupWindowRef(PopupWindow popupWindow) {
        this.popupWindowRef = popupWindow;
    }

    public final void setTemplatePushMsg(InnerPushUITemplate innerPushUITemplate) {
        this.templatePushMsg = innerPushUITemplate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractViewOnClickListenerC86477Xwn(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this._$_findViewCache = C62850Ola.LJFF(context, "context");
    }

    public /* synthetic */ AbstractViewOnClickListenerC86477Xwn(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
