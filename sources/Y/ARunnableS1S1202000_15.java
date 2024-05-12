package Y;

import X.C86608Xyu;
import X.C86616Xz2;
import X.ED5;
import X.InterfaceC86614Xz0;
import X.InterfaceC86631XzH;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.LinkedHashMap;

/* loaded from: classes16.dex */
public class ARunnableS1S1202000_15 implements Runnable {
    public final int $t;
    public int i3;
    public int i4;
    public Object l1;
    public Object l2;
    public String s0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        CompletionBlock completionBlock = (CompletionBlock) this.l1;
        XBaseModel LIZJ = ED5.LIZJ(InterfaceC86614Xz0.class, null);
        int i = this.i3;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.l2;
        int i2 = this.i4;
        String str = this.s0;
        InterfaceC86614Xz0 interfaceC86614Xz0 = (InterfaceC86614Xz0) LIZJ;
        interfaceC86614Xz0.setHttpCode(Integer.valueOf(i));
        interfaceC86614Xz0.setHeader(linkedHashMap);
        interfaceC86614Xz0.setClientCode(Integer.valueOf(i2));
        interfaceC86614Xz0.setResponse(str);
        interfaceC86614Xz0.setResponseType("base64");
        completionBlock.onSuccess((XBaseResultModel) LIZJ, "");
    }

    public final void LIZ$1() {
        InterfaceC86631XzH interfaceC86631XzH = ((C86608Xyu) this.l1).LIZ.LJLJJLL;
        C86616Xz2 c86616Xz2 = new C86616Xz2();
        c86616Xz2.LIZ = Integer.valueOf(this.i3);
        c86616Xz2.LIZJ = (LinkedHashMap) this.l2;
        c86616Xz2.LIZIZ = Integer.valueOf(this.i4);
        c86616Xz2.LIZLLL = this.s0;
        c86616Xz2.LJFF = "base64";
        interfaceC86631XzH.LIZIZ(c86616Xz2, "");
    }

    public static final void run$0(ARunnableS1S1202000_15 aRunnableS1S1202000_15) {
        boolean LIZ;
        try {
            aRunnableS1S1202000_15.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$1(ARunnableS1S1202000_15 aRunnableS1S1202000_15) {
        boolean LIZ;
        try {
            aRunnableS1S1202000_15.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ARunnableS1S1202000_15(Object obj, CompletionBlock<InterfaceC86614Xz0> completionBlock, int i, LinkedHashMap<String, String> linkedHashMap, int i2, String str) {
        this.$t = str;
        this.l1 = obj;
        this.i3 = completionBlock;
        this.l2 = i;
        this.i4 = linkedHashMap;
        this.s0 = i2;
    }
}
