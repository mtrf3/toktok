package Y;

import X.ActivityC45651qj;
import X.C0IB;
import X.C124794v5;
import X.C140475fH;
import X.C1550566r;
import X.C161236Ul;
import X.C161316Ut;
import X.C164116cJ;
import X.C164246cW;
import X.C17N;
import X.C32I;
import X.C52529KjV;
import X.C63K;
import X.C6U9;
import X.C6UA;
import X.C6UD;
import X.EnumC161246Um;
import X.H78;
import X.InterfaceC124924vI;
import X.InterfaceC142515iZ;
import X.InterfaceC150395vH;
import X.OSZ;
import X.X1D;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.nle.editor_jni.NLETrack;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.image.model.ImageStickerInfoNewEngine;
import com.ss.android.ugc.aweme.image.model.ImageSynthesisResult;
import com.ss.android.ugc.aweme.image.model.SingleImageData;
import com.ss.android.ugc.aweme.sticker.StickerContainerService;
import com.ss.android.ugc.aweme.tools.sticker.core.StickerModel;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS168S0100000_2;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes3.dex */
public class ARunnableS3S0301000_2 implements Runnable {
    public final int $t;
    public int i3;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                return;
            case 1:
                run$1(this);
                return;
            case 2:
                run$2(this);
                return;
            case 3:
                run$3(this);
                return;
            case 4:
                run$4(this);
                return;
            default:
                return;
        }
    }

    public final void LIZ$0() {
        ActivityC45651qj activityC45651qj;
        List<StickerModel> allStickers;
        SingleImageData singleImageData = (SingleImageData) ListProtector.get(((C161236Ul) this.l0).LJLJJI.getImageList(), this.i3);
        if (singleImageData.getEditImageInfo().isFullScreen()) {
            ((ImageView) this.l1).setScaleType(ImageView.ScaleType.CENTER_CROP);
        } else {
            ((ImageView) this.l1).setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        if (((C161236Ul) this.l0).LJLJJL[this.i3] != null) {
            ImageView imageView = (ImageView) this.l1;
            ImageSynthesisResult imageSynthesisResult = ((C161236Ul) this.l0).LJLJJL[this.i3];
            o.LJI(imageSynthesisResult);
            imageView.setImageURI(Uri.fromFile(new File(imageSynthesisResult.getPath())));
        } else {
            ((ImageView) this.l1).setImageURI(UriProtector.parse(singleImageData.getSrcImageInfo().getPath()));
        }
        C161236Ul c161236Ul = (C161236Ul) this.l0;
        View imagePreviewRoot = (View) this.l2;
        o.LJIIIIZZ(imagePreviewRoot, "imagePreviewRoot");
        c161236Ul.getClass();
        ImageStickerInfoNewEngine stickerInfoNewEngine = singleImageData.getStickerInfoNewEngine();
        if (stickerInfoNewEngine != null && stickerInfoNewEngine.hasSticker()) {
            ((ViewStub) imagePreviewRoot.findViewById(R.id.kko)).inflate();
            FrameLayout frameLayout = (FrameLayout) imagePreviewRoot.findViewById(R.id.kid);
            Activity activity = c161236Ul.LJLILLLLZI;
            List<StickerModel> list = null;
            if ((activity instanceof ActivityC45651qj) && (activityC45651qj = (ActivityC45651qj) activity) != null) {
                int width = imagePreviewRoot.getWidth();
                int ratio = (int) (width / singleImageData.getEditImageInfo().getRatio());
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(width, ratio);
                layoutParams.gravity = 17;
                frameLayout.setLayoutParams(layoutParams);
                C6U9 container = StickerContainerService.LIZ().getContainer();
                container.LIZIZ(new C6UA(EnumC161246Um.PREVIEW, frameLayout, new C6UD(width, ratio, 16), activityC45651qj, null, null, null, null, new AqS168S0100000_2(c161236Ul, 197), 496));
                ImageStickerInfoNewEngine stickerInfoNewEngine2 = singleImageData.getStickerInfoNewEngine();
                if (stickerInfoNewEngine2 != null && (allStickers = stickerInfoNewEngine2.getAllStickers()) != null) {
                    ArrayList arrayList = new ArrayList(C32I.LJJL(allStickers, 10));
                    Iterator<StickerModel> it = allStickers.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getInteractStickerStruct());
                    }
                    ImageStickerInfoNewEngine stickerInfoNewEngine3 = singleImageData.getStickerInfoNewEngine();
                    if (stickerInfoNewEngine3 != null) {
                        list = stickerInfoNewEngine3.getAllStickers();
                    }
                    C161316Ut.LIZ(container, arrayList, list, 12);
                }
            }
        }
    }

    public final void LIZ$1() {
        String[] strArr;
        String str;
        if (this.i3 == 0) {
            InterfaceC124924vI editorContext = ((C124794v5) this.l0).LJLIL;
            o.LJIIIZ(editorContext, "editorContext");
            List<String> q0 = editorContext.getPlayer().q0();
            if (q0 == null || (strArr = (String[]) q0.toArray(new String[0])) == null) {
                strArr = new String[0];
            }
            String str2 = strArr[0];
            String Y9 = ((C124794v5) this.l0).LJLIL.getPlayer().Y9();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append((Object) str2.subSequence(0, s.LJJLIIJ(str2, ".", 6)));
            LIZ.append(System.currentTimeMillis());
            LIZ.append(".mp4");
            String LIZIZ = X1D.LIZIZ(LIZ);
            if (Y9 != null) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append((Object) Y9.subSequence(0, s.LJJLIIJ(Y9, ".", 6)));
                LIZ2.append(System.currentTimeMillis());
                LIZ2.append(".mp4");
                str = X1D.LIZIZ(LIZ2);
            } else {
                str = null;
            }
            if (str != null && str.length() != 0) {
                new File(Y9).renameTo(new File(str));
            }
            if (new File(str2).renameTo(new File(LIZIZ))) {
                ((C124794v5) this.l0).LJJLIIIJJI(str, LIZIZ, (NLETrack) this.l1, (NLETrackSlot) this.l2, true);
            }
        }
    }

    public final void LIZ$2() {
        if (C52529KjV.LIZ()) {
            C164116cJ.LIZ(((C164246cW) this.l0).LLJILJILJ(), false, 0L, 6);
        } else {
            ((C164246cW) this.l0).LLJJ().hide();
        }
        ((JediViewModel) ((C164246cW) this.l0).LJLJJLL.getValue()).setState(C1550566r.LJLIL);
        ((C164246cW) this.l0).LLJILJIL().C("replace", this.i3);
        InterfaceC150395vH interfaceC150395vH = ((C164246cW) this.l0).LJLLLLLL;
        if (interfaceC150395vH != null) {
            interfaceC150395vH.O9((Effect) this.l1, (String) ((OSZ) this.l2).getSecond());
        }
    }

    public final void LIZ$3() {
        C0IB<C63K> Pq0;
        C63K LIZ;
        if (C52529KjV.LIZ()) {
            C164116cJ.LIZ(((C164246cW) this.l0).LLJILJILJ(), false, 0L, 6);
        } else {
            ((C164246cW) this.l0).LLJJ().hide();
        }
        InterfaceC142515iZ interfaceC142515iZ = (InterfaceC142515iZ) ((C164246cW) this.l0).LJLIL.LJIIIIZZ(null, InterfaceC142515iZ.class);
        if (interfaceC142515iZ != null && (Pq0 = interfaceC142515iZ.Pq0()) != null && (LIZ = Pq0.LIZ()) != null) {
            LIZ.LJJIII();
        }
        ((C164246cW) this.l0).LLJILJIL().C("replace", this.i3);
        InterfaceC150395vH interfaceC150395vH = ((C164246cW) this.l0).LJLLLLLL;
        if (interfaceC150395vH != null) {
            interfaceC150395vH.O9((Effect) this.l1, (String) ((OSZ) this.l2).getSecond());
        }
    }

    public static final void run$0(ARunnableS3S0301000_2 aRunnableS3S0301000_2) {
        int width;
        switch (aRunnableS3S0301000_2.i3) {
            case 0:
                Object obj = aRunnableS3S0301000_2.l0;
                View view = (View) aRunnableS3S0301000_2.l1;
                TextView textView = (TextView) aRunnableS3S0301000_2.l2;
                obj.getClass();
                int width2 = view.getWidth();
                int LJIILL = C17N.LJIILL(150.0d);
                if (width2 > LJIILL && (width = width2 - textView.getWidth()) < LJIILL) {
                    textView.setTextSize(1, 13);
                    if (((int) textView.getPaint().measureText(textView.getText().toString())) + width > LJIILL) {
                        textView.setTextSize(1, 12);
                        if (((int) textView.getPaint().measureText(textView.getText().toString())) + width > LJIILL) {
                            textView.setMaxWidth(LJIILL - width);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            default:
                C140475fH c140475fH = (C140475fH) aRunnableS3S0301000_2.l0;
                Intent intent = (Intent) aRunnableS3S0301000_2.l2;
                c140475fH.getClass();
                H78.LIZJ("DraftEditHelper NLEDraftBuilder fetch audio enhance model failed");
                c140475fH.LIZ(intent);
                return;
        }
    }

    public static final void run$1(ARunnableS3S0301000_2 aRunnableS3S0301000_2) {
        boolean LIZ;
        try {
            aRunnableS3S0301000_2.LIZ$0();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$2(ARunnableS3S0301000_2 aRunnableS3S0301000_2) {
        boolean LIZ;
        try {
            aRunnableS3S0301000_2.LIZ$1();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$3(ARunnableS3S0301000_2 aRunnableS3S0301000_2) {
        boolean LIZ;
        try {
            aRunnableS3S0301000_2.LIZ$2();
        } finally {
            if (LIZ) {
            }
        }
    }

    public static final void run$4(ARunnableS3S0301000_2 aRunnableS3S0301000_2) {
        boolean LIZ;
        try {
            aRunnableS3S0301000_2.LIZ$3();
        } finally {
            if (LIZ) {
            }
        }
    }

    public ARunnableS3S0301000_2(int i, Object obj, Object obj2, Object obj3, int i2) {
        this.$t = i2;
        this.i3 = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
