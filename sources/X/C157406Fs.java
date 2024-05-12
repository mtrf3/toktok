package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.editSticker.text.bean.TextStickerTextWrap;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.ss.android.ugc.aweme.sticker.data.QaStruct;
import com.ss.android.ugc.aweme.tools.sticker.core.QAStickerModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.6Fs, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C157406Fs extends C156426By implements InterfaceC135635Tz {
    public static final /* synthetic */ InterfaceC74236TBo<Object>[] LLIILII;
    public C157416Ft LLIIIZ;
    public final C82631Wbr LLIIJI;
    public final C82632Wbs LLIIJLIL;
    public C63K LLIIL;

    static {
        TBT tbt = new TBT(C157406Fs.class, "textStickerApi", "getTextStickerApi()Lcom/ss/android/ugc/aweme/editSticker/text/als/EditTextStickerApi;", 0);
        C65351Pkp c65351Pkp = C65352Pkq.LIZ;
        c65351Pkp.getClass();
        LLIILII = new InterfaceC74236TBo[]{tbt, C61845OOz.LIZJ(C157406Fs.class, "videoPublishEditModel", "getVideoPublishEditModel()Lcom/ss/android/ugc/aweme/shortvideo/edit/VideoPublishEditModel;", 0, c65351Pkp)};
    }

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    private final VideoPublishEditModel getVideoPublishEditModel() {
        return (VideoPublishEditModel) this.LLIIJLIL.LIZ(this, LLIILII[1]);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.6Fr] */
    @Override // X.C156426By
    public final C6DA LIZLLL() {
        C82622Wbi c82622Wbi = this.LLIIIJ;
        if (c82622Wbi != null) {
            return new C6GH(this, c82622Wbi, new AqS152S0100000_2(this, 4), new C6BP() { // from class: X.6Fr
                @Override // X.C6BP, X.C6GI
                public final void LJFF() {
                    TextStickerTextWrap LIZ;
                    C157416Ft qaStickerView = C157406Fs.this.getQaStickerView();
                    if (qaStickerView != null) {
                        TuxTextView tuxTextView = qaStickerView.LJLJJI;
                        if (tuxTextView != null) {
                            if (C78685UuP.LJJJZ(tuxTextView.getText().toString()) && (LIZ = C68W.LIZ(tuxTextView, null)) != null) {
                                C157406Fs c157406Fs = C157406Fs.this;
                                C63D textStickerApi = c157406Fs.getTextStickerApi();
                                if (textStickerApi != null) {
                                    textStickerApi.Rx(C47261Igj.LJII(LIZ));
                                }
                                C63K c63k = c157406Fs.LLIIL;
                                if (c63k != null) {
                                    c63k.LJJIII();
                                    return;
                                } else {
                                    o.LJIJI("editQaStickerApi");
                                    throw null;
                                }
                            }
                            return;
                        }
                        o.LJIJI("questionText");
                        throw null;
                    }
                }

                {
                    super(C157406Fs.this);
                }
            });
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // X.C156426By
    public final C1558669u LJ() {
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft != null) {
            return c157416Ft.LJIJ();
        }
        return null;
    }

    @Override // X.C156426By
    public final boolean LJII() {
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft == null || c157416Ft.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        C63K c63k = this.LLIIL;
        if (c63k != null) {
            return c63k.LJIIIIZZ();
        }
        o.LJIJI("editQaStickerApi");
        throw null;
    }

    @Override // X.C156426By
    public final void LJIIL() {
        QaStruct qaStruct;
        QaStruct qaStruct2;
        C157416Ft c157416Ft = this.LLIIIZ;
        long j = 0;
        if (c157416Ft == null || (qaStruct2 = c157416Ft.getQaStruct()) == null || qaStruct2.getQuestionId() == 0) {
            super.LJIIL();
            C63K c63k = this.LLIIL;
            if (c63k != null) {
                C157416Ft c157416Ft2 = this.LLIIIZ;
                if (c157416Ft2 != null && (qaStruct = c157416Ft2.getQaStruct()) != null) {
                    j = qaStruct.getQuestionId();
                }
                c63k.Vj0(String.valueOf(j));
                return;
            }
            o.LJIJI("editQaStickerApi");
            throw null;
        }
        if (this.LJLJJLL.LJLLJ || (this.LLI && this.LLFZ < 2)) {
            LJFF(false);
        } else {
            LJIJ();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004d, code lost:
    
        if (r2 == false) goto L27;
     */
    @Override // X.C156426By
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIILIIL() {
        /*
            r8 = this;
            X.6Ft r6 = r8.LLIIIZ
            if (r6 == 0) goto L4b
            X.6G1 r0 = r6.LJLZ
            r5 = 1
            if (r0 == 0) goto L4b
            X.69u r7 = r6.LJZ
            if (r7 == 0) goto L4b
            boolean r0 = r0.LJIILL()
            if (r0 != 0) goto L4b
            boolean r0 = r6.LJZL
            if (r0 != 0) goto L4b
            boolean r0 = r6.LL
            if (r0 != 0) goto L4b
            boolean r0 = r6.LJJZZI()
            if (r0 == 0) goto L31
            long r3 = r6.LJZI
            int r0 = r7.LJLILLLLZI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L50
            int r0 = r7.LJLJI
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L50
        L31:
            r2 = 1
        L32:
            r1 = 4
            if (r2 == 0) goto L4c
            int r0 = r6.getVisibility()
            if (r1 != r0) goto L4c
            r0 = 1
        L3c:
            r1 = 0
        L3d:
            X.C162696a1.LJ(r1, r6)
            if (r0 != r5) goto L4b
            Y.ARunnableS38S0100000_2 r1 = new Y.ARunnableS38S0100000_2
            r0 = 1
            r1.<init>(r8, r0)
            r8.post(r1)
        L4b:
            return
        L4c:
            r0 = 0
            if (r2 == 0) goto L3d
            goto L3c
        L50:
            r2 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C157406Fs.LJIILIIL():void");
    }

    @Override // X.C156426By
    public final void LJIILL() {
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft == null) {
            return;
        }
        c157416Ft.setVisibility(0);
    }

    @Override // X.InterfaceC135635Tz
    public C82622Wbi getDiContainer() {
        C82622Wbi diContainer = this.LLIIIJ;
        o.LJIIIIZZ(diContainer, "diContainer");
        return diContainer;
    }

    @Override // X.C156426By
    public float getEndTime() {
        C157416Ft c157416Ft = this.LLIIIZ;
        int i = 0;
        if (c157416Ft != null) {
            i = c157416Ft.LJJJZ(0);
        }
        return i;
    }

    @Override // X.C156426By
    public float getStartTime() {
        C157416Ft c157416Ft = this.LLIIIZ;
        int i = 0;
        if (c157416Ft != null) {
            i = c157416Ft.LJJII(0);
        }
        return i;
    }

    public final C63D getTextStickerApi() {
        return (C63D) this.LLIIJI.LIZ(this, LLIILII[0]);
    }

    public final float getAnswerBtnHeightRate() {
        int measuredHeight = getContentView().getMeasuredHeight();
        float f = 0.0f;
        if (measuredHeight == 0) {
            return 0.0f;
        }
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft != null) {
            f = c157416Ft.getActionHeight();
        }
        return f / measuredHeight;
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    public final C157416Ft getQaStickerView() {
        return this.LLIIIZ;
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        C157416Ft c157416Ft;
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ && (c157416Ft = this.LLIIIZ) != null) {
            c157416Ft.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft != null) {
            c157416Ft.setTouching(false);
        }
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft == null) {
            return;
        }
        c157416Ft.setAlpha(f);
    }

    public final void setController(final C157426Fu c157426Fu) {
        C157416Ft c157416Ft;
        if (c157426Fu != null && (c157416Ft = this.LLIIIZ) != null) {
            c157416Ft.setController(new C6G1() { // from class: X.6Fw
                @Override // X.C6G1
                public final boolean LJIILL() {
                    return C157426Fu.this.LJIL();
                }

                @Override // X.C6G1
                public final InteractStickerStruct getInteractStickerStruct() {
                    return C157426Fu.this.getInteractStickerStruct();
                }

                @Override // X.C6G1
                public final void getInteractStickerType() {
                    C157426Fu.this.getClass();
                }

                @Override // X.C6G1
                public final void LJIILLIIL(boolean z) {
                    C157426Fu.this.LJJIIZ(z);
                }

                @Override // X.C6G1
                public final void LJIIZILJ(InteractStickerStruct interactStickerStruct) {
                    C157426Fu.this.LJJIIJZLJL(interactStickerStruct, Boolean.FALSE);
                }
            });
        }
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft != null) {
            c157416Ft.setPlayPosition(j);
        }
    }

    public final void setQaStickerTimeEditData(C1558669u data) {
        o.LJIIIZ(data, "data");
        C157416Ft c157416Ft = this.LLIIIZ;
        if (c157416Ft != null) {
            c157416Ft.setQaStickerTimeEditData(data);
        }
    }

    public final void setQaStickerView(C157416Ft c157416Ft) {
        this.LLIIIZ = c157416Ft;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C157406Fs(Context context, C82622Wbi diContainer) {
        super(context, null, 0, diContainer);
        int i;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(diContainer, "diContainer");
        new LinkedHashMap();
        int i2 = 0;
        this.LLIIJI = UCI.LJII(getDiContainer(), C63D.class, null);
        this.LLIIJLIL = UCI.LJI(getDiContainer(), VideoPublishEditModel.class, null);
        C16880lQ.LLLZIIL(R.layout.bnc, C16880lQ.LLZIL(getContext()), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        View findViewById = findViewById(R.id.btt);
        this.LJLJL = findViewById;
        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
        o.LJII(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 8388611;
        if (C158166Iq.LIZIZ() && getVideoPublishEditModel().qaStickerModel == null) {
            i = (int) AnonymousClass564.LIZ(80.0f);
        } else {
            i = 0;
        }
        layoutParams2.topMargin = i;
        if (C158166Iq.LIZIZ() && getVideoPublishEditModel().qaStickerModel == null) {
            i2 = (int) AnonymousClass564.LIZ(30.0f);
        }
        layoutParams2.setMarginStart(i2);
        layoutParams2.leftMargin = layoutParams2.getMarginStart();
        QAStickerModel qAStickerModel = getVideoPublishEditModel().qaStickerModel;
        if (qAStickerModel != null) {
            LJIJI(qAStickerModel.getBaseStickerModel().getRotation() * (-1), Boolean.TRUE);
            LJIJJ(qAStickerModel.getBaseStickerModel().getScale());
            if (C90193gN.LIZ()) {
                this.LJLJL.setX(qAStickerModel.getBaseStickerModel().getTranslateX() - qAStickerModel.getBaseStickerModel().getLeft());
            } else {
                this.LJLJL.setX(qAStickerModel.getBaseStickerModel().getTranslateX() + qAStickerModel.getBaseStickerModel().getLeft());
            }
            this.LJLJL.setY(qAStickerModel.getBaseStickerModel().getTranslateY() + qAStickerModel.getBaseStickerModel().getTop());
        }
        this.LLIIL = (C63K) this.LLIIIJ.LJ(C63K.class, null);
        this.LLFF = 0.5f;
    }
}
