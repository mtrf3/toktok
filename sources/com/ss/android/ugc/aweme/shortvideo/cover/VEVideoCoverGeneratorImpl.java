package com.ss.android.ugc.aweme.shortvideo.cover;

import X.C10K;
import X.C145995oB;
import X.C6YE;
import X.C82259WQd;
import X.C82891Wg3;
import X.InterfaceC153045zY;
import X.InterfaceC162616Zt;
import X.ORZ;
import X.WM7;
import Y.ACallableS79S0101000_7;
import android.graphics.Bitmap;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.vesdk.VEEditor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;

/* loaded from: classes3.dex */
public class VEVideoCoverGeneratorImpl implements GenericLifecycleObserver, InterfaceC162616Zt {
    public final int LJLIL;
    public int LJLILLLLZI;
    public final InterfaceC153045zY LJLJI;
    public int[] LJLJJI;
    public final String LJLJJL;
    public final List<Long> LJLJJLL = new ArrayList();
    public final VEEditor.GET_FRAMES_FLAGS LJLJL;

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC162616Zt
    public final void reset() {
        this.LJLILLLLZI = -1;
        this.LJLJJI = null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        C10K.LIZJ(new ACallableS79S0101000_7(0, this, 2));
        List<Long> fetchFrameTimeList = this.LJLJJLL;
        String scene = this.LJLJJL;
        o.LJIIIZ(fetchFrameTimeList, "fetchFrameTimeList");
        o.LJIIIZ(scene, "scene");
        ArrayList arrayList = (ArrayList) fetchFrameTimeList;
        if (arrayList.isEmpty()) {
            return;
        }
        C82891Wg3 c82891Wg3 = C82891Wg3.LJIIIZ;
        c82891Wg3.getClass();
        C6YE c6ye = (C6YE) C82891Wg3.LJ.LIZ(c82891Wg3, C82891Wg3.LIZ[3]);
        C145995oB c145995oB = new C145995oB();
        c145995oB.LIZIZ(ORZ.LLILLJJLI(fetchFrameTimeList), "duration");
        c145995oB.LIZ(arrayList.size(), "count");
        c145995oB.LJI(WM7.SCENE_SERVICE, scene);
        c6ye.onEvent("tool_performance_fetch_frames", c145995oB.LIZ);
    }

    @Override // X.InterfaceC162616Zt
    public final int LIZIZ() {
        return this.LJLIL;
    }

    public int[] LIZJ(int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = i / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        return iArr;
    }

    @Override // X.InterfaceC162616Zt
    public final void LIZ(int i, int i2, final C82259WQd c82259WQd) {
        boolean z;
        final int i3 = i2;
        final int i4 = i;
        int duration = this.LJLJI.getDuration();
        int i5 = this.LJLILLLLZI;
        if (i5 <= 0 || i5 != duration) {
            this.LJLILLLLZI = duration;
            z = true;
        } else {
            z = false;
        }
        if (this.LJLJJI == null || z) {
            this.LJLJJI = LIZJ(this.LJLILLLLZI, this.LJLIL);
        }
        final int[] iArr = this.LJLJJI;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        if (i3 > i4 && i4 != -1) {
            i3 = -1;
        } else if (i3 != -1) {
            i4 = -1;
        } else {
            i3 = -1;
        }
        final long currentTimeMillis = System.currentTimeMillis();
        C10K.LIZJ(new Callable() { // from class: X.5SV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                final VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl = VEVideoCoverGeneratorImpl.this;
                int[] iArr2 = iArr;
                int i6 = i4;
                int i7 = i3;
                final C5SU c5su = c82259WQd;
                final AtomicInteger atomicInteger2 = atomicInteger;
                final long j = currentTimeMillis;
                vEVideoCoverGeneratorImpl.getClass();
                for (int i8 : iArr2) {
                    C5NP LIZLLL = C82891Wg3.LIZLLL();
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("VEVideoCoverGeneratorImpl: generateBitmaps begin，timeStamps: ");
                    LIZ.append(i8);
                    LIZLLL.LIZ(X1D.LIZIZ(LIZ));
                }
                C5NP LIZLLL2 = C82891Wg3.LIZLLL();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("VEVideoCoverGeneratorImpl: generateBitmaps begin，duration: ");
                LIZ2.append(vEVideoCoverGeneratorImpl.LJLJI.getDuration());
                LIZLLL2.LIZ(X1D.LIZIZ(LIZ2));
                InterfaceC153045zY interfaceC153045zY = vEVideoCoverGeneratorImpl.LJLJI;
                VEEditor.GET_FRAMES_FLAGS get_frames_flags = vEVideoCoverGeneratorImpl.LJLJL;
                if (get_frames_flags == null) {
                    get_frames_flags = VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NOEFFECT;
                }
                interfaceC153045zY.LLLII(iArr2, i6, i7, get_frames_flags, new InterfaceC134015Nt() { // from class: X.5SS
                    @Override // X.InterfaceC134015Nt
                    public final int LIZ(byte[] bArr, int i9, int i10, int i11, float f) {
                        final VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl2 = VEVideoCoverGeneratorImpl.this;
                        final C5SU c5su2 = c5su;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        final long j2 = j;
                        vEVideoCoverGeneratorImpl2.getClass();
                        if (bArr != null) {
                            C5NP LIZLLL3 = C82891Wg3.LIZLLL();
                            StringBuilder LIZ3 = X1D.LIZ();
                            LIZ3.append("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData，bytes: ");
                            LIZ3.append(bArr.length);
                            LIZLLL3.LIZ(X1D.LIZIZ(LIZ3));
                            final Bitmap createBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
                            createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                            C10K.LIZIZ(new Callable() { // from class: X.5ST
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    VEVideoCoverGeneratorImpl vEVideoCoverGeneratorImpl3 = VEVideoCoverGeneratorImpl.this;
                                    C5SU c5su3 = c5su2;
                                    AtomicInteger atomicInteger4 = atomicInteger3;
                                    Bitmap bitmap = createBitmap;
                                    long j3 = j2;
                                    vEVideoCoverGeneratorImpl3.getClass();
                                    c5su3.LIZ(atomicInteger4.get(), bitmap);
                                    atomicInteger4.incrementAndGet();
                                    ((ArrayList) vEVideoCoverGeneratorImpl3.LJLJJLL).add(C44847Hit.LIZ(j3));
                                    return null;
                                }
                            }, C10K.LJIIIIZZ, null);
                            return 0;
                        }
                        C82891Wg3.LIZLLL().LIZ("VEVideoCoverGeneratorImpl: generateBitmaps onGetImageData end，bytes: null");
                        if (atomicInteger3.get() == vEVideoCoverGeneratorImpl2.LJLIL) {
                            return 0;
                        }
                        C5NP LIZLLL4 = C82891Wg3.LIZLLL();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append("VEVideoCoverGeneratorImpl:cover size not correct，want");
                        LIZ4.append(vEVideoCoverGeneratorImpl2.LJLIL);
                        LIZ4.append("，actually");
                        LIZ4.append(atomicInteger3.get());
                        LIZLLL4.LIZ(X1D.LIZIZ(LIZ4));
                        return 0;
                    }
                });
                return null;
            }
        });
    }

    public VEVideoCoverGeneratorImpl(InterfaceC153045zY interfaceC153045zY, LifecycleOwner lifecycleOwner, int i, VEEditor.GET_FRAMES_FLAGS get_frames_flags, String str) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.LJLJI = interfaceC153045zY;
        this.LJLIL = i;
        this.LJLJL = get_frames_flags;
        this.LJLJJL = str;
    }
}
