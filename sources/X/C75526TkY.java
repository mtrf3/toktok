package X;

import Y.ALAdapterS10S0200000_13;
import Y.AUListenerS79S0300000_13;
import Y.AfS22S1200000_13;
import Y.AfS62S0200000_13;
import android.animation.ValueAnimator;
import android.graphics.drawable.Animatable;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.TkY, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75526TkY extends C31073CHl {
    public final /* synthetic */ C75525TkX LJLJL;
    public final /* synthetic */ EnumC75445TjF LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ C47061t0 LJLL;
    public final /* synthetic */ C2A4 LJLLI;
    public final /* synthetic */ C68322mC<InterfaceC92693kP> LJLLILLLL;
    public final /* synthetic */ C47061t0 LJLLJ;

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, O] */
    @Override // X.C31073CHl
    public final void LJI(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        DataChannel dataChannel = this.LJLJL.LLFZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74968TbY.class)).LIZ = Boolean.TRUE;
        }
        this.LJLJL.LLF = (C73411SrX) AbstractC73672Svk.LJJLIIIJLJLI(8L, TimeUnit.SECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS22S1200000_13((Object) this.LJLJL, (AbstractC74705TTp) this.LJLJLJ, (InterfaceC88472Yns<? super InterfaceC60987Nwd<LinkPlayerInfo, MultiLiveGuestInfoList>, C76800UCe>) this.LJLJLLL, (String) 8));
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [T, X.3kP] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Boolean, O] */
    @Override // X.C31073CHl
    public final void LJII(Animatable anim) {
        o.LJIIIZ(anim, "anim");
        C87277YNd.LJJIIZI(this.LJLL);
        C87277YNd.LJJIIZI(this.LJLLI);
        C2A4 c2a4 = this.LJLJL.LJLJL;
        if (c2a4 != null) {
            C87277YNd.LJJIJ(c2a4);
        }
        if (EnumC75445TjF.FRIEND_RESERVE == this.LJLJLJ) {
            long j = C75893TqT.LIZLLL;
            if (j > 0) {
                C75525TkX c75525TkX = this.LJLJL;
                C47121t6 c47121t6 = c75525TkX.LJLLLL;
                if (c47121t6 != null) {
                    c47121t6.setText(String.valueOf(j));
                }
                C47121t6 c47121t62 = c75525TkX.LJLLLL;
                if (c47121t62 != null) {
                    c47121t62.setVisibility(0);
                }
            }
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        C47061t0 c47061t0 = this.LJLLJ;
        C47061t0 c47061t02 = this.LJLL;
        C75525TkX c75525TkX2 = this.LJLJL;
        ofFloat.setRepeatCount(0);
        ofFloat.setDuration(200L);
        ofFloat.addUpdateListener(new AUListenerS79S0300000_13(c47061t0, c47061t02, c75525TkX2, 2));
        ofFloat.addListener(new ALAdapterS10S0200000_13(c47061t0, c47061t02, 17));
        ofFloat.start();
        this.LJLLILLLL.element = AbstractC73672Svk.LJJLIIIJLJLI(150L, TimeUnit.MILLISECONDS).LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS62S0200000_13(this.LJLJL, this.LJLLILLLL, 59));
        DataChannel dataChannel = this.LJLJL.LLFZ;
        if (dataChannel != null) {
            ((C32537Cpp) dataChannel.gv0(C74968TbY.class)).LIZ = Boolean.FALSE;
        }
    }

    public C75526TkY(C75525TkX c75525TkX, EnumC75445TjF enumC75445TjF, String str, C47061t0 c47061t0, C2A4 c2a4, C68322mC<InterfaceC92693kP> c68322mC, C47061t0 c47061t02) {
        this.LJLJL = c75525TkX;
        this.LJLJLJ = enumC75445TjF;
        this.LJLJLLL = str;
        this.LJLL = c47061t0;
        this.LJLLI = c2a4;
        this.LJLLILLLL = c68322mC;
        this.LJLLJ = c47061t02;
    }
}
