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

/* renamed from: X.TeN, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75143TeN extends C31073CHl {
    public final /* synthetic */ C74893TaL LJLJL;
    public final /* synthetic */ User LJLJLJ;
    public final /* synthetic */ C47061t0 LJLJLLL;
    public final /* synthetic */ C2A4 LJLL;
    public final /* synthetic */ C47061t0 LJLLI;

    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Boolean, O] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.String, O] */
    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        boolean z;
        o.LJIIIZ(anim, "anim");
        C74893TaL c74893TaL = this.LJLJL;
        System.currentTimeMillis();
        c74893TaL.getClass();
        this.LJLJL.getClass();
        DataChannel dataChannel = this.LJLJL.LJLL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74966TbW.class)).LIZ = this.LJLJLJ.getIdStr();
        }
        DataChannel dataChannel2 = this.LJLJL.LJLL;
        if (dataChannel2 != null) {
            ((C32537Cpp) dataChannel2.gv0(C75503TkB.class)).LIZ = Boolean.TRUE;
        }
        this.LJLJL.LJLZ = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(60L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS65S0100000_13(this.LJLJL, 236));
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
        C74893TaL c74893TaL = this.LJLJL;
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c74893TaL, 7));
        ofFloat.addListener(new ALAdapterS10S0200000_13(c47061t0, c47061t02, 25));
        ofFloat.start();
        DataChannel dataChannel = this.LJLJL.LJLL;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C75503TkB.class)).LIZ = Boolean.FALSE;
        }
    }

    public C75143TeN(C74893TaL c74893TaL, User user, C47061t0 c47061t0, C2A4 c2a4, C47061t0 c47061t02) {
        this.LJLJL = c74893TaL;
        this.LJLJLJ = user;
        this.LJLJLLL = c47061t0;
        this.LJLL = c2a4;
        this.LJLLI = c47061t02;
    }
}
