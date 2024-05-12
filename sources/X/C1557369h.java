package X;

import Y.ARunnableS10S0101000_6;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.gamora.editor.EditCommentStickerViewModel;
import com.zhiliaoapp.musically.R;

/* renamed from: X.69h, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1557369h extends C156426By {
    public static final /* synthetic */ int LLIIJLIL = 0;
    public C156086Aq LLIIIZ;
    public EditCommentStickerViewModel LLIIJI;

    @Override // X.C156426By
    public final boolean LIZIZ() {
        return true;
    }

    @Override // X.C156426By
    public final boolean LIZJ() {
        return true;
    }

    private EditCommentStickerViewModel getEditCommentStickerViewModel() {
        if (this.LLIIJI == null) {
            this.LLIIJI = (EditCommentStickerViewModel) C163726bg.LIZJ(this).LIZ(EditCommentStickerViewModel.class);
        }
        return this.LLIIJI;
    }

    @Override // X.C156426By
    public final C6DA LIZLLL() {
        return new C156886Ds(this, new C6BP(this));
    }

    @Override // X.C156426By
    public final boolean LJII() {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq == null || c156086Aq.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // X.C156426By
    public final void LJIILIIL() {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null && c156086Aq.LIZJ()) {
            post(new ARunnableS10S0101000_6(2, this, 0));
        }
    }

    @Override // X.C156426By
    public final void LJIILL() {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setVisibility(0);
        }
    }

    public void LJJ() {
        C16880lQ.LLLZIIL(R.layout.bn1, C16880lQ.LLZIL(this.LJLIL), this);
    }

    public final void LJJI() {
        int LJFF;
        if (this.LJLJL != null) {
            if (C173636rf.LIZIZ(this.LJLIL)) {
                this.LJLJL.setX(KL2.LIZJ(getContext(), -32.0f));
            } else {
                this.LJLJL.setX(KL2.LIZJ(getContext(), 32.0f));
            }
            if (AnonymousClass668.LIZIZ().LIZIZ()) {
                LJFF = 0;
            } else {
                LJFF = C81184Vtc.LJFF(this.LJLIL);
            }
            this.LJLJL.setY(KL2.LIZJ(getContext(), 130.0f) + LJFF);
        }
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        return getEditCommentStickerViewModel().Hv0(C45804HyK.LJJIFFI(this.LJLIL)).getInTimeEditView();
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    public C1557369h(Context context) {
        super(context, null);
        this.LJLIL = context;
        KL2.LIZJ(context, 32.0f);
        KL2.LJIIJJI(context);
        LJJ();
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
        this.LLIIIZ = (C156086Aq) findViewById(R.id.buj);
        setVisibility(8);
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        C156086Aq c156086Aq;
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ && (c156086Aq = this.LLIIIZ) != null) {
            c156086Aq.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setTouching(false);
        }
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setAlpha(f);
        }
    }

    public void setController(C1556669a c1556669a) {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setController(c1556669a);
        }
    }

    public void setDumpData(InterfaceC156096Ar interfaceC156096Ar) {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setDumpData(interfaceC156096Ar);
        }
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        C156086Aq c156086Aq = this.LLIIIZ;
        if (c156086Aq != null) {
            c156086Aq.setPlayPosition(j);
        }
    }
}
