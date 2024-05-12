package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;

/* renamed from: X.Ob2, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62196Ob2 extends FrameLayout implements OZX {
    public C62180Oam LJLIL;
    public View LJLILLLLZI;
    public View LJLJI;
    public TuxTextView LJLJJI;
    public TuxTextView LJLJJL;

    @Override // X.OZX
    public final void LIZ() {
        View view = this.LJLJI;
        if (view != null) {
            view.setVisibility(8);
        }
        TuxTextView tuxTextView = this.LJLJJL;
        if (tuxTextView == null) {
            return;
        }
        tuxTextView.setVisibility(0);
    }

    public final TuxTextView getDisplayDescTv() {
        return this.LJLJJI;
    }

    public final TuxTextView getDownloadDescTv() {
        return this.LJLJJL;
    }

    @Override // X.OZX
    public C62180Oam getQrCodeSquareView() {
        return this.LJLIL;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62196Ob2(Context context) {
        super(context, null, 0);
        new LinkedHashMap();
        C16880lQ.LLLLIILL(C16880lQ.LLZIL(context), R.layout.cm7, this, true);
        this.LJLILLLLZI = findViewById(R.id.juu);
        this.LJLJI = findViewById(R.id.juy);
    }

    public final void setDisplayDescTv(TuxTextView tuxTextView) {
        this.LJLJJI = tuxTextView;
    }

    public final void setDownloadDescTv(TuxTextView tuxTextView) {
        this.LJLJJL = tuxTextView;
    }
}
