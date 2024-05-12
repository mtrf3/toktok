package Y;

import X.C15070iV;
import X.C6YX;
import X.InterfaceC134015Nt;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.Video2GifCutFragment;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class IDHandlerS15S0100000_2 extends Handler {
    public final int $t;
    public Object l0;

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.$t) {
            case 0:
                handleMessage$0(this, message);
                return;
            case 1:
                handleMessage$1(this, message);
                return;
            default:
                super.handleMessage(message);
                return;
        }
    }

    public static final void handleMessage$0(IDHandlerS15S0100000_2 iDHandlerS15S0100000_2, Message message) {
        int i;
        super.handleMessage(message);
        if (message.what != 0) {
            return;
        }
        CutMultiVideoViewModel cutMultiVideoViewModel = ((Video2GifCutFragment) iDHandlerS15S0100000_2.l0).LJLJLJ;
        long longValue = ((Long) message.obj).longValue();
        List<VideoSegment> ov0 = ((Video2GifCutFragment) iDHandlerS15S0100000_2.l0).LJLJLLL.ov0();
        cutMultiVideoViewModel.LJLJI.setValue(Long.valueOf(longValue));
        int i2 = 0;
        if (cutMultiVideoViewModel.LJLIL.getValue() != null) {
            i = cutMultiVideoViewModel.LJLIL.getValue().LIZIZ.intValue();
        } else {
            i = 0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < ov0.size(); i3++) {
            if (!((VideoSegment) ListProtector.get(ov0, i3)).isDeleted) {
                arrayList.add(ListProtector.get(ov0, i3));
            }
        }
        long j = 0;
        int i4 = 0;
        while (true) {
            if (i4 >= arrayList.size()) {
                break;
            }
            j += ((VideoSegment) ListProtector.get(arrayList, i4)).duration;
            if (j > longValue) {
                i2 = i4;
                break;
            }
            i4++;
        }
        if (longValue <= 0) {
            return;
        }
        cutMultiVideoViewModel.LJLIL.setValue(new C15070iV<>(Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.6YZ] */
    public static final void handleMessage$1(IDHandlerS15S0100000_2 iDHandlerS15S0100000_2, Message message) {
        int length;
        int i;
        final C6YX c6yx = (C6YX) iDHandlerS15S0100000_2.l0;
        c6yx.getClass();
        if (message.what != 1001) {
            c6yx.LJIIIZ.sendEmptyMessage(1003);
            return;
        }
        if (c6yx.LJ == null) {
            c6yx.LJIIIZ.sendEmptyMessage(1003);
            return;
        }
        int i2 = c6yx.LJIIZILJ.get();
        int[] iArr = c6yx.LJFF;
        if (iArr == null) {
            length = 0;
        } else {
            length = iArr.length;
        }
        if (i2 >= length) {
            c6yx.LJIIIZ.sendEmptyMessage(1003);
            return;
        }
        if (c6yx.LJIILL) {
            i = Math.max(c6yx.LJIILJJIL, 240);
        } else {
            i = -1;
        }
        c6yx.LJ.LLD(c6yx.LJFF[c6yx.LJIIZILJ.get()], i, new InterfaceC134015Nt() { // from class: X.6YZ
            @Override // X.InterfaceC134015Nt
            public final int LIZ(byte[] bArr, int i3, int i4, int i5, float f) {
                int length2;
                boolean z;
                C6YX c6yx2 = C6YX.this;
                int i6 = c6yx2.LJIIZILJ.get();
                int[] iArr2 = c6yx2.LJFF;
                if (iArr2 == null) {
                    length2 = 0;
                } else {
                    length2 = iArr2.length;
                }
                if (i6 >= length2) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    c6yx2.LJIIIZ.sendEmptyMessage(1003);
                } else {
                    Bitmap createBitmap = Bitmap.createBitmap(i4, i5, Bitmap.Config.ARGB_8888);
                    createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
                    c6yx2.LIZJ.add(createBitmap);
                    c6yx2.LJIIZILJ.incrementAndGet();
                    if (c6yx2.LJIIZILJ.get() == 1) {
                        ArrayList arrayList = new ArrayList(c6yx2.LIZLLL);
                        for (int i7 = 0; i7 < c6yx2.LIZLLL; i7++) {
                            arrayList.add(createBitmap);
                        }
                        Message message2 = new Message();
                        message2.obj = arrayList;
                        message2.what = 1002;
                        c6yx2.LJIIIZ.sendMessage(message2);
                    }
                    if (c6yx2.LJIIZILJ.get() < c6yx2.LIZLLL) {
                        c6yx2.LJII.sendEmptyMessage(1001);
                    } else {
                        c6yx2.LJIIIZ.sendEmptyMessage(1003);
                    }
                }
                return 0;
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IDHandlerS15S0100000_2(Object obj, Looper looper, int i) {
        super(looper);
        this.$t = i;
        this.l0 = obj;
    }
}
