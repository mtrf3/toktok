package Y;

import X.C0H1;
import X.C12460eI;
import X.C36922EeM;
import X.C38816FLg;
import X.C39579Fg7;
import X.C42299Git;
import X.C42307Gj1;
import X.C42779Gqd;
import X.C43117Gw5;
import X.C43287Gyp;
import X.C43769HFt;
import X.C43770HFu;
import X.C47152Iey;
import X.C54846Lfm;
import X.C72972SkS;
import X.C76800UCe;
import X.C77413UZt;
import X.FLL;
import X.InterfaceC153045zY;
import X.InterfaceC65784Pro;
import X.R6B;
import X.X1D;
import android.graphics.Bitmap;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.api.AnchorApi;
import com.ss.android.ugc.aweme.api.resp.AnchorSelectionResponse;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.mvtheme.MvNetFileBean;
import com.ss.android.ugc.aweme.mvtheme.MvSourceItemInfo;
import com.ss.android.ugc.aweme.network.ITrafficStatistics;
import com.ss.android.ugc.aweme.photo.PhotoContext;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;
import com.ss.android.ugc.aweme.services.TrafficStatisticsServiceImpl;
import com.ss.android.ugc.aweme.services.effect.IEffectService;
import com.ss.android.ugc.aweme.shortvideo.cover.VEVideoCoverGeneratorImpl;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.shortvideo.model.ExtractFramesModel;
import com.ss.android.ugc.aweme.shortvideo.model.FrameItem;
import com.ss.android.ugc.aweme.ug.UgCommonServiceImpl;
import com.ss.android.vesdk.VEUtils;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public class ACallableS79S0101000_7 implements Callable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            case 2:
                return call$2(this);
            case 3:
                return call$3(this);
            case 4:
                return call$4(this);
            case 5:
                return call$5(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        switch (aCallableS79S0101000_7.i1) {
            case 0:
                try {
                    C43287Gyp.LIZIZ.LIZ = ((Aweme) aCallableS79S0101000_7.l0).getAwemeRawAd();
                } catch (Exception e) {
                    C36922EeM.LIZ(e);
                }
                return null;
            case 1:
                C47152Iey[] c47152IeyArr = (C47152Iey[]) aCallableS79S0101000_7.l0;
                int length = c47152IeyArr.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        return null;
                    }
                    C47152Iey c47152Iey = c47152IeyArr[length];
                    long j = c47152Iey.LJLJI;
                    long j2 = (long) ((c47152Iey.LJLIL * j) / 8000.0d);
                    String LJFF = C12460eI.LJFF();
                    ITrafficStatistics createITrafficStatisticsbyMonsterPlugin = TrafficStatisticsServiceImpl.createITrafficStatisticsbyMonsterPlugin(false);
                    StringBuilder LIZ = X1D.LIZ();
                    createITrafficStatisticsbyMonsterPlugin.addRecord(j2, LJFF, "video", j, C0H1.LIZJ(LIZ, c47152Iey.LJLJJI, "_video", LIZ));
                }
            case 2:
                Boolean bool = (Boolean) aCallableS79S0101000_7.l0;
                UgCommonServiceImpl.LJIJ().LJIIJJI();
                FLL.LJ(bool.booleanValue());
                UgCommonServiceImpl.LJIJ().LJIIJJI();
                FLL.LIZJ();
                return null;
            default:
                AwemeDraft awemeDraft = (AwemeDraft) aCallableS79S0101000_7.l0;
                ArrayList<String> arrayList = awemeDraft.LJJJJI.mvCreateVideoData.selectMediaList;
                if (!C77413UZt.LJIILL(arrayList)) {
                    Iterator<String> it = arrayList.iterator();
                    while (it.hasNext()) {
                        C39579Fg7.LJIL(it.next());
                    }
                }
                ArrayList<MvNetFileBean> arrayList2 = awemeDraft.LJJJJI.mvCreateVideoData.newMaskFileData;
                if (!C77413UZt.LJIILL(arrayList2)) {
                    Iterator<MvNetFileBean> it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        C39579Fg7.LJIL(it2.next().getFilePath());
                    }
                }
                ArrayList<MvSourceItemInfo> arrayList3 = awemeDraft.LJJJJI.mvCreateVideoData.sourceItemList;
                if (!C77413UZt.LJIILL(arrayList3)) {
                    Iterator<MvSourceItemInfo> it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        C39579Fg7.LJIL(it3.next().getOriginFilePath());
                    }
                }
                C39579Fg7.LJIL(awemeDraft.LJJJJI.mvCreateVideoData.videoCoverImgPath);
                C39579Fg7.LJIL(awemeDraft.LJJJJI.mvCreateVideoData.contactVideoPath);
                return null;
        }
    }

    public static final Object call$1(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        switch (aCallableS79S0101000_7.i1) {
            case 0:
                Fragment fragment = (Fragment) aCallableS79S0101000_7.l0;
                fragment.getClass();
                C38816FLg.LIZJ(new R6B(fragment, AwemeListFragmentImpl.Ll(), 2));
                return null;
            default:
                List<String> list = (List) aCallableS79S0101000_7.l0;
                ArrayList arrayList = new ArrayList();
                for (String str : list) {
                    int[] LIZJ = C42307Gj1.LIZJ(str);
                    if (LIZJ != null) {
                        arrayList.add(PhotoContext.fromUpload(str, LIZJ[0], LIZJ[1]));
                    }
                }
                return arrayList;
        }
    }

    public static final Object call$2(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        switch (aCallableS79S0101000_7.i1) {
            case 0:
                InterfaceC153045zY interfaceC153045zY = ((VEVideoCoverGeneratorImpl) aCallableS79S0101000_7.l0).LJLJI;
                if (interfaceC153045zY != null) {
                    interfaceC153045zY.LLJJJJLIIL();
                }
                return null;
            default:
                C43769HFt c43769HFt = (C43769HFt) aCallableS79S0101000_7.l0;
                List<String> list = c43769HFt.LIZLLL;
                if (list != null && !list.isEmpty()) {
                    Iterator it = new HashSet(c43769HFt.LIZLLL).iterator();
                    while (it.hasNext()) {
                        Bitmap LIZ = C42299Git.LIZ((String) it.next(), C54846Lfm.LJLJJI);
                        if (LIZ != null) {
                            String LIZIZ = c43769HFt.LIZIZ.LIZIZ();
                            C42299Git.LJFF(LIZ, new File(LIZIZ), 70, Bitmap.CompressFormat.JPEG);
                            InterfaceC65784Pro<ExtractFramesModel> interfaceC65784Pro = c43769HFt.LJ.LIZIZ;
                            if (interfaceC65784Pro != null && interfaceC65784Pro.invoke() != null) {
                                c43769HFt.LJ.LIZIZ.invoke().addFrameAtLastSegment(new FrameItem(LIZIZ));
                            } else {
                                c43769HFt.LIZ.addFrameAtLastSegment(new FrameItem(LIZIZ));
                            }
                        }
                    }
                }
                return null;
        }
    }

    public static final Object call$3(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        ((IEffectService.OnVideoCoverCallback) aCallableS79S0101000_7.l0).onGetVideoCoverFailed(aCallableS79S0101000_7.i1);
        return C76800UCe.LIZ;
    }

    public static final Object call$4(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        int[] iArr;
        switch (aCallableS79S0101000_7.i1) {
            case 0:
                ((FutureTask) aCallableS79S0101000_7.l0).run();
                return null;
            default:
                C43770HFu c43770HFu = (C43770HFu) aCallableS79S0101000_7.l0;
                if (C77413UZt.LJIILL(c43770HFu.LJ)) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (EditVideoSegment editVideoSegment : c43770HFu.LJ) {
                    C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
                    String videoPath = editVideoSegment.getVideoPath();
                    c43117Gw5.getClass();
                    if (C43117Gw5.LJIIIZ(videoPath)) {
                        arrayList.add(editVideoSegment);
                    } else {
                        arrayList2.add(editVideoSegment);
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it = arrayList.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    int[] iArr2 = C54846Lfm.LJLJJI;
                    if (hasNext) {
                        Bitmap LIZ = C42299Git.LIZ(((EditVideoSegment) it.next()).getVideoPath(), iArr2);
                        if (LIZ != null) {
                            String LIZIZ = c43770HFu.LIZIZ.LIZIZ();
                            C42299Git.LJFF(LIZ, new File(LIZIZ), 70, Bitmap.CompressFormat.JPEG);
                            hashSet.add(LIZIZ);
                        }
                    } else {
                        String str = c43770HFu.LIZIZ.LIZIZ;
                        String str2 = File.separator;
                        if (!str.endsWith(str2)) {
                            str = i0.LJFF(str, str2);
                        }
                        Iterator it2 = arrayList2.iterator();
                        int i = 0;
                        while (it2.hasNext()) {
                            EditVideoSegment editVideoSegment2 = (EditVideoSegment) it2.next();
                            String videoPath2 = editVideoSegment2.getVideoPath();
                            videoPath2.toString();
                            if (editVideoSegment2.getVideoCutInfo() != null) {
                                VideoCutInfo videoCutInfo = editVideoSegment2.getVideoCutInfo();
                                int LIZIZ2 = ((C54846Lfm.LIZIZ() + ((int) (videoCutInfo.getEnd() - videoCutInfo.getStart()))) - 1) / C54846Lfm.LIZIZ();
                                c43770HFu.LIZLLL = LIZIZ2;
                                iArr = new int[LIZIZ2];
                                for (int i2 = 0; i2 < c43770HFu.LIZLLL; i2++) {
                                    iArr[i2] = (int) (videoCutInfo.getStart() + (C54846Lfm.LIZIZ() * i2));
                                }
                            } else {
                                int duration = (int) (((editVideoSegment2.getVideoFileInfo().getDuration() + C54846Lfm.LIZIZ()) - 1) / C54846Lfm.LIZIZ());
                                c43770HFu.LIZLLL = duration;
                                iArr = new int[duration];
                                for (int i3 = 0; i3 < c43770HFu.LIZLLL; i3++) {
                                    iArr[i3] = C54846Lfm.LIZIZ() * i3;
                                }
                            }
                            VEUtils.saveVideoFrames(videoPath2, iArr, iArr2[0], -1, false, str, C72972SkS.LIZLLL(i, "extract_frame"), 1);
                            i++;
                        }
                        File[] listFiles = new File(str).listFiles();
                        if (listFiles != null && listFiles.length > 0) {
                            for (File file : listFiles) {
                                hashSet.add(file.getAbsolutePath());
                            }
                        }
                        ArrayList arrayList3 = new ArrayList();
                        Iterator it3 = hashSet.iterator();
                        while (it3.hasNext()) {
                            arrayList3.add(it3.next());
                        }
                        ArrayList<FrameItem> arrayList4 = new ArrayList<>();
                        ArrayList<FrameItem> arrayList5 = new ArrayList<>();
                        Iterator it4 = hashSet.iterator();
                        while (it4.hasNext()) {
                            String str3 = (String) it4.next();
                            arrayList4.add(new FrameItem(str3));
                            arrayList5.add(new FrameItem(str3));
                        }
                        c43770HFu.LIZ.clearAllFrames();
                        c43770HFu.LIZ.addFrameSegment(arrayList4, null, arrayList5);
                        return null;
                    }
                }
                break;
        }
    }

    public static final Object call$5(ACallableS79S0101000_7 aCallableS79S0101000_7) {
        AnchorSelectionResponse anchorSelectionResponse = ((AnchorApi.RealApi) AnchorApi.LIZ.create(AnchorApi.RealApi.class)).getAnchorSelectionResponse(((C42779Gqd) aCallableS79S0101000_7.l0).LJLIL, 0, aCallableS79S0101000_7.i1, 20).get();
        o.LJIIIIZZ(anchorSelectionResponse, "RETROFIT\n            .cr…eSize)\n            .get()");
        return anchorSelectionResponse;
    }

    public ACallableS79S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = obj;
    }
}
