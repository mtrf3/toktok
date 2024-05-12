package com.bytedance.android.livesdk.interaction.drawguess.ui;

import X.B73;
import X.BAF;
import X.BAU;
import X.C0F0;
import X.C0GA;
import X.C10640bM;
import X.C15380j0;
import X.C1Q4;
import X.C1XG;
import X.C23010vJ;
import X.C259910h;
import X.C28400BCq;
import X.C29306Beo;
import X.C30725C4b;
import X.C32537Cpp;
import X.C47121t6;
import X.C78842Uww;
import X.CCJ;
import X.CN1;
import X.CR6;
import X.UIW;
import X.V0Q;
import X.X1D;
import Y.ALAdapterS3S0300000_5;
import Y.ALAdapterS4S0100000_5;
import Y.ARunnableS24S0200000_5;
import Y.AUListenerS94S0100000_5;
import Y.AUListenerS97S0200000_5;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundEndEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.livesdk.dataChannel.DrawGuessStatusVisibilityChannel;
import com.bytedance.android.livesdk.interaction.drawguess.DrawGuessCurrentWordChannel;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveDrawGuessRequestSummaryDelaySetting;
import com.bytedance.android.livesdk.model.message.DrawGuessEndMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessExitMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessStartMessage;
import com.bytedance.android.livesdk.model.message.DrawGuessUpdateMessage;
import com.bytedance.android.livesdk.model.message.PictionaryInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.LiveRecyclableWidget;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import com.zhiliaoapp.musically.R;
import defpackage.b1;
import defpackage.i0;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes6.dex */
public final class DrawGuessStatusWidget extends LiveRecyclableWidget implements OnMessageListener {
    public View LJLIL;
    public View LJLILLLLZI;
    public C47121t6 LJLJI;
    public C47121t6 LJLJJI;
    public C47121t6 LJLJJL;
    public C47121t6 LJLJJLL;
    public IMessageManager LJLJL;
    public BAU LJLJLJ;
    public String LJLJLLL;
    public boolean LJLL;
    public int LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public boolean LJLLL;
    public boolean LJLLLL;
    public boolean LJLLLLLL = true;

    @Override // com.bytedance.android.widget.Widget
    public final int getLayoutId() {
        return R.layout.d20;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget, androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        super.onStateChanged(lifecycleOwner, event);
    }

    public final String LLF() {
        String str;
        if (C29306Beo.LJIIJ(this.dataChannel)) {
            DrawGuessWord drawGuessWord = (DrawGuessWord) this.dataChannel.kv0(DrawGuessCurrentWordChannel.class);
            if (drawGuessWord == null || (str = drawGuessWord.word) == null) {
                return "";
            }
            return str;
        }
        return this.LJLJLLL;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Integer, O] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Integer, O] */
    public final void LLIIIILZ() {
        boolean z = this.LJLL;
        if (z) {
            this.LJLL = false;
            if (BAF.LJIIIIZZ(this.dataChannel)) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    ((C32537Cpp) dataChannel.gv0(C28400BCq.class)).LIZ = 9;
                }
            } else {
                DataChannel dataChannel2 = this.dataChannel;
                if (dataChannel2 != null) {
                    ((C32537Cpp) dataChannel2.gv0(C28400BCq.class)).LIZ = 1;
                }
            }
            DataChannel dataChannel3 = this.dataChannel;
            if (dataChannel3 != null) {
                dataChannel3.pv0(DrawGuessRoundEndEvent.class);
            }
            BAF.LJIL(this.dataChannel);
            BAU bau = this.LJLJLJ;
            if (bau != null) {
                bau.cancel();
            }
        }
        if (LLF() != null) {
            if (!C29306Beo.LJIIJ(this.dataChannel) || z) {
                LLIIIJ(this);
            }
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void hide() {
        BAU bau = this.LJLJLJ;
        if (bau != null) {
            bau.cancel();
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessStatusVisibilityChannel.class, Boolean.FALSE);
        }
        View view = getView();
        if (view != null) {
            if (view.getAlpha() == 0.0f) {
                super.hide();
                return;
            }
            ViewPropertyAnimator animate = view.animate();
            animate.alpha(0.0f);
            animate.setDuration(120L);
            animate.setListener(new ALAdapterS4S0100000_5(this, 29));
            animate.start();
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget
    public final boolean needRecycle() {
        return EnableRecycleSingleWidgetSetting.INSTANCE.getValue();
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onUnload() {
        BAU bau = this.LJLJLJ;
        if (bau != null) {
            bau.cancel();
        }
        this.LJLJLJ = null;
        IMessageManager iMessageManager = this.LJLJL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        DataChannel dataChannel = this.dataChannel;
        dataChannel.getClass();
        dataChannel.jv0(this);
        if (BAF.LJFF(this.dataChannel)) {
            ((IEffectService) CN1.LIZ(IEffectService.class)).getLiveGameEffectHelper();
            C1XG.LIZJ();
        }
        if (LiveRecycleWidgetV2Setting.INSTANCE.getValue()) {
            View view = getView();
            if (view != null) {
                view.setAlpha(1.0f);
            }
            C47121t6 c47121t6 = this.LJLJJLL;
            if (c47121t6 != null) {
                C29306Beo.LJI(c47121t6);
                C47121t6 c47121t62 = this.LJLJJI;
                if (c47121t62 != null) {
                    C29306Beo.LJI(c47121t62);
                    this.LJLJLLL = null;
                    this.LJLL = false;
                    this.LJLLI = 0;
                    this.LJLLILLLL = false;
                    this.LJLLJ = false;
                    this.LJLLL = false;
                    this.LJLLLL = false;
                    this.LJLLLLLL = true;
                    C47121t6 c47121t63 = this.LJLJI;
                    if (c47121t63 != null) {
                        c47121t63.setText("");
                        C47121t6 c47121t64 = this.LJLJJI;
                        if (c47121t64 != null) {
                            c47121t64.setText("");
                            C47121t6 c47121t65 = this.LJLJJLL;
                            if (c47121t65 != null) {
                                c47121t65.setText("");
                                C47121t6 c47121t66 = this.LJLJJL;
                                if (c47121t66 != null) {
                                    c47121t66.setText("");
                                    return;
                                } else {
                                    o.LJIJI("hasCorrectGuessesTextView");
                                    throw null;
                                }
                            }
                            o.LJIJI("gameResultTextView");
                            throw null;
                        }
                        o.LJIJI("messageContentTextView");
                        throw null;
                    }
                    o.LJIJI("countDownTextView");
                    throw null;
                }
                o.LJIJI("messageContentTextView");
                throw null;
            }
            o.LJIJI("gameResultTextView");
            throw null;
        }
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveWidget, com.bytedance.android.widget.Widget
    public final void show() {
        Animation animation;
        if (!this.LJLLLLLL) {
            return;
        }
        View view = getView();
        if (view != null && (animation = view.getAnimation()) != null && animation.hasStarted()) {
            return;
        }
        DataChannel dataChannel = this.dataChannel;
        if (dataChannel != null) {
            dataChannel.rv0(DrawGuessStatusVisibilityChannel.class, Boolean.TRUE);
        }
        View view2 = getView();
        if (view2 != null) {
            if (view2.getAlpha() == 1.0f) {
                super.show();
                return;
            }
            ViewPropertyAnimator animate = view2.animate();
            animate.alpha(1.0f);
            animate.setDuration(120L);
            animate.setListener(new ALAdapterS4S0100000_5(this, 30));
            animate.start();
        }
    }

    public final void LLII() {
        hide();
        this.LJLLL = false;
        this.LJLLLL = false;
        this.LJLL = false;
        BAU bau = this.LJLJLJ;
        if (bau != null) {
            bau.cancel();
        }
        this.LJLLI = 0;
        this.LJLJLLL = null;
        this.LJLLILLLL = false;
        C47121t6 c47121t6 = this.LJLJJLL;
        if (c47121t6 != null) {
            C29306Beo.LJI(c47121t6);
            C47121t6 c47121t62 = this.LJLJJLL;
            if (c47121t62 != null) {
                c47121t62.setBackground(C15380j0.LJI(R.drawable.cqd));
                View view = this.LJLIL;
                if (view != null) {
                    view.setAlpha(1.0f);
                    View view2 = this.LJLIL;
                    if (view2 != null) {
                        C29306Beo.LJJLJLI(view2);
                        C47121t6 c47121t63 = this.LJLJJI;
                        if (c47121t63 != null) {
                            c47121t63.setAlpha(1.0f);
                            C47121t6 c47121t64 = this.LJLJJI;
                            if (c47121t64 != null) {
                                C29306Beo.LJJLJLI(c47121t64);
                                View view3 = this.LJLILLLLZI;
                                if (view3 != null) {
                                    C29306Beo.LJI(view3);
                                    return;
                                } else {
                                    o.LJIJI("hasCorrectGuessesContainer");
                                    throw null;
                                }
                            }
                            o.LJIJI("messageContentTextView");
                            throw null;
                        }
                        o.LJIJI("messageContentTextView");
                        throw null;
                    }
                    o.LJIJI("duringGameStatusContainer");
                    throw null;
                }
                o.LJIJI("duringGameStatusContainer");
                throw null;
            }
            o.LJIJI("gameResultTextView");
            throw null;
        }
        o.LJIJI("gameResultTextView");
        throw null;
    }

    public static CharSequence LLFFF(CharSequence charSequence) {
        if (charSequence == null) {
            return charSequence;
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append(charSequence);
        C23010vJ.LJFF(append, 0, append.length(), 33, 600);
        return append;
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0198, code lost:
    
        if (r0.getAlpha() == 1.0f) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LLIIIJ(com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget r15) {
        /*
            Method dump skipped, instructions count: 697
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget.LLIIIJ(com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget):void");
    }

    public final void LJZI(C47121t6 c47121t6) {
        int i;
        if (!C0GA.LIZ(this.dataChannel)) {
            return;
        }
        Context context = c47121t6.getContext();
        if (C15380j0.LJIIZILJ()) {
            i = R.attr.asm;
        } else {
            i = R.attr.asp;
        }
        C1Q4 LIZLLL = C259910h.LIZLLL(i, context);
        if (LIZLLL != null) {
            LIZLLL.setBounds(0, 0, C15380j0.LIZ(14.0f), C15380j0.LIZ(16.0f));
            LIZLLL.setTint(C15380j0.LIZIZ(R.color.abc));
        } else {
            LIZLLL = null;
        }
        c47121t6.setCompoundDrawablesRelative(null, null, LIZLLL, null);
    }

    public final String LL(int i) {
        int i2 = i % 3600;
        int i3 = i2 / 60;
        int i4 = i2 % 60;
        StringBuilder LIZ = X1D.LIZ();
        StringBuilder LIZ2 = X1D.LIZ();
        if (i3 < 10) {
            LIZ2.append('0');
        } else {
            LIZ2.append("");
        }
        LIZ2.append(i3);
        LIZ.append(X1D.LIZIZ(LIZ2));
        LIZ.append(':');
        StringBuilder LIZ3 = X1D.LIZ();
        if (i4 < 10) {
            LIZ3.append('0');
        } else {
            LIZ3.append("");
        }
        LIZ3.append(i4);
        LIZ.append(X1D.LIZIZ(LIZ3));
        return X1D.LIZIZ(LIZ);
    }

    public final CharSequence LLFF(int i) {
        String text;
        String LIZLLL;
        StringBuilder LIZJ;
        String LLF = LLF();
        if (LLF == null) {
            text = C15380j0.LJIILJJIL(i);
        } else {
            text = C15380j0.LJIILL(i, LLF);
        }
        String LIZLLL2 = BAF.LIZLLL(this.LJLLI);
        if (this.LJLLJ) {
            LIZLLL = i0.LJFF(LIZLLL2, "x ");
        } else {
            LIZLLL = C0F0.LIZLLL(" x", LIZLLL2, ' ');
        }
        if (this.LJLLJ) {
            LIZJ = b1.LIZJ(LIZLLL, text);
        } else {
            LIZJ = b1.LIZJ(text, LIZLLL);
        }
        String LIZIZ = X1D.LIZIZ(LIZJ);
        if (this.LJLLILLLL) {
            if (this.LJLLJ) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(C15380j0.LJIILJJIL(R.string.ksm));
                LIZ.append(LIZIZ);
                LIZIZ = X1D.LIZIZ(LIZ);
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ);
                LIZ2.append(C15380j0.LJIILJJIL(R.string.ksm));
                LIZIZ = X1D.LIZIZ(LIZ2);
            }
        }
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) LIZIZ);
        C23010vJ.LJFF(append, 0, append.length(), 33, 600);
        if (LLF != null) {
            o.LJIIIIZZ(text, "text");
            if (s.LJJLIIIJL(text, LLF, 0, false, 6) != -1) {
                int LJJLIIIJL = s.LJJLIIIJL(text, LLF, 0, false, 6);
                int length = LLF.length() + LJJLIIIJL;
                append.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.acm)), LJJLIIIJL, length, 33);
                C23010vJ.LJFF(append, LJJLIIIJL, length, 33, 700);
            }
        }
        int LJJLIIIJL2 = s.LJJLIIIJL(append, LIZLLL, 0, false, 6);
        int length2 = LIZLLL.length() + LJJLIIIJL2;
        append.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.acm)), LJJLIIIJL2, length2, 33);
        append.setSpan(new StyleSpan(2), LJJLIIIJL2, length2, 33);
        C23010vJ.LJFF(append, LJJLIIIJL2, length2, 33, 700);
        return append;
    }

    public final CharSequence LLFII(int i) {
        String LLF = LLF();
        if (LLF == null) {
            return null;
        }
        String text = C15380j0.LJIILL(i, LLF);
        o.LJIIIIZZ(text, "text");
        int LJJLIIIJL = s.LJJLIIIJL(text, LLF, 0, false, 6);
        if (LJJLIIIJL == -1) {
            return text;
        }
        int length = LLF.length() + LJJLIIIJL;
        SpannableStringBuilder append = new SpannableStringBuilder().append((CharSequence) text);
        append.setSpan(new ForegroundColorSpan(C15380j0.LIZIZ(R.color.acm)), LJJLIIIJL, length, 33);
        C23010vJ.LJFF(append, 0, text.length(), 33, 600);
        C23010vJ.LJFF(append, LJJLIIIJL, length, 33, 700);
        return append;
    }

    public final void LLFZ(DrawGuessStartMessage drawGuessStartMessage) {
        if (C29306Beo.LJIIL(this.dataChannel)) {
            if (drawGuessStartMessage.data.pictionaryType == 2) {
                BAF.LJIILIIL(this.dataChannel, false);
                return;
            }
            LLII();
            LLIIII(drawGuessStartMessage.data.endTime - (C30725C4b.LIZ() / 1000));
            DataChannel dataChannel = this.dataChannel;
            PictionaryInfo drawGuessInfo = drawGuessStartMessage.data;
            boolean z = this.LJLLLL;
            o.LJIIIZ(drawGuessInfo, "drawGuessInfo");
            BAF.LJIJ(drawGuessInfo.id, drawGuessInfo.sessionId, new DrawGuessWord(0L, drawGuessInfo.word), dataChannel, z);
        }
    }

    public final void LLIIII(long j) {
        View view;
        if (j < 0) {
            return;
        }
        long j2 = j * 1000;
        C47121t6 c47121t6 = this.LJLJI;
        if (c47121t6 != null) {
            c47121t6.setText(LLFFF(LL((int) (j2 / 1000))));
            if (getView() != null) {
                View view2 = getView();
                o.LJI(view2);
                if (view2.getAlpha() > 0.0f && C29306Beo.LJJIIJ(getView()) && (view = getView()) != null) {
                    ViewPropertyAnimator animate = view.animate();
                    animate.alpha(0.0f);
                    animate.setDuration(120L);
                    animate.start();
                }
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(120L);
            ofFloat.addUpdateListener(new AUListenerS94S0100000_5(this, 31));
            ofFloat.addListener(new ALAdapterS4S0100000_5(this, 43));
            ofFloat.start();
            if (this.LJLL) {
                BAU bau = this.LJLJLJ;
                if (bau != null) {
                    bau.cancel();
                }
                this.LJLJLJ = null;
            }
            this.LJLJLJ = new BAU(j2, this);
            return;
        }
        o.LJIJI("countDownTextView");
        throw null;
    }

    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    public final void onInit(Object[] objArr) {
        View findViewById = findViewById(R.id.cjg);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.during_game_status_container)");
        this.LJLIL = findViewById;
        View findViewById2 = findViewById(R.id.e2f);
        o.LJIIIIZZ(findViewById2, "findViewById(R.id.has_correct_guesses_container)");
        this.LJLILLLLZI = findViewById2;
        View findViewById3 = findViewById(R.id.iv3);
        o.LJIIIIZZ(findViewById3, "findViewById(R.id.remaining_time_tv)");
        this.LJLJI = (C47121t6) findViewById3;
        View findViewById4 = findViewById(R.id.ghl);
        o.LJIIIIZZ(findViewById4, "findViewById(R.id.message_content_tv)");
        this.LJLJJI = (C47121t6) findViewById4;
        View findViewById5 = findViewById(R.id.e2g);
        o.LJIIIIZZ(findViewById5, "findViewById(R.id.has_correct_guesses_tv)");
        this.LJLJJL = (C47121t6) findViewById5;
        View findViewById6 = findViewById(R.id.dqu);
        o.LJIIIIZZ(findViewById6, "findViewById(R.id.game_result_tv)");
        this.LJLJJLL = (C47121t6) findViewById6;
        this.LJLLJ = CCJ.LIZ(this.context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01bc, code lost:
    
        if (kotlin.jvm.internal.o.LIZJ(r1, 0.0f) != false) goto L54;
     */
    @Override // com.bytedance.ies.sdk.widgets.LiveRecyclableWidget, com.bytedance.ies.sdk.widgets.IRecyclableWidget
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onLoad(java.lang.Object[] r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.interaction.drawguess.ui.DrawGuessStatusWidget.onLoad(java.lang.Object[]):void");
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        CR6 cr6;
        Long LJIJJ;
        Long l = null;
        if (!(iMessage instanceof CR6) || (cr6 = (CR6) iMessage) == null) {
            return;
        }
        if (cr6 instanceof DrawGuessStartMessage) {
            LLFZ((DrawGuessStartMessage) cr6);
            return;
        }
        if (cr6 instanceof DrawGuessUpdateMessage) {
            DrawGuessUpdateMessage drawGuessUpdateMessage = (DrawGuessUpdateMessage) cr6;
            long j = drawGuessUpdateMessage.roundId;
            if (j == 0 || (LJIJJ = BAF.LJIJJ(this.dataChannel)) == null || j != LJIJJ.longValue()) {
                return;
            }
            long j2 = drawGuessUpdateMessage.correctCount;
            this.LJLLI = (int) j2;
            BAF.LJJII(j2, this.dataChannel);
            LLIIIJ(this);
            return;
        }
        if (cr6 instanceof DrawGuessExitMessage) {
            if (C0GA.LIZIZ(this.dataChannel)) {
                BAF.LJIIL(this.dataChannel);
                return;
            }
            hide();
            LLIIIILZ();
            if (((DrawGuessExitMessage) cr6).showStats) {
                DataChannel dataChannel = this.dataChannel;
                if (dataChannel != null) {
                    l = (Long) dataChannel.kv0(DrawGuessSessionIdChannel.class);
                }
                C10640bM.LIZIZ(B73.LIZ(), new ARunnableS24S0200000_5(this, l, 28), this.dataChannel, C78842Uww.LJIJI(V0Q.Default, new UIW(0L, LiveDrawGuessRequestSummaryDelaySetting.INSTANCE.getDelayTime())));
            }
            BAF.LJIILJJIL(this.dataChannel, "", false);
            return;
        }
        if (!(cr6 instanceof DrawGuessEndMessage)) {
            return;
        }
        DrawGuessEndMessage drawGuessEndMessage = (DrawGuessEndMessage) cr6;
        if (drawGuessEndMessage.endType == 4) {
            LLII();
            DataChannel dataChannel2 = this.dataChannel;
            if (dataChannel2 == null) {
                return;
            }
            dataChannel2.pv0(DrawGuessRoundEndEvent.class);
            return;
        }
        long j3 = drawGuessEndMessage.roundId;
        Long LJIJJ2 = BAF.LJIJJ(this.dataChannel);
        if (LJIJJ2 == null || j3 != LJIJJ2.longValue()) {
            return;
        }
        this.LJLJLLL = drawGuessEndMessage.word;
        LLIIIILZ();
        BAF.LJIIZILJ(this.dataChannel);
    }

    public final void LJZL(View view, View view2, boolean z) {
        if (!z) {
            C29306Beo.LJJLJLI(view);
            C29306Beo.LJI(view2);
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(120L);
        ofFloat.addUpdateListener(new AUListenerS97S0200000_5(view, view2, 5));
        ofFloat.addListener(new ALAdapterS3S0300000_5(view, this, view2, 2));
        ofFloat.start();
    }
}
