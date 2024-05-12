package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.ss.android.ugc.aweme.im.sdk.common.controller.providedservices.IMService;
import com.ss.android.ugc.aweme.share.ShareExtServiceImpl;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.sharer.model.SharePackage;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.OeB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62391OeB extends C62415OeZ {
    public final /* synthetic */ C62385Oe5 LIZ;
    public final /* synthetic */ C62433Oer LIZIZ;

    public C62391OeB(C62385Oe5 c62385Oe5, C62433Oer c62433Oer) {
        this.LIZ = c62385Oe5;
        this.LIZIZ = c62433Oer;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        super.LIZLLL(context, sharePackage);
        this.LIZ.LJFF();
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJ(Context context, BaseSharePackage sharePackage) {
        Activity activity;
        int i;
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        InterfaceC72642tA<C50420Jqa> interfaceC72642tA = this.LIZ.LIZLLL;
        if (interfaceC72642tA != null) {
            interfaceC72642tA.onInternalEvent(new C50420Jqa(28));
        }
        this.LIZ.LJFF();
        ShareExtServiceImpl.LJJLIIJ().LJIIJ(this.LIZ.LIZJ);
        if (!this.LIZ.LJFF) {
            String string = sharePackage.extras.getString("share_action_key");
            String string2 = sharePackage.extras.getString("share_platform");
            if ((string != null || string2 != null) && !o.LJ(string, "captions") && !o.LJ(string2, "copy")) {
                this.LIZ.LIZ.finish();
            }
        }
        if (C217628gQ.LIZIZ.LIZJ(this.LIZ.LIZ)) {
            Activity activity2 = this.LIZ.LIZ;
            o.LJIIIZ(activity2, "activity");
            activity2.getWindow().setNavigationBarColor(C04330Ez.LIZIZ(activity2, R.color.ey));
        }
        if (o.LJ(this.LIZ.LJIIIIZZ, "long_press") && (activity = this.LIZ.LIZ) != null && !activity.isFinishing() && !this.LIZ.LIZ.isDestroyed()) {
            Activity activity3 = this.LIZ.LIZ;
            if (activity3 instanceof InterfaceC55058LjC) {
                i = 1;
            } else if (activity3 instanceof InterfaceC224908sA) {
                i = 2;
            } else {
                i = -1;
            }
            C55274Lmg c55274Lmg = new C55274Lmg(i, activity3.hashCode());
            this.LIZIZ.getClass();
            if (o.LJ(null, "report")) {
                c55274Lmg.LJLJL = true;
            }
            C2U8.LIZ(c55274Lmg);
        }
        if (IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIILIIL()) {
            C2U8.LIZ(new C50420Jqa(29));
        }
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LIZIZ(Context context, BaseSharePackage sharePackage, InterfaceC62486Ofi action) {
        o.LJIIIZ(action, "action");
        o.LJIIIZ(sharePackage, "sharePackage");
        o.LJIIIZ(context, "context");
        if (action instanceof C62509Og5) {
            this.LIZ.LJ.putString("share_form", "url_form");
            this.LIZ.LJI(action.key(), true, (SharePackage) sharePackage, context, this.LIZ.LIZJ, true, false);
        }
        if (action instanceof C62027OVz) {
            this.LIZ.LJI(action.key(), true, (SharePackage) sharePackage, context, this.LIZ.LIZJ, true, false);
        }
        if (!o.LJ(action.key(), "live_photo")) {
            return;
        }
        this.LIZ.LJI(action.key(), true, (SharePackage) sharePackage, context, this.LIZ.LIZJ, true, false);
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJFF(View view, C62387Oe7 sharePanelConfig, C5JV c5jv) {
        o.LJIIIZ(sharePanelConfig, "sharePanelConfig");
        this.LIZIZ.getClass();
        if (this.LIZ.LIZJ.getAwemeType() == 150) {
            C4LD.LIZIZ.LIZ();
        }
        if (IMService.createIIMServicebyMonsterPlugin(false).getShareService().LJIILIIL()) {
            C2U8.LIZ(new C50420Jqa(3));
        }
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        this.LIZ.LJIIJ(channel, z, baseSharePackage, context);
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final Object LIZJ(Context context, BaseSharePackage baseSharePackage, InterfaceC62225ObV interfaceC62225ObV, InterfaceC67352kd interfaceC67352kd) {
        Object LIZIZ = this.LIZ.LIZIZ(context, baseSharePackage, interfaceC62225ObV, interfaceC67352kd);
        if (LIZIZ == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return LIZIZ;
        }
        return C76800UCe.LIZ;
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        String str2;
        Bundle bundle;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        String key = channel.key();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        if (baseSharePackage == null || (bundle = baseSharePackage.extras) == null || (str2 = bundle.getString("now_type")) == null) {
            str2 = "";
        }
        C62468OfQ.LJII(baseSharePackage, key, str, str2, null, 48);
    }
}
