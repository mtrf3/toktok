package X;

import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS79S0300000_13;
import Y.AfS65S0100000_13;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.Tea, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75156Tea extends C31073CHl {
    public final /* synthetic */ C75150TeU LJLJL;
    public final /* synthetic */ User LJLJLJ;
    public final /* synthetic */ C47061t0 LJLJLLL;
    public final /* synthetic */ C2A4 LJLL;
    public final /* synthetic */ C47061t0 LJLLI;

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.String, O] */
    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        boolean z;
        o.LJIIIZ(anim, "anim");
        this.LJLJL.LJZI = Long.valueOf(System.currentTimeMillis());
        C75150TeU c75150TeU = this.LJLJL;
        User user = this.LJLJLJ;
        c75150TeU.LJZL = user;
        DataChannel dataChannel = c75150TeU.LJZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74966TbW.class)).LIZ = user.getIdStr();
        }
        DataChannel dataChannel2 = this.LJLJL.LJZ;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C75503TkB.class)).LIZ = Boolean.TRUE;
        }
        this.LJLJL.LL = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(60L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS65S0100000_13(this.LJLJL, 127));
        String idStr = this.LJLJLJ.getIdStr();
        if (((int) this.LJLJLJ.getFollowInfo().getFollowStatus()) == 2) {
            z = true;
        } else {
            z = false;
        }
        C74824TYe.LJJLL(idStr, false, z);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Boolean, O] */
    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C87277YNd.LJJIIZI(this.LJLJLLL);
        C87277YNd.LJJIIZI(this.LJLL);
        this.LJLJL.LIZ(true);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        C47061t0 c47061t0 = this.LJLLI;
        C47061t0 c47061t02 = this.LJLJLLL;
        C75150TeU c75150TeU = this.LJLJL;
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c75150TeU, 0));
        ofFloat.addListener(new ALAdapterS10S0200000_13(c47061t0, c47061t02, 16));
        ofFloat.start();
        DataChannel dataChannel = this.LJLJL.LJZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75503TkB.class)).LIZ = Boolean.FALSE;
        }
    }

    public C75156Tea(C75150TeU c75150TeU, User user, C47061t0 c47061t0, C2A4 c2a4, C47061t0 c47061t02) {
        this.LJLJL = c75150TeU;
        this.LJLJLJ = user;
        this.LJLJLLL = c47061t0;
        this.LJLL = c2a4;
        this.LJLLI = c47061t02;
    }
}
