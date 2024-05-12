package com.ss.android.ttve.nativePort;

import X.C01R;
import X.C79380VDk;
import X.C79382VDm;
import X.C7MY;
import X.C83743Wtn;
import X.C84127Wzz;
import X.EnumC79379VDj;
import X.InterfaceC83583WrD;
import X.InterfaceC83744Wto;
import X.InterfaceC84042Wyc;
import X.P4Q;
import X.X00;
import X.X09;
import X.X0A;
import X.X0H;
import X.X0I;
import X.X0K;
import X.X0O;
import X.X0Q;
import X.X0T;
import X.X0W;
import X.X0X;
import X.X1D;
import android.util.SparseArray;
import com.ss.android.medialib.presenter.IStickerRequestCallback;
import com.ss.android.vesdk.faceinfo.VEFaceAttributeInfo;
import com.ss.android.vesdk.faceinfo.VEFaceDetectInfo;
import com.ss.android.vesdk.faceinfo.VESkeletonInfo;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public class TEEffectCallback {
    public X09 mARTextBitmapCallback;
    public X0H mARTextCallback;
    public List<C79380VDk> mBachAlgorithmCallbacks;
    public X0O mEffectAlgorithmCallback;
    public X0X mFaceDetectListener;
    public X0Q mFaceInfoCallback;
    public X0W mLandMarkDetectCallback;
    public byte[][] mResult;
    public X0K mSkeletonDetectCallback;
    public X0T mSmartBeautyListener;
    public IStickerRequestCallback mStickerRequestCallback;

    public void setOnSmartBeautyListener(X0T x0t) {
    }

    public void unregBachAlgorithmCallback() {
        this.mBachAlgorithmCallbacks = null;
    }

    public void regBachAlgorithmCallback(List<C79380VDk> list) {
        this.mBachAlgorithmCallbacks = list;
    }

    public void setARTextBitmapCallback(X09 x09) {
        this.mARTextBitmapCallback = x09;
    }

    public void setARTextParagraphContentCallback(X0H x0h) {
        this.mARTextCallback = x0h;
    }

    public void setEffectAlgorithmInfoCallback(X0O x0o) {
        this.mEffectAlgorithmCallback = x0o;
    }

    public void setFaceDetectListener(X0X x0x) {
        this.mFaceDetectListener = x0x;
    }

    public void setFaceInfoCallback(X0Q x0q) {
        this.mFaceInfoCallback = x0q;
    }

    public void setLandmarkDetectListener(X0W x0w) {
        this.mLandMarkDetectCallback = x0w;
    }

    public void setSkeletonDetectCallback(X0K x0k) {
        this.mSkeletonDetectCallback = x0k;
    }

    public void setStickerRequestCallback(IStickerRequestCallback iStickerRequestCallback) {
        this.mStickerRequestCallback = iStickerRequestCallback;
    }

    public void nativeCallback(byte[][] bArr, int i) {
        InterfaceC83583WrD interfaceC83583WrD;
        int i2 = 0;
        if (i != 0) {
            if (i != 1) {
                if (i != 3) {
                    switch (i) {
                        case 5:
                            if (this.mARTextCallback == null) {
                                P4Q.LIZJ("TEEffectCallback", "artext content listener is null");
                                return;
                            }
                            if (bArr == null || bArr.length == 0) {
                                P4Q.LIZJ("TEEffectCallback", "artext param is null");
                                return;
                            }
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("artext param.length is ");
                            C01R.LIZJ(LIZ, bArr.length, LIZ, "TEEffectCallback");
                            String[] strArr = new String[bArr.length];
                            while (i2 < bArr.length) {
                                C84127Wzz c84127Wzz = new C84127Wzz(bArr[i2]);
                                int LIZJ = c84127Wzz.LIZJ();
                                strArr[i2] = c84127Wzz.LIZLLL(LIZJ, LIZJ);
                                StringBuilder LJ = C7MY.LJ("artext param[", i2, "] ");
                                LJ.append(strArr[i2]);
                                LJ.append(", ");
                                LJ.append(bArr[i2].length);
                                P4Q.LJFF("TEEffectCallback", X1D.LIZIZ(LJ));
                                i2++;
                            }
                            this.mARTextCallback.LIZIZ(strArr);
                            return;
                        case 6:
                            if (this.mStickerRequestCallback == null) {
                                P4Q.LIZJ("TEEffectCallback", "sticker request callback listener is null");
                                return;
                            } else {
                                if (bArr == null) {
                                    return;
                                }
                                C84127Wzz c84127Wzz2 = new C84127Wzz(bArr[0]);
                                this.mStickerRequestCallback.onStickerRequested(c84127Wzz2.LJ().longValue(), c84127Wzz2.LIZ());
                                return;
                            }
                        case 7:
                            List<C79380VDk> list = this.mBachAlgorithmCallbacks;
                            if (list == null) {
                                P4Q.LIZJ("TEEffectCallback", "bach algorithm callbacks is null");
                                return;
                            }
                            Iterator<C79380VDk> it = list.iterator();
                            while (it.hasNext()) {
                                if (it.next().LIZ == EnumC79379VDj.AFTER_EFFECT) {
                                    C84127Wzz c84127Wzz3 = new C84127Wzz(bArr[0]);
                                    C79382VDm c79382VDm = new C79382VDm();
                                    c79382VDm.LIZ = c84127Wzz3;
                                    c84127Wzz3.LIZJ();
                                    c79382VDm.LIZ.LIZIZ();
                                    c79382VDm.LIZ.LIZIZ();
                                    c79382VDm.LIZ.LIZIZ();
                                    c79382VDm.LIZ.LIZIZ();
                                    c79382VDm.LIZ.LIZIZ();
                                    c79382VDm.LIZ.LIZIZ();
                                    return;
                                }
                            }
                            return;
                        case 8:
                            if (this.mEffectAlgorithmCallback == null) {
                                P4Q.LIZJ("TEEffectCallback", "effect algorithm listener is null");
                                return;
                            }
                            if (bArr == null) {
                                return;
                            }
                            C84127Wzz c84127Wzz4 = new C84127Wzz(bArr[0]);
                            c84127Wzz4.LIZIZ();
                            int LIZJ2 = c84127Wzz4.LIZJ();
                            SparseArray sparseArray = new SparseArray();
                            while (i2 < LIZJ2) {
                                sparseArray.put((int) c84127Wzz4.LJ().longValue(), Long.valueOf(c84127Wzz4.LJ().longValue()));
                                i2++;
                            }
                            this.mEffectAlgorithmCallback.LIZ();
                            return;
                        case 9:
                            X0K x0k = this.mSkeletonDetectCallback;
                            if (x0k == null) {
                                return;
                            }
                            x0k.LIZ(VESkeletonInfo.convert(bArr));
                            return;
                        default:
                            return;
                    }
                }
                if (this.mLandMarkDetectCallback == null) {
                    P4Q.LIZJ("TEEffectCallback", "detect listener is null");
                    return;
                } else {
                    if (bArr == null) {
                        return;
                    }
                    this.mLandMarkDetectCallback.LIZ(new C84127Wzz(bArr[0]).LIZ());
                    return;
                }
            }
            if (this.mFaceDetectListener == null) {
                P4Q.LIZJ("TEEffectCallback", "detect listener is null");
                return;
            }
            if (bArr == null) {
                return;
            }
            C84127Wzz c84127Wzz5 = new C84127Wzz(bArr[0]);
            c84127Wzz5.LIZJ();
            int LIZJ3 = c84127Wzz5.LIZJ();
            InterfaceC83744Wto interfaceC83744Wto = ((X0I) this.mFaceDetectListener).LIZ;
            if (interfaceC83744Wto == null || (interfaceC83583WrD = (InterfaceC83583WrD) ((C83743Wtn) interfaceC83744Wto).LIZ) == null) {
                return;
            }
            interfaceC83583WrD.onResult(LIZJ3);
            return;
        }
        X0Q x0q = this.mFaceInfoCallback;
        if (x0q == null) {
            P4Q.LIZJ("TEEffectCallback", "face info callback is null");
            return;
        }
        X0A x0a = (X0A) x0q;
        if (bArr == null) {
            Iterator it2 = ((CopyOnWriteArrayList) x0a.LIZ.LJLJI).iterator();
            while (it2.hasNext()) {
                ((InterfaceC84042Wyc) it2.next()).LIZ(null, null);
            }
            return;
        }
        VEFaceAttributeInfo vEFaceAttributeInfo = new VEFaceAttributeInfo();
        vEFaceAttributeInfo.setParcelWrapper(new C84127Wzz(bArr[0]));
        vEFaceAttributeInfo.readFromParcel();
        VEFaceDetectInfo vEFaceDetectInfo = new VEFaceDetectInfo();
        vEFaceDetectInfo.setParcelWrapper(new C84127Wzz(bArr[1]));
        vEFaceDetectInfo.readFromParcel();
        Iterator it3 = ((CopyOnWriteArrayList) x0a.LIZ.LJLJI).iterator();
        while (it3.hasNext()) {
            ((InterfaceC84042Wyc) it3.next()).LIZ(vEFaceAttributeInfo, vEFaceDetectInfo);
        }
    }

    public ByteBuffer nativeCallbackWithResult(byte[][] bArr, int i) {
        if (i == 4) {
            if (this.mARTextBitmapCallback == null) {
                P4Q.LIZJ("TEEffectCallback", "artext bitmap listener is null");
                return null;
            }
            if (bArr == null) {
                return null;
            }
            boolean z = false;
            C84127Wzz c84127Wzz = new C84127Wzz(bArr[0]);
            BefTextLayout befTextLayout = new BefTextLayout();
            befTextLayout.setCharSize(c84127Wzz.LIZJ());
            befTextLayout.setLetterSpacing(c84127Wzz.LIZJ());
            befTextLayout.setLineWidth(c84127Wzz.LIZJ());
            befTextLayout.setLineHeight(c84127Wzz.LIZIZ());
            befTextLayout.setTextAlign(c84127Wzz.LIZJ());
            befTextLayout.setTextIndent(c84127Wzz.LIZJ());
            befTextLayout.setSplit(c84127Wzz.LIZJ());
            befTextLayout.setLineCount(c84127Wzz.LIZJ());
            befTextLayout.setTextColor(c84127Wzz.LIZJ());
            befTextLayout.setBackColor(c84127Wzz.LIZJ());
            if (1 == c84127Wzz.LIZJ()) {
                z = true;
            }
            befTextLayout.setPlaceholder(z);
            int LIZJ = c84127Wzz.LIZJ();
            befTextLayout.setFamilyName(c84127Wzz.LIZLLL(LIZJ, LIZJ));
            int LIZJ2 = c84127Wzz.LIZJ();
            String LIZLLL = c84127Wzz.LIZLLL(LIZJ2, LIZJ2);
            if (LIZLLL == null) {
                P4Q.LIZJ("TEEffectCallback", "Read content failed.");
                return null;
            }
            BefTextLayoutResult LIZLLL2 = this.mARTextBitmapCallback.LIZLLL(LIZLLL, befTextLayout);
            if (LIZLLL2 != null) {
                ByteBuffer allocate = ByteBuffer.allocate(LIZLLL2.getBitmap().getByteCount());
                LIZLLL2.getBitmap().copyPixelsToBuffer(allocate);
                X00 x00 = new X00(LIZLLL2.getBitmap().getByteCount() + 16);
                x00.LJI(LIZLLL2.getWidth());
                x00.LJI(LIZLLL2.getHeight());
                x00.LJI(LIZLLL2.getLineCount());
                x00.LJI(LIZLLL2.getBitmap().getByteCount());
                x00.LIZJ.put(allocate.array());
                x00.LIZJ.rewind();
                return x00.LIZJ;
            }
        }
        return null;
    }
}
