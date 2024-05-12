package X;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.filter.repository.internal.main.AndroidResourceFilterBackupPreferences;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public class WRB implements InterfaceC82271WQp {
    public final C62822Ol8 LIZ;
    public final Context LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final List<OSZ<int[], String>> LJ;
    public final InterfaceC139745e6<WRE> LJFF;
    public final AndroidResourceFilterBackupPreferences LJI;

    public final WRE LJ() {
        return (WRE) this.LIZ.getValue();
    }

    public boolean LJFF() {
        throw null;
    }

    @Override // X.InterfaceC82271WQp
    public List<C79155V4t> LIZIZ() {
        List list;
        LIZLLL();
        String[] strArr = LJ().LIZ;
        String[] strArr2 = LJ().LIZIZ;
        ArrayList arrayList = new ArrayList(strArr.length);
        int length = strArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            String str = strArr[i];
            int i3 = i2 + 1;
            int intValue = LJ().LIZJ[i2].intValue();
            int i4 = (-1) - i2;
            String valueOf = String.valueOf(i4);
            String str2 = strArr2[i2];
            if (i2 == 0) {
                list = C47261Igj.LJJIJIL("normal");
            } else {
                list = C61878OQg.INSTANCE;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("res://");
            LIZ.append(this.LIZIZ.getPackageName());
            LIZ.append('/');
            LIZ.append(intValue);
            arrayList.add(new C79155V4t(i4, valueOf, str, "", str2, null, list, null, UriProtector.parse(X1D.LIZIZ(LIZ)), ""));
            i++;
            i2 = i3;
        }
        return arrayList;
    }

    public final void LIZLLL() {
        if (this.LIZLLL != this.LJI.getResourcesVersion() || !LJFF()) {
            for (OSZ<int[], String> osz : this.LJ) {
                Context context = this.LIZIZ;
                int[] first = osz.getFirst();
                String second = osz.getSecond();
                if (TextUtils.equals(Build.BRAND, "Xiaomi") && !C1FP.LJIJ("android.content.res.MiuiResourcesImpl")) {
                    C1FP.LJIJ("android.content.res.MiuiResources");
                }
                for (int i : first) {
                    C38978FRm.LIZJ(context, i, second);
                }
            }
            this.LJI.setResourcesVersion(this.LIZLLL);
        }
    }

    @Override // X.InterfaceC82271WQp
    public final void invalidate() {
        this.LJI.setResourcesVersion(-1);
    }

    @Override // X.InterfaceC82271WQp
    public C82273WQr LIZ(int i) {
        File parentFile;
        String absolutePath;
        String LJIILIIL = C77412UZs.LJIILIIL(LJI((-1) - i));
        if (!TextUtils.isEmpty(LJIILIIL)) {
            File file = new File(LJIILIIL);
            if (file.exists() && file.isFile() && (parentFile = file.getParentFile().getParentFile()) != null && parentFile.exists() && parentFile.isDirectory()) {
                absolutePath = parentFile.getAbsolutePath();
                o.LJIIIIZZ(absolutePath, "p.absolutePath");
                return new C82273WQr(LJIILIIL, absolutePath);
            }
        }
        absolutePath = "";
        return new C82273WQr(LJIILIIL, absolutePath);
    }

    @Override // X.InterfaceC82271WQp
    public final boolean LIZJ(C79155V4t filterMeta) {
        o.LJIIIZ(filterMeta, "filterMeta");
        if (filterMeta.LIZ < 0) {
            return true;
        }
        return false;
    }

    public final String LJI(int i) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C17N.LJJIJIL(this.LIZJ));
        LIZ.append(LJ().LIZLLL[i]);
        return X1D.LIZIZ(LIZ);
    }

    public WRB(Context context, String filterRootDir, int i, List list, AndroidResourceFilterBackupPreferences preferences) {
        InterfaceC139745e6 interfaceC139745e6 = HND.LJLIL;
        o.LJIIIZ(filterRootDir, "filterRootDir");
        o.LJIIIZ(preferences, "preferences");
        this.LIZIZ = context;
        this.LIZJ = filterRootDir;
        this.LIZLLL = i;
        this.LJ = list;
        this.LJFF = interfaceC139745e6;
        this.LJI = preferences;
        this.LIZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 352));
    }
}
