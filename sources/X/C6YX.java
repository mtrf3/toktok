package X;

import Y.ACallableS33S1200000_2;
import Y.AgS50S0201000_15;
import Y.AgS85S0101000_2;
import Y.IDHandlerS15S0100000_2;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.vesdk.VEEditor;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6YX, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6YX {
    public C5UO LIZ;
    public InterfaceC162186Yc LIZIZ;
    public final List<Bitmap> LIZJ;
    public int LIZLLL;
    public InterfaceC153045zY LJ;
    public int[] LJFF;
    public InterfaceC133905Ni LJI;
    public final IDHandlerS15S0100000_2 LJII;
    public final HandlerThread LJIIIIZZ;
    public final C6YY LJIIIZ;
    public ProgressDialogC173676rj LJIIJ;
    public MutableLiveData<Bitmap> LJIIJJI;
    public MutableLiveData<Boolean> LJIIL;
    public boolean LJIILIIL;
    public int LJIILJJIL;
    public boolean LJIILL;
    public boolean LJIILLIIL;
    public final AtomicInteger LJIIZILJ;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.6YY] */
    public C6YX() {
        this.LIZJ = FII.LIZ();
        this.LIZLLL = 7;
        this.LJIILIIL = false;
        this.LJIILL = false;
        this.LJIIZILJ = new AtomicInteger(0);
        HandlerThread handlerThread = new HandlerThread("mv_cover_creator");
        this.LJIIIIZZ = handlerThread;
        handlerThread.start();
        this.LJII = new IDHandlerS15S0100000_2(this, handlerThread.getLooper(), 1);
        this.LJIIIZ = new Handler(this) { // from class: X.6YY
            public final WeakReference<C6YX> LIZ;

            {
                this.LIZ = new WeakReference<>(this);
            }

            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                InterfaceC133905Ni interfaceC133905Ni;
                if (this.LIZ.get() == null) {
                    return;
                }
                int i = message.what;
                if (i == 1002) {
                    List<Bitmap> list = (List) message.obj;
                    if (this.LIZ.get().LIZ == null) {
                        return;
                    }
                    this.LIZ.get().LIZ.LIZ(list);
                    if (list == null || list.isEmpty() || ListProtector.get(list, 0) == null) {
                        return;
                    }
                    if (this.LIZ.get().LJIIL != null) {
                        Boolean value = this.LIZ.get().LJIIL.getValue();
                        Boolean bool = Boolean.TRUE;
                        if (bool.equals(value)) {
                            return;
                        } else {
                            this.LIZ.get().LJIIL.setValue(bool);
                        }
                    }
                    if (this.LIZ.get().LJIIJJI != null) {
                        this.LIZ.get().LJIIJJI.setValue(ListProtector.get(list, 0));
                        return;
                    }
                    return;
                }
                if (i == 1003) {
                    C6YX c6yx = this.LIZ.get();
                    C5UO c5uo = c6yx.LIZ;
                    if (c5uo != null) {
                        c5uo.LIZ(c6yx.LIZJ);
                    }
                    InterfaceC153045zY interfaceC153045zY = c6yx.LJ;
                    if (interfaceC153045zY != null) {
                        interfaceC153045zY.LLJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
                    }
                    InterfaceC153045zY interfaceC153045zY2 = c6yx.LJ;
                    if (interfaceC153045zY2 != null && (interfaceC133905Ni = c6yx.LJI) != null) {
                        interfaceC153045zY2.LLFF(interfaceC133905Ni);
                    }
                    HandlerThread handlerThread2 = c6yx.LJIIIIZZ;
                    if (handlerThread2 != null) {
                        handlerThread2.quitSafely();
                    }
                    ProgressDialogC173676rj progressDialogC173676rj = c6yx.LJIIJ;
                    if (progressDialogC173676rj != null) {
                        progressDialogC173676rj.dismiss();
                    }
                    MutableLiveData<Boolean> mutableLiveData = c6yx.LJIIL;
                    if (mutableLiveData != null) {
                        mutableLiveData.setValue(Boolean.FALSE);
                    }
                    c6yx.LIZ = null;
                }
            }
        };
    }

    public final void LIZJ(int i, String str) {
        InterfaceC162186Yc interfaceC162186Yc = this.LIZIZ;
        if (interfaceC162186Yc != null) {
            interfaceC162186Yc.onError(str);
        }
    }

    public final void LIZ(Context context, InterfaceC153045zY interfaceC153045zY, int i, C5UO c5uo) {
        if (context == null) {
            sendEmptyMessage(1003);
            return;
        }
        if (context instanceof Activity) {
            if (((Activity) context).isFinishing()) {
                sendEmptyMessage(1003);
                return;
            }
        } else {
            Activity LIZ = C105574Cj.LIZ(context);
            if (LIZ == null || LIZ.isFinishing()) {
                sendEmptyMessage(1003);
                return;
            }
        }
        if (!this.LJIILIIL) {
            String string = context.getString(R.string.rjz);
            ProgressDialogC173676rj progressDialogC173676rj = new ProgressDialogC173676rj(context);
            progressDialogC173676rj.setCancelable(false);
            progressDialogC173676rj.setIndeterminate(false);
            progressDialogC173676rj.setMax(100);
            if ((context instanceof Activity) && !((Activity) context).isFinishing() && !new C03880Dg(2).LIZJ(300000, "com/ss/android/ugc/tools/view/style/StyleProgressDialog", "show", progressDialogC173676rj, new Object[0], "void", new C65300Pk0(false, "()V", "8102740887797397841")).LIZ) {
                progressDialogC173676rj.show();
            }
            progressDialogC173676rj.setMessage(string);
            View findViewById = progressDialogC173676rj.findViewById(R.id.ia9);
            if (findViewById != null) {
                if (progressDialogC173676rj.LJLIL) {
                    findViewById.setVisibility(0);
                } else {
                    findViewById.setVisibility(4);
                }
            }
            this.LJIIJ = progressDialogC173676rj;
            progressDialogC173676rj.setIndeterminate(true);
        }
        this.LIZ = c5uo;
        this.LIZLLL = i;
        this.LJ = interfaceC153045zY;
        if (interfaceC153045zY == null) {
            sendEmptyMessage(1003);
            return;
        }
        int duration = interfaceC153045zY.getDuration();
        int i2 = this.LIZLLL;
        int[] iArr = new int[i2];
        int i3 = duration / i2;
        for (int i4 = 0; i4 < i2; i4++) {
            iArr[i4] = i3 * i4;
        }
        this.LJFF = iArr;
        this.LJI = new InterfaceC133905Ni() { // from class: X.6Ya
            @Override // X.InterfaceC133905Ni
            public final void LIZ(int i5, int i6, float f, String str) {
                C6YX c6yx = C6YX.this;
                if (i5 == 4101) {
                    if (c6yx.LIZJ.size() >= c6yx.LIZLLL) {
                        c6yx.LJIIIZ.sendEmptyMessage(1003);
                        return;
                    } else {
                        c6yx.LJII.sendEmptyMessage(1001);
                        return;
                    }
                }
                c6yx.getClass();
            }
        };
        interfaceC153045zY.pause();
        interfaceC153045zY.LLIIJLIL(this.LJI);
        interfaceC153045zY.LLJJJIL(0, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
    }

    public C6YX(InterfaceC153045zY interfaceC153045zY, String str, int i, InterfaceC162186Yc interfaceC162186Yc, InterfaceC171226nm interfaceC171226nm, boolean z) {
        this(interfaceC153045zY, str, i, null, interfaceC162186Yc, interfaceC171226nm, false, z);
    }

    public C6YX(InterfaceC153045zY interfaceC153045zY, String str, int i, InterfaceC48038ItG<Bitmap, Bitmap> interfaceC48038ItG, InterfaceC162186Yc interfaceC162186Yc, InterfaceC171226nm interfaceC171226nm) {
        this(interfaceC153045zY, str, i, interfaceC48038ItG, interfaceC162186Yc, interfaceC171226nm, false, false);
    }

    public final void LIZIZ(InterfaceC153045zY interfaceC153045zY, final String str, final long j, int i, final InterfaceC48038ItG<Bitmap, Bitmap> interfaceC48038ItG, final InterfaceC171226nm interfaceC171226nm, boolean z) {
        int LLLII;
        if (!z) {
            this.LJI = new InterfaceC133905Ni(j, str, interfaceC48038ItG, interfaceC171226nm) { // from class: X.5jd
                public final /* synthetic */ String LJLILLLLZI;
                public final /* synthetic */ InterfaceC48038ItG LJLJI;
                public final /* synthetic */ InterfaceC171226nm LJLJJI;

                {
                    this.LJLILLLLZI = str;
                    this.LJLJI = interfaceC48038ItG;
                    this.LJLJJI = interfaceC171226nm;
                }

                @Override // X.InterfaceC133905Ni
                public final void LIZ(int i2, int i3, float f, String str2) {
                    C6YX c6yx = C6YX.this;
                    String str3 = this.LJLILLLLZI;
                    InterfaceC48038ItG interfaceC48038ItG2 = this.LJLJI;
                    InterfaceC171226nm interfaceC171226nm2 = this.LJLJJI;
                    if (i2 != 4101) {
                        c6yx.getClass();
                    } else {
                        if (c6yx.LJIILLIIL) {
                            return;
                        }
                        c6yx.LJIILLIIL = true;
                        C10K.LIZJ(new ACallableS33S1200000_2(c6yx, interfaceC48038ItG2, str3, 2)).LJ(new AgS50S0201000_15(1, c6yx, interfaceC171226nm2, 2), C10K.LJIIIIZZ, null);
                    }
                }
            };
            interfaceC153045zY.pause();
            interfaceC153045zY.LLIIJLIL(this.LJI);
            LLLII = interfaceC153045zY.LLJJJIL(i, VEEditor.SEEK_MODE.EDITOR_SEEK_FLAG_LastSeek);
        } else {
            interfaceC153045zY.LLJJJJLIIL();
            LLLII = interfaceC153045zY.LLLII(new int[]{i}, -1, -1, VEEditor.GET_FRAMES_FLAGS.GET_FRAMES_MODE_NORMAL, new InterfaceC134015Nt() { // from class: X.5jO
                @Override // X.InterfaceC134015Nt
                public final int LIZ(final byte[] bArr, int i2, final int i3, final int i4, float f) {
                    final C6YX c6yx = C6YX.this;
                    final InterfaceC48038ItG interfaceC48038ItG2 = interfaceC48038ItG;
                    final String str2 = str;
                    InterfaceC171226nm interfaceC171226nm2 = interfaceC171226nm;
                    c6yx.getClass();
                    if (bArr == null) {
                        return -1;
                    }
                    C10K.LIZJ(new Callable() { // from class: X.5jN
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C6YX c6yx2 = C6YX.this;
                            int i5 = i3;
                            int i6 = i4;
                            byte[] bArr2 = bArr;
                            InterfaceC48038ItG interfaceC48038ItG3 = interfaceC48038ItG2;
                            String str3 = str2;
                            c6yx2.getClass();
                            try {
                                Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                                createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr2));
                                if (interfaceC48038ItG3 != null) {
                                    try {
                                        createBitmap = (Bitmap) interfaceC48038ItG3.apply(createBitmap);
                                    } catch (Exception e) {
                                        c6yx2.LIZJ(-700, "MvChooseCoverBitmap getCoverWithoutSeek converter error");
                                        C16880lQ.LLLLIIL(e);
                                        return -1;
                                    }
                                }
                                System.currentTimeMillis();
                                boolean LJFF = C42299Git.LJFF(createBitmap, new File(str3), 60, Bitmap.CompressFormat.PNG);
                                C42299Git.LJ(createBitmap);
                                if (!LJFF) {
                                    c6yx2.LIZJ(-600, "MvChooseCoverBitmap getCoverWithoutSeek saveImageBitmap error");
                                    return -1;
                                }
                                return 0;
                            } catch (Exception e2) {
                                StringBuilder LIZ = X1D.LIZ();
                                LIZ.append("MvChooseCoverBitmap getCoverWithoutSeek exception");
                                LIZ.append(e2);
                                c6yx2.LIZJ(-500, X1D.LIZIZ(LIZ));
                                return -1;
                            }
                        }
                    }).LJ(new AgS85S0101000_2(1, interfaceC171226nm2, 2), C10K.LJIIIIZZ, null);
                    return 0;
                }
            });
        }
        if (LLLII != 0) {
            LIZJ(-300, C48263Iwt.LIZLLL("MvChooseCoverBitmap start time ", i, ", seek error ", LLLII));
        }
    }

    public C6YX(InterfaceC153045zY interfaceC153045zY, String str, int i, InterfaceC48038ItG<Bitmap, Bitmap> interfaceC48038ItG, InterfaceC162186Yc interfaceC162186Yc, InterfaceC171226nm interfaceC171226nm, boolean z, boolean z2) {
        this(interfaceC153045zY, str, i, interfaceC48038ItG, interfaceC162186Yc, interfaceC171226nm, z, z2, -1L);
    }

    public C6YX(final InterfaceC153045zY interfaceC153045zY, final String str, final int i, final InterfaceC48038ItG<Bitmap, Bitmap> interfaceC48038ItG, InterfaceC162186Yc interfaceC162186Yc, final InterfaceC171226nm interfaceC171226nm, final boolean z, boolean z2, long j) {
        final long j2 = j;
        this.LIZJ = FII.LIZ();
        this.LIZLLL = 7;
        this.LJIILIIL = false;
        this.LJIILL = false;
        this.LJIIZILJ = new AtomicInteger(0);
        j2 = j2 <= 0 ? System.currentTimeMillis() : j2;
        this.LIZIZ = interfaceC162186Yc;
        if (interfaceC153045zY == null) {
            LIZJ(-100, "MvChooseCoverBitmap veEditor is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LIZJ(-200, "MvChooseCoverBitmap imgPath is null");
            return;
        }
        this.LJ = interfaceC153045zY;
        try {
            if (C44687HgJ.LIZIZ(str)) {
                W5I.LIZ().LIZIZ(android.net.Uri.fromFile(new File(str)));
                C16880lQ.LLLZZIL(new File(str));
            }
            if (z2) {
                C10K.LIZJ(new Callable() { // from class: X.6Yb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        C6YX.this.LIZIZ(interfaceC153045zY, str, j2, i, interfaceC48038ItG, interfaceC171226nm, z);
                        return null;
                    }
                });
            } else {
                LIZIZ(interfaceC153045zY, str, j2, i, interfaceC48038ItG, interfaceC171226nm, z);
            }
        } catch (Exception e) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("MvChooseCoverBitmap exception");
            LIZ.append(e);
            LIZJ(-400, X1D.LIZIZ(LIZ));
        }
    }
}
