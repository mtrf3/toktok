package X;

import android.content.Context;

/* loaded from: classes6.dex */
public final class CMY implements Runnable {
    public final /* synthetic */ boolean LJLIL;
    public final /* synthetic */ CMZ LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;

    public CMY(boolean z, CMZ cmz, String str, String str2, String str3, String str4) {
        this.LJLIL = z;
        this.LJLILLLLZI = cmz;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
    }

    public final void LIZ() {
        if (this.LJLIL) {
            Context context = this.LJLILLLLZI.LIZ;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Trigger Succeed !!\nBusiness : ");
            LIZ.append(this.LJLJI);
            LIZ.append("\nRule : ");
            LIZ.append(this.LJLJJI);
            LIZ.append("\nTrigger Type : ");
            LIZ.append(this.LJLJJL);
            C30868C9o.LIZ(context, X1D.LIZIZ(LIZ));
            return;
        }
        Context context2 = this.LJLILLLLZI.LIZ;
        StringBuilder sb = new StringBuilder("Trigger failed !!\nBusiness : ");
        sb.append(this.LJLJI);
        sb.append("\nRule : ");
        sb.append(this.LJLJJI);
        sb.append("\nTrigger Type : ");
        sb.append(this.LJLJJL);
        sb.append("\nError Message: ");
        String str = this.LJLJJLL;
        if (str.length() == 0) {
            str = "empty";
        }
        sb.append(str);
        C30868C9o.LIZ(context2, sb.toString());
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
