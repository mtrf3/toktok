package X;

import Y.ACListenerS23S0100000_3;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class Y0O implements InterfaceC86702Y1a {
    public final /* synthetic */ InteractStickerWidget LIZ;
    public final /* synthetic */ InteractStickerStruct LIZIZ;

    @Override // X.InterfaceC86702Y1a
    public final Y1E LIZ() {
        InteractStickerWidget interactStickerWidget = this.LIZ;
        final Context context = interactStickerWidget.LJLIL;
        final C245649kW c245649kW = interactStickerWidget.LJLJLLL;
        final InteractStickerStruct interactStickerStruct = this.LIZIZ;
        final C224048qm c224048qm = interactStickerWidget.LJLL;
        o.LJI(c224048qm);
        final InterfaceC223648q8 interfaceC223648q8 = this.LIZ.LJLLI;
        C223048pA LIZ = c245649kW.LJIILIIL.LIZ();
        c245649kW.LIZ = LIZ.LIZ;
        c245649kW.LIZIZ = LIZ.LIZIZ;
        final int type = interactStickerStruct.getType();
        return new AbstractC224038ql(type, context, c224048qm, interactStickerStruct, c245649kW, interfaceC223648q8) { // from class: X.8q6
            public final InterfaceC223648q8 LJLLI;
            public View LJLLILLLL;
            public final C223638q7 LJLLJ;
            public final String LJLLL;
            public final String LJLLLL;

            @Override // X.Y1P
            public final boolean LJIIJJI(long j, float f, float f2, int i) {
                return false;
            }

            @Override // X.Y1I
            public final void LJJII() {
            }

            @Override // X.Y1I
            public final void LJJIIZ() {
            }

            @Override // X.Y1E
            public final int getStickerType() {
                return 7;
            }

            @Override // X.AbstractC224038ql
            public final View LJIILLIIL() {
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                LinearLayout linearLayout = new LinearLayout(this.LJLILLLLZI);
                linearLayout.setLayoutParams(layoutParams);
                linearLayout.setOrientation(0);
                TuxTextView tuxTextView = new TuxTextView(this.LJLILLLLZI, null, 6, 0);
                tuxTextView.setTextColor(AnonymousClass636.LJIIIIZZ(R.attr.cl, this.LJLILLLLZI));
                tuxTextView.setTuxFont(62);
                tuxTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
                tuxTextView.setMaxLines(1);
                tuxTextView.setGravity(16);
                tuxTextView.setText(this.LJLILLLLZI.getString(R.string.s3));
                C116474hf c116474hf = new C116474hf(this.LJLILLLLZI, null);
                c116474hf.setImageResource(R.drawable.bvr);
                linearLayout.addView(tuxTextView);
                linearLayout.addView(c116474hf);
                return linearLayout;
            }

            @Override // X.AbstractC224038ql
            public final void LJIJI() {
                String str;
                String str2;
                C223778qL c223778qL;
                C223778qL c223778qL2;
                C223778qL c223778qL3;
                C188727au c188727au = new C188727au();
                C245649kW c245649kW2 = this.LJLJJI;
                String str3 = null;
                if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
                    str = c223778qL3.LIZJ;
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                C245649kW c245649kW3 = this.LJLJJI;
                if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
                    str2 = c223778qL2.LIZIZ;
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                C245649kW c245649kW4 = this.LJLJJI;
                if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
                    str3 = c223778qL.LIZ;
                }
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("question_id", this.LJLLL);
                c188727au.LJIIIZ("sticker_type", "question");
                c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                FMX.LJIIL("sticker_click", c188727au.LIZ);
            }

            @Override // X.AbstractC224038ql
            public final void LJIJJ() {
                String str;
                String str2;
                C223778qL c223778qL;
                C223778qL c223778qL2;
                C223778qL c223778qL3;
                C188727au c188727au = new C188727au();
                C245649kW c245649kW2 = this.LJLJJI;
                String str3 = null;
                if (c245649kW2 != null && (c223778qL3 = c245649kW2.LJIIZILJ) != null) {
                    str = c223778qL3.LIZJ;
                } else {
                    str = null;
                }
                c188727au.LJIIIZ("group_id", str);
                C245649kW c245649kW3 = this.LJLJJI;
                if (c245649kW3 != null && (c223778qL2 = c245649kW3.LJIIZILJ) != null) {
                    str2 = c223778qL2.LIZIZ;
                } else {
                    str2 = null;
                }
                c188727au.LJIIIZ("author_id", str2);
                C245649kW c245649kW4 = this.LJLJJI;
                if (c245649kW4 != null && (c223778qL = c245649kW4.LJIIZILJ) != null) {
                    str3 = c223778qL.LIZ;
                }
                c188727au.LJIIIZ("enter_from", str3);
                c188727au.LJIIIZ("user_id", ((RBX) HG3.LJIILL()).getCurUserId());
                c188727au.LJIIIZ("question_id", this.LJLLL);
                c188727au.LJIIIZ("question_user_id", this.LJLLLL);
                FMX.LJIIL("click_question_bubble", c188727au.LIZ);
            }

            @Override // X.Y1I
            public final View LIZ(int i) {
                if (C223998qh.LJ(this.LJLILLLLZI)) {
                    if (this.LJLLILLLL == null) {
                        this.LJLLILLLL = new C221798n9(this.LJLILLLLZI);
                        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                        View view = this.LJLLILLLL;
                        o.LJI(view);
                        view.setLayoutParams(layoutParams);
                        View view2 = this.LJLLILLLL;
                        o.LJII(view2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view.CommonStickerFeedView");
                        ((C221798n9) view2).setPoints(this.LJLLJ.LJLJJLL);
                        View view3 = this.LJLLILLLL;
                        o.LJI(view3);
                        view3.postInvalidate();
                    }
                    return this.LJLLILLLL;
                }
                if (this.LJLLILLLL == null) {
                    this.LJLLILLLL = new FrameLayout(this.LJLILLLLZI);
                    RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                    View view4 = this.LJLLILLLL;
                    if (view4 != null) {
                        view4.setLayoutParams(layoutParams2);
                    }
                }
                return this.LJLLILLLL;
            }

            @Override // X.AbstractC224038ql, X.Y1P
            public final void LJII(C245649kW interactStickerParams) {
                o.LJIIIZ(interactStickerParams, "interactStickerParams");
                this.LJLJJI = interactStickerParams;
                C223638q7 c223638q7 = this.LJLLJ;
                c223638q7.getClass();
                c223638q7.LJLJJI = interactStickerParams;
            }

            @Override // X.AbstractC224038ql
            public final int LJIIZILJ(C6DL c6dl) {
                int i;
                o.LJIIIZ(c6dl, "<this>");
                C245649kW c245649kW2 = this.LJLJJI;
                if (c245649kW2 == null || c245649kW2.LJIJ == null) {
                    return 0;
                }
                C6DO c6do = new C6DO();
                if (TextUtils.equals(C85999Xp5.LIZIZ(), "ar")) {
                    i = R.drawable.b61;
                } else {
                    i = R.drawable.b60;
                }
                c6do.LIZ = i;
                String string = c6dl.LIZ.getString(R.string.s3);
                o.LJIIIIZZ(string, "context.getString(R.string.QA_video_tooltip)");
                c6do.LIZLLL = string;
                c6do.LJFF = new ACListenerS23S0100000_3(this, 9);
                ((ArrayList) c6dl.LIZIZ).add(c6do);
                return 1;
            }

            @Override // X.Y1P
            public final boolean LJIILIIL(long j, int i, float f, float f2, InterfaceC221818nB popListener) {
                o.LJIIIZ(popListener, "popListener");
                return this.LJLLJ.LJIILIIL(j, i, f, f2, popListener);
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x006e, code lost:
            
                if (r7 != null) goto L8;
             */
            /* JADX WARN: Removed duplicated region for block: B:10:0x003f  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0053  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x006c  */
            {
                /*
                    r14 = this;
                    java.lang.String r0 = "context"
                    r10 = r16
                    kotlin.jvm.internal.o.LJIIIZ(r10, r0)
                    r13 = r19
                    r9 = r15
                    r8 = r14
                    r11 = r17
                    r12 = r18
                    r8.<init>(r9, r10, r11, r12, r13)
                    r0 = r20
                    r8.LJLLI = r0
                    X.8q7 r1 = new X.8q7
                    r2 = r10
                    r3 = r8
                    r4 = r12
                    r5 = r13
                    r6 = r0
                    r1.<init>(r2, r3, r4, r5, r6)
                    r8.LJLLJ = r1
                    com.ss.android.ugc.aweme.feed.model.VideoReplyStruct r7 = r13.LJIJ
                    r5 = 0
                    if (r7 == 0) goto L71
                    long r1 = r7.getAwemeId()
                    int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
                    if (r0 == 0) goto L6e
                    if (r7 == 0) goto L71
                    r7.getAwemeId()
                L35:
                    long r3 = r7.getCommentId()
                L39:
                    java.lang.String r2 = ""
                    int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r0 == 0) goto L6c
                    if (r7 == 0) goto L6a
                    long r0 = r7.getCommentId()
                    java.lang.Long r0 = java.lang.Long.valueOf(r0)
                L49:
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                L4d:
                    r8.LJLLL = r0
                    java.lang.String r1 = r13.LJIJI
                    if (r1 != 0) goto L57
                    java.lang.Long r1 = java.lang.Long.valueOf(r5)
                L57:
                    java.lang.Long r0 = java.lang.Long.valueOf(r5)
                    boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
                    if (r0 != 0) goto L67
                    java.lang.String r0 = r13.LJIJI
                    java.lang.String r2 = java.lang.String.valueOf(r0)
                L67:
                    r8.LJLLLL = r2
                    return
                L6a:
                    r0 = 0
                    goto L49
                L6c:
                    r0 = r2
                    goto L4d
                L6e:
                    if (r7 == 0) goto L71
                    goto L35
                L71:
                    r3 = 0
                    goto L39
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C223628q6.<init>(int, android.content.Context, X.8qm, com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct, X.9kW, X.8q8):void");
            }
        };
    }

    public Y0O(InteractStickerWidget interactStickerWidget, InteractStickerStruct interactStickerStruct) {
        this.LIZ = interactStickerWidget;
        this.LIZIZ = interactStickerStruct;
    }
}
