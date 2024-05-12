package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.effectcreatormobile.camera.face.FaceDistortionViewModel;
import kotlin.jvm.internal.o;

/* renamed from: X.ahy, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94498ahy extends ViewModelProvider.NewInstanceFactory {
    public final C93886aY6 LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final long LJI;

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    public final <T extends ViewModel> T create(Class<T> modelClass) {
        o.LJIIIZ(modelClass, "modelClass");
        if (this.LIZIZ.length() > 0) {
            return new FaceDistortionViewModel(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF);
        }
        return new FaceDistortionViewModel(this.LIZ, this.LJI);
    }

    public C94498ahy(C93886aY6 veRecordHelper, String str, String str2, String displayName, String str3, String str4, long j) {
        o.LJIIIZ(veRecordHelper, "veRecordHelper");
        o.LJIIIZ(displayName, "displayName");
        this.LIZ = veRecordHelper;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = displayName;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = j;
    }
}
