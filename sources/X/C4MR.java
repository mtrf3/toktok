package X;

import Y.ACListenerS21S0100000_1;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveChatShowDelayForHotLiveSetting;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.emoji.model.Emoji;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.SayHelloContent;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.4MR, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4MR extends C4MP {
    public final InterfaceC65784Pro<C76800UCe> LJIIJ;
    public TuxTextView LJIIJJI;
    public View LJIIL;
    public View LJIILIIL;
    public View LJIILJJIL;
    public View LJIILL;
    public C62846OlW LJIILLIIL;
    public Animation LJIIZILJ;
    public final C4MU LJIJ;

    @Override // X.C4MP
    public final List<Emoji> LJ() {
        List<Emoji> emojiList;
        SayHelloContent sayHelloContent = this.LJ;
        if (sayHelloContent == null || (emojiList = sayHelloContent.getEmojiList()) == null) {
            return C61878OQg.INSTANCE;
        }
        return emojiList;
    }

    @Override // X.C4MP
    public final void LJI() {
        long j;
        super.LJI();
        TuxTextView tuxTextView = (TuxTextView) LIZLLL(R.id.cuu);
        this.LJIIJJI = tuxTextView;
        if (C3U6.LIZ) {
            tuxTextView.setText("👋");
            TuxTextView tuxTextView2 = this.LJIIJJI;
            if (tuxTextView2 != null) {
                tuxTextView2.LJJJ(80.0f);
                TuxTextView tuxTextView3 = this.LJIIJJI;
                if (tuxTextView3 != null) {
                    tuxTextView3.setGravity(16);
                    int i = 0;
                    List LJJIJIIJI = C47261Igj.LJJIJIIJI(Float.valueOf(36.0f), Float.valueOf(-28.0f), Float.valueOf(25.0f), Float.valueOf(-15.0f), Float.valueOf(7.0f), Float.valueOf(-2.0f), Float.valueOf(-23.0f));
                    AnimationSet animationSet = new AnimationSet(false);
                    for (Object obj : LJJIJIIJI) {
                        int i2 = i + 1;
                        if (i >= 0) {
                            RotateAnimation rotateAnimation = new RotateAnimation(0.0f, ((Number) obj).floatValue(), 1, 0.8f, 1, 0.8f);
                            rotateAnimation.setDuration(200L);
                            rotateAnimation.setFillAfter(true);
                            rotateAnimation.setInterpolator(C18950ol.LIZIZ(0.42f, 0.0f, 0.52f, 1.0f));
                            if (i == LJJIJIIJI.size() - 1) {
                                j = 500;
                            } else {
                                j = 0;
                            }
                            rotateAnimation.setStartOffset((i * 200) + j);
                            animationSet.addAnimation(rotateAnimation);
                            i = i2;
                        } else {
                            C47261Igj.LJJJJJ();
                            throw null;
                        }
                    }
                    TuxTextView tuxTextView4 = this.LJIIJJI;
                    if (tuxTextView4 != null) {
                        tuxTextView4.startAnimation(animationSet);
                        TuxTextView tuxTextView5 = this.LJIIJJI;
                        if (tuxTextView5 != null) {
                            C16880lQ.LJJJJI(tuxTextView5, new ACListenerS21S0100000_1(this, 157));
                            return;
                        } else {
                            o.LJIJI("emojiView");
                            throw null;
                        }
                    }
                    o.LJIJI("emojiView");
                    throw null;
                }
                o.LJIJI("emojiView");
                throw null;
            }
            o.LJIJI("emojiView");
            throw null;
        }
        this.LJIIL = LIZLLL(R.id.fjx);
        this.LJIILJJIL = LIZLLL(R.id.g7v);
        this.LJIILIIL = LIZLLL(R.id.euw);
        this.LJIILL = LIZLLL(R.id.euv);
        this.LJIILLIIL = (C62846OlW) LIZLLL(R.id.bsx);
        RotateAnimation rotateAnimation2 = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
        rotateAnimation2.setDuration(LiveChatShowDelayForHotLiveSetting.DEFAULT);
        rotateAnimation2.setFillAfter(true);
        rotateAnimation2.setInterpolator(new LinearInterpolator());
        rotateAnimation2.setRepeatMode(1);
        rotateAnimation2.setRepeatCount(-1);
        rotateAnimation2.setAnimationListener(null);
        this.LJIIZILJ = rotateAnimation2;
        View view = this.LJIILJJIL;
        if (view != null) {
            view.startAnimation(rotateAnimation2);
            View view2 = this.LJIILIIL;
            if (view2 != null) {
                C16880lQ.LJIIJ(new ACListenerS21S0100000_1(this, 158), view2);
                C62846OlW c62846OlW = this.LJIILLIIL;
                if (c62846OlW != null) {
                    C16880lQ.LJJJJJL(c62846OlW, new ACListenerS21S0100000_1(this, 159));
                    return;
                } else {
                    o.LJIJI("emojiIvThird");
                    throw null;
                }
            }
            o.LJIJI("reloadLayout");
            throw null;
        }
        o.LJIJI("loadingIv");
        throw null;
    }

    public final void LJII() {
        if (!C3U6.LIZ && (!LJ().isEmpty())) {
            C62846OlW c62846OlW = this.LJIILLIIL;
            if (c62846OlW != null) {
                C4AS.LIZIZ(c62846OlW, ((Emoji) ListProtector.get(LJ(), 0)).getAnimateUrl(), "SayHiNoticeDelegate", 0, 0, 0, 0, this.LJIJ, 248);
            } else {
                o.LJIJI("emojiIvThird");
                throw null;
            }
        }
    }

    @Override // X.C4MP
    public final void LIZIZ() {
        String str;
        String str2;
        String str3;
        super.LIZIZ();
        C76662ze c76662ze = C76662ze.LJLIL;
        C109544Rq c109544Rq = this.LIZLLL;
        if (c109544Rq != null) {
            str = c109544Rq.getConversationId();
        } else {
            str = null;
        }
        c76662ze.getClass();
        if (C76662ze.LJIIIZ().containsKey(str)) {
            str2 = "recommended_chat";
        } else {
            str2 = "ice_breaking_say_hi";
        }
        C109544Rq c109544Rq2 = this.LIZLLL;
        if (c109544Rq2 != null) {
            str3 = c109544Rq2.getConversationId();
        } else {
            str3 = null;
        }
        XKX.LIZLLL(C89353f1.LIZ, null, null, new C65932iL(1, str2, str3, null), 3);
    }

    @Override // X.C4MP
    public final void LIZJ(boolean z) {
        View view;
        int i;
        if (C3U6.LIZ) {
            view = this.LJIIJJI;
            if (view == null) {
                o.LJIJI("emojiView");
                throw null;
            }
        } else {
            view = this.LJIIL;
            if (view == null) {
                o.LJIJI("rootLayout");
                throw null;
            }
        }
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
        if (!z) {
            this.LIZ.dismiss();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [X.4MU] */
    public C4MR(AnonymousClass465 parent, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(parent);
        o.LJIIIZ(parent, "parent");
        this.LJIIJ = interfaceC65784Pro;
        this.LJIJ = new InterfaceC81853WAn() { // from class: X.4MU
            public int LIZ;
            public int LIZIZ;

            @Override // X.InterfaceC81853WAn
            public final void LIZJ(String str) {
            }

            @Override // X.InterfaceC81853WAn
            public final boolean LIZLLL() {
                return true;
            }

            public final void LJ() {
                if (this.LIZIZ == 1) {
                    View view = C4MR.this.LJIILJJIL;
                    if (view != null) {
                        view.setVisibility(8);
                        View view2 = C4MR.this.LJIILJJIL;
                        if (view2 != null) {
                            Animation animation = view2.getAnimation();
                            if (animation != null) {
                                animation.cancel();
                            }
                            view2.clearAnimation();
                            if (this.LIZ != this.LIZIZ) {
                                View view3 = C4MR.this.LJIILL;
                                if (view3 != null) {
                                    view3.setVisibility(8);
                                    View view4 = C4MR.this.LJIILIIL;
                                    if (view4 != null) {
                                        view4.setVisibility(0);
                                    } else {
                                        o.LJIJI("reloadLayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("emojiLayout");
                                    throw null;
                                }
                            } else {
                                View view5 = C4MR.this.LJIILL;
                                if (view5 != null) {
                                    view5.setVisibility(0);
                                    View view6 = C4MR.this.LJIILIIL;
                                    if (view6 != null) {
                                        view6.setVisibility(8);
                                    } else {
                                        o.LJIJI("reloadLayout");
                                        throw null;
                                    }
                                } else {
                                    o.LJIJI("emojiLayout");
                                    throw null;
                                }
                            }
                            this.LIZIZ = 0;
                            this.LIZ = 0;
                            return;
                        }
                        o.LJIJI("loadingIv");
                        throw null;
                    }
                    o.LJIJI("loadingIv");
                    throw null;
                }
            }

            @Override // X.InterfaceC81853WAn
            public final void LIZIZ(String str, Throwable th) {
                this.LIZIZ++;
                LJ();
            }

            @Override // X.InterfaceC81853WAn
            public final void LIZ(String str, InterfaceC81599W0t interfaceC81599W0t, Animatable animatable) {
                this.LIZIZ++;
                this.LIZ++;
                LJ();
            }
        };
    }

    @Override // X.C4MP
    public final void LIZ(C109544Rq msg, C109544Rq c109544Rq, SayHelloContent content, int i, boolean z, String str) {
        o.LJIIIZ(msg, "msg");
        o.LJIIIZ(content, "content");
        super.LIZ(msg, c109544Rq, content, i, z, str);
        boolean z2 = true;
        if (!C3U6.LIZ && LJ().isEmpty()) {
            z2 = false;
        }
        LIZJ(z2);
        LJII();
    }
}
