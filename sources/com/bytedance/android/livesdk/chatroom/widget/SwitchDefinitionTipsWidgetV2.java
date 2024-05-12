package com.bytedance.android.livesdk.chatroom.widget;

import X.B99;
import X.BCN;
import X.BCW;
import X.BCX;
import X.C162476Zf;
import X.C16880lQ;
import X.C28509BGv;
import X.C35331a5;
import X.CN1;
import Y.ACListenerS25S0100000_5;
import Y.ARunnableS41S0100000_5;
import android.os.Handler;
import android.view.View;
import android.view.animation.TranslateAnimation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.definition.IDefinitionService;
import com.bytedance.android.livesdk.dataChannel.AudienceDefinitionSwitchTipsChannel;
import com.bytedance.android.livesdk.livesetting.watchlive.EnableCacheLastSelectDefinitionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public class SwitchDefinitionTipsWidgetV2 extends LiveRecyclableWidget {
    public static long LJLJLJ;
    public static final /* synthetic */ int LJLJLLL = 0;
    public boolean LJLIL;
    public B99 LJLJJI;
    public TranslateAnimation LJLJJLL;
    public TranslateAnimation LJLJL;
    public final Handler LJLILLLLZI = new Handler(C16880lQ.LLJJJJ());
    public boolean LJLJI = true;
    public final ARunnableS41S0100000_5 LJLJJL = new ARunnableS41S0100000_5(this, 142);

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    @Override // com.bytedance.android.widget.Widget
    public int getLayoutId() {
        if (EnableCacheLastSelectDefinitionSetting.INSTANCE.isEnableAutoTips()) {
            return R.layout.dqp;
        }
        return R.layout.dqo;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        B99 b99 = this.LJLJJI;
        if (b99 != null) {
            this.LJLILLLLZI.removeCallbacks(b99);
        }
        this.LJLILLLLZI.removeCallbacks(this.LJLJJL);
        this.LJLJI = true;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        String str;
        String str2;
        LiveMode liveMode;
        Long l;
        super.show();
        DataChannel dataChannel = this.dataChannel;
        String str3 = "";
        if (dataChannel == null || (l = (Long) dataChannel.kv0(BCN.class)) == null || (str = l.toString()) == null) {
            str = "";
        }
        DataChannel dataChannel2 = this.dataChannel;
        if (dataChannel2 != null && (liveMode = (LiveMode) dataChannel2.kv0(BCX.class)) != null) {
            str3 = C28509BGv.LIZ(liveMode);
        }
        boolean z = this.LJLJI;
        if (z) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        } else if (!z) {
            str2 = "1";
        } else {
            throw new C162476Zf();
        }
        IDefinitionService iDefinitionService = (IDefinitionService) CN1.LIZ(IDefinitionService.class);
        if (iDefinitionService != null) {
            iDefinitionService.Mr(str, str3, str2);
        }
        LJLJLJ = System.currentTimeMillis();
        DataChannel dataChannel3 = this.dataChannel;
        if (dataChannel3 != null) {
            dataChannel3.rv0(AudienceDefinitionSwitchTipsChannel.class, Boolean.TRUE);
        }
        this.LJLJJLL = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.25f, 1, 0.0f);
        this.LJLJL = new TranslateAnimation(1, 0.0f, 1, 0.0f, 1, 0.0f, 1, 0.25f);
        TranslateAnimation translateAnimation = this.LJLJJLL;
        if (translateAnimation != null) {
            translateAnimation.setDuration(500L);
        }
        TranslateAnimation translateAnimation2 = this.LJLJL;
        if (translateAnimation2 != null) {
            translateAnimation2.setDuration(500L);
        }
        TranslateAnimation translateAnimation3 = this.LJLJJLL;
        if (translateAnimation3 != null) {
            translateAnimation3.setInterpolator(new C35331a5());
        }
        TranslateAnimation translateAnimation4 = this.LJLJL;
        if (translateAnimation4 != null) {
            translateAnimation4.setInterpolator(new C35331a5());
        }
        View view = getView();
        if (view != null) {
            view.startAnimation(this.LJLJJLL);
        }
        this.LJLILLLLZI.postDelayed(this.LJLJJL, 5000L);
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        super.hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(AudienceDefinitionSwitchTipsChannel.class, Boolean.FALSE);
        }
    }

    public SwitchDefinitionTipsWidgetV2(boolean z) {
        this.LJLIL = z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final void initConstructor(Object... args) {
        o.LJIIIZ(args, "args");
        super.initConstructor(Arrays.copyOf(args, args.length));
        Object obj = args[0];
        o.LJII(obj, "null cannot be cast to non-null type kotlin.Boolean");
        this.LJLIL = ((Boolean) obj).booleanValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        int i;
        View view;
        EnableCacheLastSelectDefinitionSetting enableCacheLastSelectDefinitionSetting = EnableCacheLastSelectDefinitionSetting.INSTANCE;
        if (enableCacheLastSelectDefinitionSetting.isEnableAutoTips()) {
            i = R.id.azo;
        } else {
            i = R.id.azn;
        }
        View findViewById = findViewById(i);
        C16880lQ.LJIIJ(new ACListenerS25S0100000_5(this, 141), findViewById);
        if (enableCacheLastSelectDefinitionSetting.isEnableAutoTips() && (view = getView()) != null) {
            C16880lQ.LJIIJ(new ACListenerS25S0100000_5(findViewById, 142), view);
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        boolean z;
        Boolean bool;
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (bool = (Boolean) dataChannel.kv0(BCW.class)) != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        this.LJLJI = z;
    }
}
