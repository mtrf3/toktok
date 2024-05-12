package X;

import android.os.Build;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.lynx.tasm.LynxEnv;
import com.lynx.tasm.LynxViewClient;
import com.lynx.tasm.TemplateBundle;
import com.lynx.tasm.TemplateData;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AqS160S0100000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.NqU, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60606NqU implements InterfaceC60710NsA {
    public final EnumC39924Flg LIZ;
    public C60682Nri LIZIZ;
    public String LIZJ;
    public Integer LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Integer LJI;
    public final C60735NsZ LJII;
    public TemplateData LJIIIIZZ;
    public java.util.Map<Object, Object> LJIIIZ;
    public InterfaceC65784Pro<? extends InterfaceC68342mE<TemplateData>> LJIIJ;
    public boolean LJIIJJI;
    public AbstractC65781Prl LJIIL;
    public InterfaceC60614Nqc LJIILIIL;
    public HybridSchemaParam LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public boolean LJIIZILJ;
    public boolean LJIJ;
    public boolean LJIJI;
    public JTD LJIJJ;
    public boolean LJIJJLI;
    public final ConcurrentHashMap<String, Object> LJIL;
    public final List<LynxViewClient> LJJ;
    public java.util.Map<String, C39947Fm3> LJJI;
    public List<C40197Fq5> LJJIFFI;
    public C60439Nnn LJJII;
    public C59815Ndj LJJIII;
    public String LJJIIJ;
    public android.net.Uri LJJIIJZLJL;
    public TemplateBundle LJJIIZ;

    public C60606NqU() {
        throw null;
    }

    @Override // X.InterfaceC60710NsA
    public final boolean LIZJ() {
        HybridSchemaParam hybridSchemaParam = this.LJIILJJIL;
        if (hybridSchemaParam != null) {
            return hybridSchemaParam.getUseForest();
        }
        return false;
    }

    @Override // X.InterfaceC60710NsA
    public final android.net.Uri LIZIZ() {
        return this.LJJIIJZLJL;
    }

    @Override // X.InterfaceC60710NsA
    public final HybridSchemaParam LIZLLL() {
        return this.LJIILJJIL;
    }

    @Override // X.InterfaceC60710NsA
    public final java.util.Map<String, Object> LJ() {
        return this.LJIL;
    }

    @Override // X.InterfaceC60710NsA
    public final EnumC39924Flg getType() {
        return this.LIZ;
    }

    @Override // X.InterfaceC60710NsA
    public final void LIZ(java.util.Map<String, ? extends Object> map) {
        if (map != null) {
            this.LJIL.putAll(map);
        }
    }

    public final void LJFF(List<C40197Fq5> list) {
        if (this.LJJIFFI == null) {
            this.LJJIFFI = new ArrayList();
        }
        List<C40197Fq5> list2 = this.LJJIFFI;
        if (list2 != null) {
            list2.addAll(list);
        }
    }

    public final void LJI(LynxViewClient lynxClientDelegate) {
        o.LJIIJ(lynxClientDelegate, "lynxClientDelegate");
        this.LJJ.add(lynxClientDelegate);
    }

    public C60606NqU(C60439Nnn c60439Nnn, android.net.Uri uri, int i) {
        String str;
        c60439Nnn = (i & 4) != 0 ? null : c60439Nnn;
        if ((i & 16) != 0) {
            str = "";
        } else {
            str = null;
        }
        this.LJJI = null;
        this.LJJIFFI = null;
        this.LJJII = c60439Nnn;
        this.LJJIII = null;
        this.LJJIIJ = str;
        this.LJJIIJZLJL = uri;
        this.LJJIIZ = null;
        this.LIZ = EnumC39924Flg.LYNX;
        this.LJFF = -1;
        this.LJI = -1;
        this.LJII = new C60735NsZ(new AqS160S0100000_10(this, 525));
        this.LJIIZILJ = true;
        ConcurrentHashMap<String, Object> concurrentHashMap = new ConcurrentHashMap<>();
        o.LJFF(LynxEnv.LJIIIZ(), "LynxEnv.inst()");
        concurrentHashMap.put("lynxSdkVersion", "2.10.16-rc.10");
        concurrentHashMap.put("screenWidth", Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LJ(C39849FkT.LIZ()), C39849FkT.LIZ())));
        concurrentHashMap.put("screenHeight", Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LIZIZ(C39849FkT.LIZ()), C39849FkT.LIZ())));
        concurrentHashMap.put("statusBarHeight", Integer.valueOf(C60605NqT.LJIIJ(C60605NqT.LJI(C39849FkT.LIZ()), C39849FkT.LIZ())));
        String str2 = Build.MODEL;
        o.LJFF(str2, "Build.MODEL");
        concurrentHashMap.put("deviceModel", str2);
        concurrentHashMap.put("os", "android");
        String str3 = Build.VERSION.RELEASE;
        o.LJFF(str3, "Build.VERSION.RELEASE");
        concurrentHashMap.put("osVersion", str3);
        concurrentHashMap.put("language", C60605NqT.LIZ());
        concurrentHashMap.put("isLowPowerMode", Integer.valueOf(C60605NqT.LJII(C39849FkT.LIZ()) ? 1 : 0));
        concurrentHashMap.put("accessibleMode", Integer.valueOf(C60605NqT.LJIIIZ(C39849FkT.LIZ()) ? 1 : 0));
        C39836FkG.LJII.getClass();
        concurrentHashMap.put("isPad", Integer.valueOf(C60605NqT.LJIIIIZZ(C38262Ezy.LIZ().LIZIZ()) ? 1 : 0));
        C39858Fkc c39858Fkc = C38262Ezy.LIZ().LIZLLL;
        if (c39858Fkc != null) {
            concurrentHashMap.putAll(c39858Fkc);
        }
        this.LJIL = concurrentHashMap;
        this.LJJ = new ArrayList();
    }
}
