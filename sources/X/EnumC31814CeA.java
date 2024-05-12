package X;

import Y.ACallableS108S0100000_5;
import Y.AfS36S0101000_5;
import Y.IDaS216S0100000_5;
import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.livesdkapi.host.IHostCreativeTool;
import com.zhiliaoapp.musically.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.jvm.internal.o;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: X.CeA, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class EnumC31814CeA implements InterfaceC15310it {
    public static final EnumC31814CeA INST;
    public static final String LJLJJI;
    public static final String LJLJJL;
    public static final String LJLJJLL;
    public static final String LJLJL;
    public static final String LJLJLJ;
    public static final String LJLJLLL;
    public static final String LJLL;
    public static final String LJLLI;
    public static final String LJLLILLLL;
    public static final String[] LJLLJ;
    public static final String[] LJLLL;
    public static final String LJLLLL;
    public static final /* synthetic */ EnumC31814CeA[] LJLLLLLL;
    public String LJLILLLLZI;
    public final java.util.Map<String, Object> LJLIL = new HashMap();
    public boolean LJLJI = false;
    public MutableLiveData<Boolean> isLoadedRes = new MutableLiveData<>();

    public synchronized void loadResources() {
        C0NB.LIZIZ("LiveCameraResManager", "call loadResources");
        if (this.LJLJI) {
            C0NB.LIZIZ("LiveCameraResManager", "resources is loading, return");
            return;
        }
        if ("0.0.21".equals(InterfaceC30442Bx8.LJIIJ.LIZJ())) {
            C0NB.LIZIZ("LiveCameraResManager", "resources is already loaded, return");
            if (this.isLoadedRes.getValue() == null || !this.isLoadedRes.getValue().booleanValue()) {
                AbstractC73672Svk.LJJIJIL(1).LJJJ(C73969T1h.LIZIZ()).LJJJJZI(new AfS36S0101000_5(1, this, 51));
            }
            return;
        }
        this.LJLJI = true;
        AbstractC73745Swv.LIZLLL(new ACallableS108S0100000_5(this, 0)).LJIILJJIL(T16.LIZ()).LJII(C73969T1h.LIZIZ()).LJIIJJI(new AfS36S0101000_5(1, this, 5), new AfS36S0101000_5(1, this, 6), new IDaS216S0100000_5(this, 3), EnumC73750Sx0.INSTANCE);
    }

    static {
        String[] stringArray;
        String[] stringArray2;
        EnumC31814CeA enumC31814CeA = new EnumC31814CeA();
        INST = enumC31814CeA;
        LJLLLLLL = new EnumC31814CeA[]{enumC31814CeA};
        LJLJJI = C15380j0.LJIILJJIL(R.string.swt);
        LJLJJL = C15380j0.LJIILJJIL(R.string.sws);
        LJLJLLL = C15380j0.LJIILJJIL(R.string.swv);
        LJLJJLL = C15380j0.LJIILJJIL(R.string.sww);
        LJLJL = C15380j0.LJIILJJIL(R.string.swq);
        LJLJLJ = C15380j0.LJIILJJIL(R.string.swp);
        LJLLI = C15380j0.LJIILJJIL(R.string.sx0);
        LJLL = C15380j0.LJIILJJIL(R.string.swy);
        LJLLILLLL = C15380j0.LJIILJJIL(R.string.swz);
        Context LIZLLL = C15380j0.LIZLLL();
        if (LIZLLL == null) {
            stringArray = new String[0];
        } else {
            stringArray = LIZLLL.getResources().getStringArray(R.array.be);
        }
        LJLLJ = new String[stringArray.length];
        for (int i = 0; i < stringArray.length; i++) {
            String[] strArr = LJLLJ;
            StringBuilder LIZ = X1D.LIZ();
            strArr[i] = JBR.LJFF(LIZ, stringArray[i], ".zip", LIZ);
        }
        Context LIZLLL2 = C15380j0.LIZLLL();
        if (LIZLLL2 == null) {
            stringArray2 = new String[0];
        } else {
            stringArray2 = LIZLLL2.getResources().getStringArray(R.array.bf);
        }
        LJLLL = stringArray2;
        File dir = C15380j0.LIZLLL().getDir(LJLJJI, 0);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(dir.getAbsolutePath());
        LIZ2.append(File.separator);
        LJLLLL = X1D.LIZIZ(LIZ2);
    }

    public static EnumC31814CeA[] values() {
        return (EnumC31814CeA[]) LJLLLLLL.clone();
    }

    public boolean isLoadedRes() {
        if (this.isLoadedRes.getValue() == null) {
            this.isLoadedRes.setValue(Boolean.valueOf("0.0.21".equals(InterfaceC30442Bx8.LJIIJ.LIZJ())));
        }
        return this.isLoadedRes.getValue().booleanValue();
    }

    public void loadSmoothComposerFile() {
        if (new File(getSmoothComposerFilePath()).exists()) {
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        String LJFF = JBR.LJFF(LIZ, LJLLI, ".zip", LIZ);
        AssetManager assets = C15380j0.LIZLLL().getAssets();
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(LJLLLL);
            LIZ2.append(LJFF);
            LIZJ(assets, LJFF, X1D.LIZIZ(LIZ2));
            LIZLLL(LJFF);
        } catch (IOException e) {
            C16880lQ.LLLLIIL(e);
            C0NB.LJI("LiveCameraResManager", e);
        }
    }

    public String getBeautyComposerFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLJLJ);
        return X1D.LIZIZ(LIZ);
    }

    public String getBeautyFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLJL);
        String LIZIZ = X1D.LIZIZ(LIZ);
        if (C15420j4.LIZ(LIZIZ)) {
            return LIZIZ;
        }
        return "";
    }

    public String getFaceReshapeFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLJLLL);
        return X1D.LIZIZ(LIZ);
    }

    public String getFilterFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLJJLL);
        return X1D.LIZIZ(LIZ);
    }

    public String getLiveComposerFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLJJL);
        return X1D.LIZIZ(LIZ);
    }

    public String getROIResPath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLLILLLL);
        return X1D.LIZIZ(LIZ);
    }

    public String getReshapeComposerFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLL);
        return X1D.LIZIZ(LIZ);
    }

    public String getSmoothComposerFilePath() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(LJLLLL);
        LIZ.append(LJLLI);
        return X1D.LIZIZ(LIZ);
    }

    public String getLastTimeFailedReason() {
        return this.LJLILLLLZI;
    }

    public String getModelFilePath() {
        return LJLLLL;
    }

    public static void LIZLLL(String str) {
        StringBuilder LIZ = X1D.LIZ();
        String str2 = LJLLLL;
        String LJFF = JBR.LJFF(LIZ, str2, str, LIZ);
        ZipInputStream zipInputStream = new ZipInputStream(new BufferedInputStream(new FileInputStream(LJFF)));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("..");
        LIZ2.append(File.separator);
        String LIZIZ = X1D.LIZIZ(LIZ2);
        while (true) {
            ZipEntry nextEntry = zipInputStream.getNextEntry();
            if (nextEntry != null) {
                String name = nextEntry.getName();
                if (C38354F3m.LJ(name) || !name.contains(LIZIZ)) {
                    if (nextEntry.isDirectory()) {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(str2);
                        new File(JBR.LJFF(LIZ3, File.separator, name, LIZ3)).mkdirs();
                    } else {
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(str2);
                        File file = new File(JBR.LJFF(LIZ4, File.separator, name, LIZ4));
                        if (file.exists()) {
                            C16880lQ.LLLZZIL(file);
                        } else {
                            file.getParentFile().mkdirs();
                        }
                        file.createNewFile();
                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                        byte[] bArr = new byte[2048];
                        while (true) {
                            int read = zipInputStream.read(bArr);
                            if (read == -1) {
                                break;
                            } else {
                                bufferedOutputStream.write(bArr, 0, read);
                            }
                        }
                        bufferedOutputStream.flush();
                        bufferedOutputStream.close();
                    }
                } else {
                    throw new IOException("Unzip maybe be unsafe.");
                }
            } else {
                zipInputStream.close();
                StringBuilder LIZ5 = X1D.LIZ();
                LIZ5.append("1 file unzipped: ");
                LIZ5.append(LJFF);
                C0NB.LIZIZ("LiveCameraResManager", X1D.LIZIZ(LIZ5));
                return;
            }
        }
    }

    public static EnumC31814CeA valueOf(String str) {
        return (EnumC31814CeA) V0N.LJJJ(EnumC31814CeA.class, str);
    }

    public Object getResourceFinder(Context context) {
        Object value = C7N.LJI.getValue();
        o.LJIIIIZZ(value, "<get-hostCreativeTool>(...)");
        return ((IHostCreativeTool) value).rc(context, getModelFilePath());
    }

    public static void LIZJ(AssetManager assetManager, String str, String str2) {
        C64535PUl c64535PUl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            InputStream open = assetManager.open(str);
            try {
                PUE LJII = PU7.LJII(open);
                try {
                    File file = new File(str2);
                    if (file.exists()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("old file found when copy res, path is ");
                        LIZ.append(file.getAbsolutePath());
                        C0NB.LIZIZ("LiveCameraResManager", X1D.LIZIZ(LIZ));
                        boolean LLLZZIL = C16880lQ.LLLZZIL(file);
                        StringBuilder LIZ2 = X1D.LIZ();
                        LIZ2.append("old file delete result: ");
                        LIZ2.append(LLLZZIL);
                        C0NB.LIZIZ("LiveCameraResManager", X1D.LIZIZ(LIZ2));
                    }
                    PUG LJ = PU7.LJ(file);
                    try {
                        c64535PUl = new C64535PUl(LJ);
                        try {
                            c64535PUl.j(LJII);
                            c64535PUl.flush();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("1 file copied: ");
                            LIZ3.append(file.getAbsolutePath());
                            C0NB.LIZIZ("LiveCameraResManager", X1D.LIZIZ(LIZ3));
                            c64535PUl.close();
                            LJ.close();
                            LJII.close();
                            open.close();
                        } catch (Throwable th) {
                            th = th;
                            if (c64535PUl != null) {
                                c64535PUl.close();
                            }
                            if (LJ != null) {
                                LJ.close();
                            }
                            if (LJII != null) {
                                LJII.close();
                            }
                            if (open != null) {
                                open.close();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        c64535PUl = null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
        }
    }
}
