package X;

import android.text.TextUtils;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.WlJ, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83217WlJ extends AbstractC83312Wmq<C83160WkO, Void> {
    public final InterfaceC84497XEf LJFF;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final boolean LIZLLL() {
        ComposerBeauty composerBeauty = ((C83160WkO) this.LJ).LIZ;
        if (C1DH.LJJJIL(composerBeauty.getEffect().getEffectId()) < 0) {
            return true;
        }
        return this.LJFF.LJJIL(composerBeauty.getEffect());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final void LIZIZ(C83310Wmo c83310Wmo) {
        InterfaceC84497XEf interfaceC84497XEf = this.LJFF;
        Effect effect = ((C83160WkO) this.LJ).LIZ.getEffect();
        ComposerBeauty composerBeauty = ((C83160WkO) this.LJ).LIZ;
        C83285WmP c83285WmP = new C83285WmP(this, c83310Wmo);
        o.LJIIIZ(composerBeauty, "composerBeauty");
        interfaceC84497XEf.fetchEffect(effect, new C83253Wlt(c83285WmP));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC83312Wmq
    public final void LIZJ(C83310Wmo c83310Wmo) {
        boolean z;
        ComposerBeauty beautyBean = ((C83160WkO) this.LJ).LIZ;
        o.LJIIIZ(beautyBean, "beautyBean");
        File file = new File(beautyBean.getEffect().getUnzipPath());
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File it : listFiles) {
                    o.LJIIIIZZ(it, "it");
                    if (o.LJ(it.getName(), "unzip_begin")) {
                        z = true;
                        break;
                    }
                }
            }
            z = false;
            if (z) {
                if (listFiles != null) {
                    boolean z2 = false;
                    boolean z3 = false;
                    for (File it2 : listFiles) {
                        o.LJIIIIZZ(it2, "it");
                        if (TextUtils.equals("config.json", it2.getName())) {
                            z2 = true;
                        }
                        if (TextUtils.equals("unzip_complete", it2.getName())) {
                            z3 = true;
                        }
                    }
                    if (z2 && z3) {
                        return;
                    }
                }
            } else if (listFiles != null) {
                for (File it3 : listFiles) {
                    o.LJIIIIZZ(it3, "it");
                    if (TextUtils.equals("config.json", it3.getName())) {
                        return;
                    }
                }
            }
        }
        Effect effect = beautyBean.getEffect();
        File file2 = new File(effect.getZipPath());
        File file3 = new File(effect.getUnzipPath());
        try {
            try {
                FileUtils fileUtils = FileUtils.INSTANCE;
                fileUtils.removeDir(effect.getUnzipPath());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(effect.getUnzipPath());
                String str = File.separator;
                LIZ.append(str);
                LIZ.append("unzip_begin");
                fileUtils.createFile(X1D.LIZIZ(LIZ), true);
                C38978FRm.LIZLLL(file2, file3);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(effect.getUnzipPath());
                LIZ2.append(str);
                LIZ2.append("unzip_complete");
                fileUtils.createFile(X1D.LIZIZ(LIZ2), true);
                C82514WZy.LIZJ(0, beautyBean, "success");
            } catch (Exception e) {
                C83175Wkd.LIZ(android.util.Log.getStackTraceString(e));
                InterfaceC82518Wa2 interfaceC82518Wa2 = C82516Wa0.LJ;
                if (interfaceC82518Wa2 != null) {
                    interfaceC82518Wa2.LIZIZ();
                }
                C82514WZy.LIZJ(1, beautyBean, e.toString());
            }
        } finally {
            C16880lQ.LLLZZIL(file2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C83217WlJ(String mTaskId, C83160WkO mParam, InterfaceC84497XEf effectDownloader) {
        super(mTaskId, mParam);
        o.LJIIIZ(mTaskId, "mTaskId");
        o.LJIIIZ(mParam, "mParam");
        o.LJIIIZ(effectDownloader, "effectDownloader");
        this.LJFF = effectDownloader;
    }
}
