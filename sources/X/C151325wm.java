package X;

import Y.ARunnableS8S0110000_2;
import android.graphics.Bitmap;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.ss.android.ttve.nativePort.TEImageInterface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.5wm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C151325wm {
    public static final /* synthetic */ int LJIIIIZZ = 0;
    public SurfaceView LIZ;
    public SurfaceHolderCallbackC151355wp LIZIZ;
    public InterfaceC151875xf LIZJ;
    public InterfaceC151855xd LIZLLL;
    public InterfaceC151865xe LJ;
    public InterfaceC151845xc LJFF;
    public final List<Runnable> LJI;
    public TEImageInterface LJII;

    public C151325wm() {
        this(0);
    }

    public final void LIZIZ() {
        TEImageInterface tEImageInterface = this.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.confrimOriginalLayerParams();
        }
    }

    public final Bitmap LJI() {
        TEImageInterface tEImageInterface = this.LJII;
        if (tEImageInterface == null) {
            return null;
        }
        int[] outputSize = tEImageInterface.getOutputSize();
        Bitmap createBitmap = Bitmap.createBitmap(outputSize[0], outputSize[1], Bitmap.Config.ARGB_8888);
        if (tEImageInterface.saveCurrentImage(createBitmap, -1, -1) < 0) {
            return null;
        }
        return createBitmap;
    }

    public C151325wm(int i) {
        SurfaceHolder holder;
        this.LIZ = null;
        this.LIZIZ = new SurfaceHolderCallbackC151355wp(this, null, null);
        this.LJI = new ArrayList();
        SurfaceView surfaceView = this.LIZ;
        if (surfaceView != null && (holder = surfaceView.getHolder()) != null) {
            holder.addCallback(this.LIZIZ);
        }
    }

    public static void LIZLLL(C151325wm c151325wm) {
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.doRenderEffect(false);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x005a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0043 A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C151195wZ LJIIIIZZ(X.C151325wm r15) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C151325wm.LJIIIIZZ(X.5wm):X.5wZ");
    }

    public final void LJ(InterfaceC151725xQ interfaceC151725xQ, boolean z) {
        if (this.LIZIZ.LJLJJI != EnumC151405wu.Changed) {
            ((ArrayList) this.LJI).add(new ARunnableS8S0110000_2(this, z, interfaceC151725xQ, 4));
        } else {
            TEImageInterface tEImageInterface = this.LJII;
            if (tEImageInterface != null) {
                tEImageInterface.renderLayerQueue(z);
            }
            if (interfaceC151725xQ == null) {
                return;
            }
            interfaceC151725xQ.LIZ();
        }
    }

    public final void LJIIIZ(int i, int i2) {
        TEImageInterface tEImageInterface;
        if (i >= 0 && (tEImageInterface = this.LJII) != null) {
            tEImageInterface.setInfoStickerLayer(i, i2);
        }
    }

    public final void LIZJ(int i, float f, float f2) {
        TEImageInterface tEImageInterface;
        if (i >= 0 && (tEImageInterface = this.LJII) != null) {
            tEImageInterface.doInfoStickerTranslateWithScreenResolution(i, f, f2);
        }
    }

    public final void LJIIJ(int i, float f, float f2) {
        TEImageInterface tEImageInterface;
        if (i >= 0 && (tEImageInterface = this.LJII) != null) {
            tEImageInterface.setInfoStickerScale(i, f, f2);
        }
    }

    public static void LJII(C151325wm c151325wm, int i, int i2, C151595xD c151595xD) {
        EnumC151615xF veImageInstanceType = EnumC151615xF.VEImageInstanceTypeNormalPublish;
        o.LJIIIZ(veImageInstanceType, "veImageInstanceType");
        c151325wm.LJII = TEImageInterface.createVEImage(i, i2, true, false, veImageInstanceType.ordinal(), c151595xD);
        c151325wm.LIZJ = (InterfaceC151875xf) C36539EVr.LJ("com.ss.android.vesdk.VEImageVectorInvoker", new Class[]{C151325wm.class}, c151325wm);
        c151325wm.LIZLLL = (InterfaceC151855xd) C36539EVr.LJ("com.ss.android.vesdk.VEImageBrushInvoker", new Class[]{C151325wm.class}, c151325wm);
        c151325wm.LJ = (InterfaceC151865xe) C36539EVr.LJ("com.ss.android.vesdk.VEImageUndoRedoInvoker", new Class[]{C151325wm.class}, c151325wm);
        c151325wm.LJFF = (InterfaceC151845xc) C36539EVr.LJ("com.ss.android.vesdk.VEImageALGCallbackInvoker", new Class[]{C151325wm.class}, c151325wm);
    }

    public final void LJIIJJI(String str, String rightPath, float f, float f2, float f3) {
        o.LJIIIZ(rightPath, "rightPath");
        TEImageInterface tEImageInterface = this.LJII;
        if (tEImageInterface != null) {
            tEImageInterface.setStickerFilterNew("stickerFilterNew", str, rightPath, f, f2, f3);
        }
    }

    public static Integer LIZ(C151325wm c151325wm, String path, float f, float f2, float f3, float f4) {
        int i;
        o.LJIIIZ(path, "path");
        String[] strArr = {String.valueOf(f), String.valueOf(f2), String.valueOf(f3), String.valueOf(f4), String.valueOf(0)};
        TEImageInterface tEImageInterface = c151325wm.LJII;
        if (tEImageInterface != null) {
            i = tEImageInterface.addInfoSticker(path, strArr, null);
        } else {
            i = -1;
        }
        return Integer.valueOf(i);
    }
}
