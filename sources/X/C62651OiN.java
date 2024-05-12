package X;

import android.content.Context;
import android.widget.TextView;
import com.zhiliaoapp.musically.R;
import defpackage.a1;

/* renamed from: X.OiN, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C62651OiN extends AbstractC62647OiJ {
    public final int LJLZ;

    @Override // X.AbstractC62647OiJ
    public final void LJIIJ() {
        this.LJLLILLLL = 44;
        this.LJLLJ = 30;
        C62629Oi1.LJ = 44;
        C62629Oi1.LJFF = 30;
        LJIIIIZZ();
        setSyncTitle((TextView) findViewById(R.id.ky1));
    }

    @Override // X.AbstractC62647OiJ
    public int getLayoutResId() {
        if (this.LJLZ == 0) {
            return R.layout.cmn;
        }
        return R.layout.clm;
    }

    @Override // X.AbstractC62647OiJ
    public final void LJIILIIL() {
        TextView syncTitle;
        String string;
        if (!C53316KwC.LIZ() || (syncTitle = getSyncTitle()) == null) {
            return;
        }
        OSZ<EnumC62419Oed, C63046Ook> currentChannelPair = getCurrentChannelPair();
        if (currentChannelPair == null || (string = getContext().getString(R.string.rdi, currentChannelPair.getFirst().getLabel())) == null) {
            string = getContext().getString(R.string.h3_);
        }
        syncTitle.setText(string);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C62651OiN(Context context) {
        super(context);
        a1.LJFF(context, "ctx");
        this.LJLZ = 0;
    }
}
