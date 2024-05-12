package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.BA9;
import X.BAF;
import X.BZI;
import X.C12890ez;
import X.C15380j0;
import X.C15540jG;
import X.C1XG;
import X.C28787BRn;
import X.C29306Beo;
import X.C29927Bop;
import X.C30079BrH;
import X.C47061t0;
import X.C47121t6;
import X.C48459J0d;
import X.CFX;
import X.CN1;
import X.CR6;
import X.EnumC31509CYf;
import X.InterfaceC08080Tk;
import X.InterfaceC30442Bx8;
import Y.ALAdapterS4S0100000_5;
import Y.AUListenerS94S0100000_5;
import android.animation.ValueAnimator;
import android.view.View;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCancelWhenNotStartEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessExitGameEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessFreelyStartChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessIsCountingDownRoundStart;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessGameLoadedEvent;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.model.message.DrawGuessEndMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessExitMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessStartMessage;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS171S0100000_5;
import kotlin.jvm.internal.o;

/* loaded from: classes6.dex */
public final class DrawGuessCanvasWidget extends LiveRecyclableWidget implements OnMessageListener {
    public C47121t6 LJLIL;
    public C47121t6 LJLILLLLZI;
    public C47061t0 LJLJI;
    public IMessageManager LJLJJI;
    public BA9 LJLJJL;
    public int LJLJJLL;
    public boolean LJLJL;
    public C15540jG LJLJLJ;
    public DrawGuessWord LJLJLLL;
    public boolean LJLL;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d1z;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final void LJZI() {
        if (C29306Beo.LJIIL(this.dataChannel)) {
            return;
        }
        InterfaceC08080Tk liveGameEffectHelper = ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
        DataChannel dataChannel = this.dataChannel;
        liveGameEffectHelper.getClass();
        LiveEffect LIZIZ = C1XG.LIZIZ(dataChannel);
        if (LIZIZ != null) {
            C12890ez.LIZ().LIZIZ(LIZIZ, "livegame");
            this.dataChannel.pv0(DrawGuessGameLoadedEvent.class);
        }
    }

    public final void LLF() {
        BA9 ba9;
        if (this.LJLJJL == null) {
            this.LJLJJL = new BA9(this);
        }
        if (this.LJLJL && (ba9 = this.LJLJJL) != null) {
            ba9.cancel();
        }
        LJZI();
        C47121t6 c47121t6 = this.LJLILLLLZI;
        if (c47121t6 != null) {
            c47121t6.setText(CardStruct.IStatusCode.DEFAULT);
            LLFF();
            View[] viewArr = new View[2];
            C47121t6 c47121t62 = this.LJLILLLLZI;
            if (c47121t62 != null) {
                viewArr[0] = c47121t62;
                C47121t6 c47121t63 = this.LJLIL;
                if (c47121t63 != null) {
                    viewArr[1] = c47121t63;
                    LJLZ(viewArr);
                    LL(false);
                    BA9 ba92 = this.LJLJJL;
                    if (ba92 != null) {
                        ba92.start();
                    }
                    this.LJLJL = true;
                    return;
                }
                o.LJIJI("drawWordTextView");
                throw null;
            }
            o.LJIJI("countdownTextView");
            throw null;
        }
        o.LJIJI("countdownTextView");
        throw null;
    }

    public final void LLFF() {
        String str;
        DrawGuessWord drawGuessWord;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            C47121t6 c47121t6 = this.LJLIL;
            if (c47121t6 != null) {
                C29306Beo.LJJLJLI(c47121t6);
                C47121t6 c47121t62 = this.LJLILLLLZI;
                if (c47121t62 != null) {
                    C29306Beo.LJJLJLI(c47121t62);
                    C47061t0 c47061t0 = this.LJLJI;
                    if (c47061t0 != null) {
                        C29306Beo.LJJLJLI(c47061t0);
                        C47121t6 c47121t63 = this.LJLILLLLZI;
                        if (c47121t63 != null) {
                            c47121t63.setText("3");
                            DataChannel dataChannel = this.dataChannel;
                            if (dataChannel == null || (drawGuessWord = (DrawGuessWord) dataChannel.kv0(DrawGuessCurrentWordChannel.class)) == null || (str = drawGuessWord.word) == null) {
                                str = "";
                            }
                            C47121t6 c47121t64 = this.LJLIL;
                            if (c47121t64 != null) {
                                c47121t64.setText(C15380j0.LJIILL(R.string.ku2, str));
                                return;
                            } else {
                                o.LJIJI("drawWordTextView");
                                throw null;
                            }
                        }
                        o.LJIJI("countdownTextView");
                        throw null;
                    }
                    o.LJIJI("guideView");
                    throw null;
                }
                o.LJIJI("countdownTextView");
                throw null;
            }
            o.LJIJI("drawWordTextView");
            throw null;
        }
        int i = this.LJLJJLL;
        if (i == 2) {
            BA9 ba9 = this.LJLJJL;
            if (ba9 != null) {
                ba9.cancel();
            }
            C47121t6 c47121t65 = this.LJLIL;
            if (c47121t65 != null) {
                c47121t65.setText(C15380j0.LJIILJJIL(R.string.ku1));
                C47121t6 c47121t66 = this.LJLILLLLZI;
                if (c47121t66 != null) {
                    C29306Beo.LJI(c47121t66);
                    View[] viewArr = new View[1];
                    C47121t6 c47121t67 = this.LJLIL;
                    if (c47121t67 != null) {
                        viewArr[0] = c47121t67;
                        LJLZ(viewArr);
                        return;
                    } else {
                        o.LJIJI("drawWordTextView");
                        throw null;
                    }
                }
                o.LJIJI("countdownTextView");
                throw null;
            }
            o.LJIJI("drawWordTextView");
            throw null;
        }
        if (this.LJLJL) {
            C47121t6 c47121t68 = this.LJLIL;
            if (c47121t68 != null) {
                C29306Beo.LJJLJLI(c47121t68);
                C47121t6 c47121t69 = this.LJLIL;
                if (c47121t69 != null) {
                    c47121t69.setText(R.string.ktt);
                    return;
                } else {
                    o.LJIJI("drawWordTextView");
                    throw null;
                }
            }
            o.LJIJI("drawWordTextView");
            throw null;
        }
        if (i == 1) {
            C47121t6 c47121t610 = this.LJLIL;
            if (c47121t610 != null) {
                c47121t610.setText(C15380j0.LJIILJJIL(R.string.kt8));
                View[] viewArr2 = new View[1];
                C47121t6 c47121t611 = this.LJLIL;
                if (c47121t611 != null) {
                    viewArr2[0] = c47121t611;
                    LJLZ(viewArr2);
                    return;
                } else {
                    o.LJIJI("drawWordTextView");
                    throw null;
                }
            }
            o.LJIJI("drawWordTextView");
            throw null;
        }
        C47121t6 c47121t612 = this.LJLIL;
        if (c47121t612 != null) {
            C29306Beo.LJI(c47121t612);
        } else {
            o.LJIJI("drawWordTextView");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        BA9 ba9 = this.LJLJJL;
        if (ba9 != null) {
            ba9.cancel();
        }
        this.LJLJJL = null;
        IMessageManager iMessageManager = this.LJLJJI;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            this.LJLJJI = null;
            this.LJLJJL = null;
            this.LJLJJLL = 0;
            this.LJLJL = false;
            this.LJLJLJ = null;
            this.LJLJLLL = null;
            this.LJLL = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (kotlin.jvm.internal.o.LIZJ(r1, 1.0f) == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJLZ(android.view.View... r4) {
        /*
            r3 = this;
            android.view.View r0 = r3.getView()
            boolean r0 = X.C29306Beo.LJJIIJ(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.C29306Beo.LJIILLIIL(r0)
            if (r0 != 0) goto L28
            android.view.View r0 = r3.getView()
            if (r0 == 0) goto L52
            float r0 = r0.getAlpha()
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L20:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = kotlin.jvm.internal.o.LIZJ(r1, r0)
            if (r0 != 0) goto L2b
        L28:
            r3.show()
        L2b:
            r0 = 2
            float[] r0 = new float[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [0, 1065353216} // fill-array
            android.animation.ValueAnimator r2 = android.animation.ValueAnimator.ofFloat(r0)
            r0 = 120(0x78, double:5.93E-322)
            r2.setDuration(r0)
            Y.AUListenerS94S0100000_5 r1 = new Y.AUListenerS94S0100000_5
            r0 = 13
            r1.<init>(r4, r0)
            r2.addUpdateListener(r1)
            Y.ALAdapterS4S0100000_5 r1 = new Y.ALAdapterS4S0100000_5
            r0 = 27
            r1.<init>(r4, r0)
            r2.addListener(r1)
            r2.start()
            return
        L52:
            r1 = 0
            goto L20
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessCanvasWidget.LJLZ(android.view.View[]):void");
    }

    public final void LJZL(DrawGuessStartMessage drawGuessStartMessage) {
        if (C29306Beo.LJIIJ(this.dataChannel) || drawGuessStartMessage.data.pictionaryType == 2) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessIsCountingDownRoundStart.class, Boolean.TRUE);
        }
        this.LJLJJLL = 0;
        LLF();
        LLFF();
    }

    public final void LL(boolean z) {
        float f;
        Long l;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            C48459J0d<Boolean> c48459J0d = InterfaceC30442Bx8.LJJLL;
            Boolean LIZJ = c48459J0d.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_DRAW_GUESS_FIRST_TIME_SHOW_DRAW_GUIDE.value");
            if (LIZJ.booleanValue()) {
                c48459J0d.LIZ(Boolean.FALSE);
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null && (l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class)) != null) {
                    long longValue = l.longValue();
                    Long l2 = (Long) this.dataChannel.kv0(DrawGuessRoundIdChannel.class);
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        BZI LIZ = C28787BRn.LIZ("livesdk_anchor_pictionary_gesture_show");
                        LIZ.LJIILLIIL(this.dataChannel);
                        LIZ.LJIJJ(Long.valueOf(longValue), "pictionary_session_id");
                        LIZ.LJIJJ(Long.valueOf(longValue2), "pictionary_id");
                        LIZ.LJJIIJZLJL();
                    }
                }
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    if (z) {
                        f = 280.0f;
                    } else {
                        f = 8.0f;
                    }
                    C29306Beo.LJJLIIIJILLIZJL(C15380j0.LIZ(f), c47061t0);
                    C47061t0 c47061t02 = this.LJLJI;
                    if (c47061t02 != null) {
                        c47061t02.setAlpha(0.0f);
                        C47061t0 c47061t03 = this.LJLJI;
                        if (c47061t03 != null) {
                            C29306Beo.LJJLJLI(c47061t03);
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.setStartDelay(1000L);
                            ofFloat.setDuration(120L);
                            ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 15));
                            ofFloat.addListener(new ALAdapterS4S0100000_5(this, 28));
                            ofFloat.start();
                            View[] viewArr = new View[1];
                            C47061t0 c47061t04 = this.LJLJI;
                            if (c47061t04 != null) {
                                viewArr[0] = c47061t04;
                                LJZ(3000L, viewArr);
                                return;
                            } else {
                                o.LJIJI("guideView");
                                throw null;
                            }
                        }
                        o.LJIJI("guideView");
                        throw null;
                    }
                    o.LJIJI("guideView");
                    throw null;
                }
                o.LJIJI("guideView");
                throw null;
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.ip5);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.ready_to_draw_word_tv)");
        this.LJLIL = (C47121t6) findViewById;
        View findViewById2 = findViewById(R.id.bwf);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.countdown_tv)");
        this.LJLILLLLZI = (C47121t6) findViewById2;
        View findViewById3 = findViewById(R.id.ch7);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.draw_guess_guide_view)");
        this.LJLJI = (C47061t0) findViewById3;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onLoad(Object[] objArr) {
        IMessageManager iMessageManager;
        Object obj;
        CR6 cr6;
        hide();
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.kv0(C29927Bop.class)) != null) {
            iMessageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_START_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_EXIT_MESSAGE.getIntType(), this);
            iMessageManager.addMessageListener(EnumC31509CYf.DRAW_GUESS_END_MESSAGE.getIntType(), this);
        } else {
            iMessageManager = null;
        }
        this.LJLJJI = iMessageManager;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            Boolean LIZJ = InterfaceC30442Bx8.LJJLL.LIZJ();
            o.LJIIIIZZ(LIZJ, "LIVE_DRAW_GUESS_FIRST_TIME_SHOW_DRAW_GUIDE.value");
            if (LIZJ.booleanValue()) {
                C47061t0 c47061t0 = this.LJLJI;
                if (c47061t0 != null) {
                    C29306Beo.LJI(c47061t0);
                    C15540jG c15540jG = new C15540jG();
                    c15540jG.LIZJ = "ttlive_draw_guess_guide.webp";
                    c15540jG.LJFF = false;
                    c15540jG.LIZIZ = CFX.LIZ("tiktok_live_broadcast_resource", "tiktok_live_broadcast_demand_1");
                    C47061t0 c47061t02 = this.LJLJI;
                    if (c47061t02 != null) {
                        c15540jG.LIZ = c47061t02;
                        this.LJLJLJ = c15540jG;
                        c15540jG.LIZIZ();
                    } else {
                        o.LJIJI("guideView");
                        throw null;
                    }
                } else {
                    o.LJIJI("guideView");
                    throw null;
                }
            }
        }
        if (C29306Beo.LJIIL(this.dataChannel)) {
            this.dataChannel.lv0(this, DrawGuessExitGameEvent.class, new AqS171S0100000_5(this, 414));
        } else {
            DataChannel dataChannel2 = this.dataChannel;
            dataChannel2.lv0(this, DrawGuessIsCountingDownRoundStart.class, new AqS171S0100000_5(this, 415));
            dataChannel2.lv0(this, DrawGuessFreelyStartChannel.class, new AqS171S0100000_5(this, 416));
            dataChannel2.lv0(this, DrawGuessCancelWhenNotStartEvent.class, new AqS171S0100000_5(this, 417));
        }
        if (objArr != null) {
            for (Object obj2 : objArr) {
                if ((obj2 instanceof C30079BrH) && ((obj = ((C30079BrH) obj2).LIZ) == null || (obj instanceof IMessage))) {
                    if (!(obj instanceof CR6) || (cr6 = (CR6) obj) == null) {
                        return;
                    } else {
                        LJZL((DrawGuessStartMessage) cr6);
                    }
                }
            }
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CR6 cr6;
        if (!(iMessage instanceof CR6) || (cr6 = (CR6) iMessage) == null) {
            return;
        }
        if (cr6 instanceof DrawGuessStartMessage) {
            LJZL((DrawGuessStartMessage) cr6);
            return;
        }
        if (cr6 instanceof DrawGuessExitMessage) {
            this.LJLJJLL = 0;
            BA9 ba9 = this.LJLJJL;
            if (ba9 != null) {
                ba9.cancel();
            }
            hide();
            return;
        }
        if (!(cr6 instanceof DrawGuessEndMessage)) {
            return;
        }
        if (((DrawGuessEndMessage) cr6).endType == 4) {
            if (!C29306Beo.LJIIL(this.dataChannel)) {
                return;
            }
            this.LJLJJLL = 2;
            LLFF();
            return;
        }
        Long LJIJJ = BAF.LJIJJ(this.dataChannel);
        if (LJIJJ == null || LJIJJ.longValue() != 0) {
            this.LJLJJLL = 1;
            LLFF();
            return;
        }
        this.LJLJJLL = 0;
        BA9 ba92 = this.LJLJJL;
        if (ba92 != null) {
            ba92.cancel();
        }
        hide();
    }

    public static void LJZ(long j, View... viewArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat.setStartDelay(j);
        ofFloat.setDuration(120L);
        ofFloat.addUpdateListener(new AUListenerS94S0100000_5(viewArr, 14));
        ofFloat.start();
    }
}
