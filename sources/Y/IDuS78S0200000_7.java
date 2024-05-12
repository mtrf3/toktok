package Y;

import X.AbstractC48384Iyq;
import X.C00F;
import X.C03200Aq;
import X.C06460Ne;
import X.C1B6;
import X.C42606Gnq;
import X.C43521H6f;
import X.C43773HFx;
import X.C43832HIe;
import X.C43833HIf;
import X.C43840HIm;
import X.C43900HKu;
import X.C43901HKv;
import X.C45498HtO;
import X.C45515Htf;
import X.C60903NvH;
import X.C73433Srt;
import X.C81838W9y;
import X.C87677Yb3;
import X.C87678Yb4;
import X.HL8;
import X.HL9;
import X.I0N;
import X.I9W;
import X.InterfaceC73573Su9;
import X.InterfaceC86003Zc;
import X.Q7K;
import X.QXX;
import X.QZV;
import X.W5I;
import X.W5P;
import X.X1D;
import android.content.ContentResolver;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.provider.MediaStore;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.ss.android.ugc.aweme.editSticker.model.StickerItemModel;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.publish.core.uploader.engine.speedtest.ClientUploadRouterModel;
import com.ss.android.ugc.aweme.publish.model.UploadAuthKeyConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.bytex.pthread.base.PThreadExecutorsUtils;
import com.ss.android.ugc.bytex.thread_rename.base.DefaultThreadFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class IDuS78S0200000_7 implements InterfaceC86003Zc {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // X.InterfaceC86003Zc
    public final void subscribe(InterfaceC73573Su9 interfaceC73573Su9) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC73573Su9);
                return;
            case 1:
                subscribe$1(this, interfaceC73573Su9);
                return;
            case 2:
                subscribe$2(this, interfaceC73573Su9);
                return;
            case 3:
                subscribe$3(this, interfaceC73573Su9);
                return;
            case 4:
                subscribe$4(this, interfaceC73573Su9);
                return;
            case 5:
                subscribe$5(this, interfaceC73573Su9);
                return;
            case 6:
                subscribe$6(this, interfaceC73573Su9);
                return;
            default:
                return;
        }
    }

    public static final void subscribe$0(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        C43832HIe c43832HIe = (C43832HIe) iDuS78S0200000_7.l0;
        C43840HIm c43840HIm = (C43840HIm) iDuS78S0200000_7.l1;
        c43832HIe.getClass();
        if (c43840HIm.LJLJJI > 0) {
            ((I9W) c43832HIe.LJLJJLL.getDiContainer().LJ(I0N.class, null)).g30();
        }
        interfaceC73573Su9.onNext(new Object());
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$1(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        Bitmap thumbnail;
        if (((MediaModel) iDuS78S0200000_7.l0).LJI()) {
            ContentResolver contentResolver = ((Context) iDuS78S0200000_7.l1).getContentResolver();
            String str = ((MediaModel) iDuS78S0200000_7.l0).id;
            o.LJIIIIZZ(str, "mediaModel.id");
            thumbnail = MediaStore.Video.Thumbnails.getThumbnail(contentResolver, CastLongProtector.parseLong(str), 1, (BitmapFactory.Options) C42606Gnq.LIZ.getValue());
        } else {
            ContentResolver contentResolver2 = ((Context) iDuS78S0200000_7.l1).getContentResolver();
            String str2 = ((MediaModel) iDuS78S0200000_7.l0).id;
            o.LJIIIIZZ(str2, "mediaModel.id");
            thumbnail = MediaStore.Images.Thumbnails.getThumbnail(contentResolver2, CastLongProtector.parseLong(str2), 1, (BitmapFactory.Options) C42606Gnq.LIZ.getValue());
        }
        if (interfaceC73573Su9.isDisposed()) {
            return;
        }
        if (thumbnail == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("can not load uri: ");
            LIZ.append(((MediaModel) iDuS78S0200000_7.l0).fileLocalUriPath);
            interfaceC73573Su9.tryOnError(new IOException(X1D.LIZIZ(LIZ)));
            return;
        }
        interfaceC73573Su9.onNext(thumbnail);
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$2(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        C45498HtO c45498HtO = (C45498HtO) iDuS78S0200000_7.l0;
        List list = (List) iDuS78S0200000_7.l1;
        List<MyMediaModel> list2 = c45498HtO.LJZI;
        List<MyMediaModel> list3 = c45498HtO.LJLJJLL;
        C00F.LJ(list2, "old", list, "new", list3, "selected");
        Iterator it = ((ArrayList) list3).iterator();
        while (it.hasNext()) {
            MyMediaModel myMediaModel = (MyMediaModel) it.next();
            Iterator<MyMediaModel> it2 = list2.iterator();
            while (true) {
                Object obj = null;
                if (it2.hasNext()) {
                    MyMediaModel next = it2.next();
                    if (o.LJ(next, myMediaModel)) {
                        if (next != null) {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                if (o.LJ(next2, next)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            MyMediaModel myMediaModel2 = (MyMediaModel) obj;
                            if (myMediaModel2 != null) {
                                myMediaModel2.selectIndex = myMediaModel.selectIndex;
                            }
                        }
                    }
                }
            }
        }
        interfaceC73573Su9.onNext(C03200Aq.LIZ(new C45515Htf(c45498HtO.LJZI, list), false));
    }

    public static final void subscribe$3(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        ClientUploadRouterModel clientUploadRouterModel;
        int i;
        QZV qzv = ((C87677Yb3) iDuS78S0200000_7.l0).LIZJ;
        if (qzv != null) {
            C87677Yb3.LIZJ("restart speedProbe, may close anr");
            qzv.LJII();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C60903NvH.LJIIJJI().getPublishService().LJJIJ().getClass();
        C43900HKu c43900HKu = new C43900HKu();
        try {
            SettingsManager.LIZLLL().getClass();
            clientUploadRouterModel = (ClientUploadRouterModel) SettingsManager.LJII("creative_client_upload_router_setting", ClientUploadRouterModel.class);
        } catch (Throwable unused) {
            clientUploadRouterModel = null;
        }
        UploadAuthKeyConfig uploadAuthKeyConfig = (UploadAuthKeyConfig) iDuS78S0200000_7.l1;
        if (clientUploadRouterModel != null) {
            i = clientUploadRouterModel.getMode();
        } else {
            i = 0;
        }
        c43900HKu.LJIJJLI(uploadAuthKeyConfig, i);
        c43900HKu.LJIJI(new HL8((C73433Srt) interfaceC73573Su9, currentTimeMillis, (C87677Yb3) iDuS78S0200000_7.l0, (UploadAuthKeyConfig) iDuS78S0200000_7.l1));
        if (clientUploadRouterModel != null) {
            C87677Yb3 c87677Yb3 = (C87677Yb3) iDuS78S0200000_7.l0;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("setNetworkRoutMode mode:");
            LIZ.append(clientUploadRouterModel.getMode());
            LIZ.append(" weight:");
            LIZ.append(clientUploadRouterModel.getWeight());
            String LIZIZ = X1D.LIZIZ(LIZ);
            c87677Yb3.getClass();
            C87677Yb3.LIZ(LIZIZ, true);
            c43900HKu.LJIJJ(clientUploadRouterModel.getWeight());
        }
        int LIZ2 = C00F.LIZ(31744, 524288, "upload_speed_probe_size", true);
        int LIZ3 = C00F.LIZ(31744, 1, "upload_speed_probe_retry_count", true);
        int LIZ4 = C43521H6f.LIZ();
        int LIZIZ2 = Q7K.LIZIZ("tool_upload_speed_probe_single_host_total_timeout_s", 0);
        C87677Yb3 c87677Yb32 = (C87677Yb3) iDuS78S0200000_7.l0;
        StringBuilder LIZJ = C06460Ne.LIZJ("startSpeedTest size:", LIZ2, " retryCount:", LIZ3, " mode:");
        LIZJ.append(LIZ4);
        LIZJ.append(" singleHostTotalTimeout:");
        LIZJ.append(LIZIZ2);
        X1D.LIZIZ(LIZJ);
        c87677Yb32.getClass();
        c43900HKu.start();
        ((C87677Yb3) iDuS78S0200000_7.l0).LIZJ = c43900HKu;
    }

    public static final void subscribe$4(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        QXX qxx = ((C87678Yb4) iDuS78S0200000_7.l0).LIZJ;
        if (qxx != null) {
            C87678Yb4.LIZJ("restart speedProbe, may close anr");
            qxx.LJLJJL();
        }
        long currentTimeMillis = System.currentTimeMillis();
        C60903NvH.LJIIJJI().getPublishService().LJJIJ().getClass();
        C43901HKv c43901HKv = new C43901HKv();
        c43901HKv.LLLLZIL((UploadAuthKeyConfig) iDuS78S0200000_7.l1);
        c43901HKv.LLLLZ(new HL9((C73433Srt) interfaceC73573Su9, currentTimeMillis, (C87678Yb4) iDuS78S0200000_7.l0, (UploadAuthKeyConfig) iDuS78S0200000_7.l1));
        int LIZ = C00F.LIZ(31744, 524288, "upload_speed_probe_size", true);
        int LIZ2 = C00F.LIZ(31744, 1, "upload_speed_probe_retry_count", true);
        int LIZ3 = C43521H6f.LIZ();
        int LIZIZ = Q7K.LIZIZ("tool_upload_speed_probe_single_host_total_timeout_s", 0);
        C87678Yb4 c87678Yb4 = (C87678Yb4) iDuS78S0200000_7.l0;
        StringBuilder LIZJ = C06460Ne.LIZJ("startSpeedTest size:", LIZ, " retryCount:", LIZ2, " mode:");
        LIZJ.append(LIZ3);
        LIZJ.append(" singleHostTotalTimeout:");
        LIZJ.append(LIZIZ);
        X1D.LIZIZ(LIZJ);
        c87678Yb4.getClass();
        c43901HKv.LLLLZLLIL();
        ((C87678Yb4) iDuS78S0200000_7.l0).LIZJ = c43901HKv;
    }

    public static final void subscribe$5(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        if (((C43840HIm) iDuS78S0200000_7.l0).LJLJJI > 0) {
            Object LJIIIIZZ = ((C43833HIf) iDuS78S0200000_7.l1).LJLJJI.getDiContainer().LJIIIIZZ(null, I0N.class);
            o.LJI(LJIIIIZZ);
            ((I9W) LJIIIIZZ).g30();
        }
        interfaceC73573Su9.onNext(new Object());
        interfaceC73573Su9.onComplete();
    }

    public static final void subscribe$6(IDuS78S0200000_7 iDuS78S0200000_7, InterfaceC73573Su9 interfaceC73573Su9) {
        String str = ((StickerItemModel) iDuS78S0200000_7.l0).path;
        if (!C1B6.LIZIZ(str)) {
            interfaceC73573Su9.onError(new IllegalStateException("File not exists"));
            return;
        }
        AbstractC48384Iyq abstractC48384Iyq = (AbstractC48384Iyq) W5I.LIZ().LJ(W5P.LIZLLL(Uri.fromFile(new File(str))).LIZ(), (C43773HFx) iDuS78S0200000_7.l1);
        abstractC48384Iyq.LJ(new C81838W9y((C73433Srt) interfaceC73573Su9, (C43773HFx) iDuS78S0200000_7.l1, str), PThreadExecutorsUtils.newCachedThreadPool(new DefaultThreadFactory("CustomStickerExtractor$extractImage$1")));
    }

    public IDuS78S0200000_7(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
