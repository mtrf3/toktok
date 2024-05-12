package X;

import Y.ARunnableS38S0100000_2;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.donation.EditDonationStickerViewModel;
import com.zhiliaoapp.musically.R;
import defpackage.a1;
import kotlin.jvm.internal.AqS152S0100000_2;
import kotlin.jvm.internal.o;

/* renamed from: X.69g, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1557269g extends C156426By {
    public final C1557169f LLIIIZ;
    public final C62822Ol8 LLIIJI;

    private final EditDonationStickerViewModel getDonationStickerViewModel() {
        return (EditDonationStickerViewModel) this.LLIIJI.getValue();
    }

    @Override // X.C156426By
    public final C6DA LIZLLL() {
        return new C156886Ds(this, new C6BP(this));
    }

    @Override // X.C156426By
    public final boolean LJII() {
        if (this.LLIIIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C156426By
    public final void LJIILIIL() {
        if (this.LLIIIZ.LIZJ()) {
            post(new ARunnableS38S0100000_2(this, 163));
        }
    }

    @Override // X.C156426By
    public final void LJIILL() {
        this.LLIIIZ.setVisibility(0);
    }

    @Override // X.C156426By
    public float getEndTime() {
        return this.LLIIIZ.LJJJZ(0);
    }

    @Override // X.C156426By
    public float getStartTime() {
        return this.LLIIIZ.LJJII(0);
    }

    @Override // X.C156426By
    public final boolean LJIIIIZZ() {
        EditDonationStickerViewModel donationStickerViewModel = getDonationStickerViewModel();
        Context mContext = this.LJLIL;
        o.LJIIIIZZ(mContext, "mContext");
        ActivityC45651qj LJJIFFI = C45804HyK.LJJIFFI(mContext);
        o.LJI(LJJIFFI);
        return donationStickerViewModel.Hv0(LJJIFFI).getInTimeEditView();
    }

    @Override // X.C156426By
    public View getDrawView() {
        return this.LLIIIZ;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1557269g(Context context) {
        super(context, null, 0);
        a1.LJFF(context, "context");
        KL2.LIZJ(context, 32.0f);
        this.LLIIJI = C221108m2.LIZIZ(new AqS152S0100000_2(this, 866));
        this.LJLIL = context;
        C16880lQ.LLLZIIL(R.layout.cca, C16880lQ.LLZIL(context), this);
        this.LJLJJLL = (C6C1) findViewById(R.id.khw);
        this.LJLJL = findViewById(R.id.btt);
        View findViewById = findViewById(R.id.ceu);
        o.LJIIIIZZ(findViewById, "findViewById(R.id.donation_sticker_view)");
        this.LLIIIZ = (C1557169f) findViewById;
        setVisibility(8);
        this.LLFF = 0.8f;
    }

    @Override // X.C156426By
    public final boolean LJIIJ(MotionEvent motionEvent) {
        boolean LJIIJ = super.LJIIJ(motionEvent);
        if (LJIIJ) {
            this.LLIIIZ.setTouching(true);
        }
        return LJIIJ;
    }

    @Override // X.C156426By
    public final boolean LJIIJJI(MotionEvent motionEvent) {
        boolean LJIIJJI = super.LJIIJJI(motionEvent);
        this.LLIIIZ.setTouching(false);
        return LJIIJJI;
    }

    @Override // android.view.View
    public void setAlpha(float f) {
        this.LLIIIZ.setAlpha(f);
    }

    public final void setController(C1556769b controller) {
        o.LJIIIZ(controller, "controller");
        this.LLIIIZ.setStickerController(controller);
    }

    @Override // X.C156426By
    public void setPlayPosition(long j) {
        this.LLIIIZ.setPlayPosition(j);
    }
}
