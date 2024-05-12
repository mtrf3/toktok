package X;

import Y.ACallableS31S1100000_3;
import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.pkg.NowInviteSharePackage;
import kotlin.jvm.internal.o;

/* renamed from: X.OcD, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62269OcD extends C62415OeZ {
    public final /* synthetic */ NowInviteSharePackage LIZ;
    public final /* synthetic */ Activity LIZIZ;

    public C62269OcD(NowInviteSharePackage nowInviteSharePackage, Activity activity) {
        this.LIZ = nowInviteSharePackage;
        this.LIZIZ = activity;
    }

    @Override // X.C62415OeZ, X.InterfaceC110854Wr
    public final void LIZ(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        NowInviteSharePackage nowInviteSharePackage = this.LIZ;
        String key = channel.key();
        nowInviteSharePackage.getClass();
        C10K.LIZJ(new ACallableS31S1100000_3(nowInviteSharePackage, key, 4));
        if (z) {
            C57135Mbb.LIZIZ.LIZLLL().LIZ(this.LIZIZ, this.LIZ.itemType, channel.key());
        }
    }

    @Override // X.C62415OeZ, X.InterfaceC62474OfW
    public final void LJI(InterfaceC62225ObV channel, boolean z, BaseSharePackage baseSharePackage, Context context) {
        String str;
        o.LJIIIZ(channel, "channel");
        o.LJIIIZ(context, "context");
        C62272OcG c62272OcG = NowInviteSharePackage.Companion;
        String key = channel.key();
        if (z) {
            str = "success";
        } else {
            str = "fail";
        }
        c62272OcG.getClass();
        C62272OcG.LIZ(key, str);
    }
}
