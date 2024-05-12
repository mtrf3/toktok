package X;

import android.view.View;
import android.view.ViewGroup;
import com.zhiliaoapp.musically.R;

/* loaded from: classes14.dex */
public final class UEG extends UED {
    public String LJLIL;
    public final C47121t6 LJLILLLLZI;
    public Boolean LJLJI;
    public final /* synthetic */ UEF LJLJJI;

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    @Override // X.UED
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void L(int r7) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UEG.L(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UEG(UEF uef, View view) {
        super(view);
        this.LJLJJI = uef;
        this.LJLIL = "";
        this.LJLILLLLZI = (C47121t6) view.findViewById(R.id.l93);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
        marginLayoutParams.leftMargin = C15380j0.LIZ(16.0f);
        marginLayoutParams.rightMargin = C15380j0.LIZ(16.0f);
        marginLayoutParams.topMargin = C15380j0.LIZ(8.0f);
        view.setLayoutParams(marginLayoutParams);
    }
}
