package X;

import com.bytedance.ies.nle.editor_jni.LogLevel;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS154S0200000_7;
import kotlin.jvm.internal.o;

/* renamed from: X.Hgh, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44711Hgh extends AbstractC45048Hm8 {
    public final /* synthetic */ String LJJI;
    public final /* synthetic */ AutoCutModel LJJIFFI;
    public final /* synthetic */ boolean LJJII;
    public final /* synthetic */ ShortVideoContext LJJIII;
    public final /* synthetic */ AVMusic LJJIIJ;
    public final /* synthetic */ InterfaceC44718Hgo LJJIIJZLJL;
    public final /* synthetic */ C82622Wbi LJJIIZ;
    public final /* synthetic */ List<MyMediaModel> LJJIIZI;
    public final /* synthetic */ ActivityC45651qj LJJIJ;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJJIJIIJI;

    @Override // X.AbstractC45048Hm8, X.InterfaceC45222How
    public final void onCancel() {
        super.onCancel();
        if (C44706Hgc.LIZ()) {
            CreativeModel creativeModel = this.LJJIII.creativeModel;
            AutoCutModel autoCutModel = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
            creativeModel.getClass();
            creativeModel.autoCutModel = autoCutModel;
            return;
        }
        ArrayList arrayList = new ArrayList();
        List<AutoCutMediaModel> list = this.LJJIFFI.mediaList;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(list, 10));
        Iterator<AutoCutMediaModel> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().filePath);
        }
        arrayList.addAll(arrayList2);
        XKX.LIZLLL(C48841JEv.LIZ(C78613UtF.LIZJ), null, null, new C63122do(arrayList, null), 3);
        CreativeModel creativeModel2 = this.LJJIII.creativeModel;
        AutoCutModel autoCutModel2 = new AutoCutModel(null, null, null, 0, 0, null, null, 0, false, null, null, null, null, null, null, null, null, 131071, null);
        creativeModel2.getClass();
        creativeModel2.autoCutModel = autoCutModel2;
    }

    @Override // X.InterfaceC45222How
    public final void onExit() {
        C43045Guv.LIZLLL(new AqS154S0200000_7((InterfaceC65784Pro) this.LJJIJIIJI, (InterfaceC65784Pro<C76800UCe>) this.LJJIIJZLJL, (InterfaceC44718Hgo) 65), 0L);
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LIZ(NLEModel nLEModel) {
        super.LIZ(nLEModel);
        LJIJJLI("AutoCutAlbumHelper", this.LJJIFFI);
    }

    @Override // X.InterfaceC45209Hoj
    public final void LJIIJJI(List<AutoCutMediaModel> list) {
        C45049Hm9.LIZ(LogLevel.LEVEL_INFO, "AutoCutAlbumHelper startAutoCut onCompressMediaFileSuccess");
        List<AutoCutMediaModel> list2 = this.LJJIFFI.mediaList;
        list2.clear();
        list2.addAll(list);
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIIZILJ(C44716Hgm c44716Hgm) {
        Integer num;
        AutoCutThemeData LJII;
        String str;
        Integer num2;
        String str2;
        super.LJIIZILJ(c44716Hgm);
        this.LJJIFFI.optimizeLargeNLEId = C36942Eeg.LIZIZ(c44716Hgm.LJII);
        AutoCutModel autoCutModel = this.LJJIFFI;
        C63A c63a = C63A.AUTO_CUT;
        AnonymousClass636.LJIJJLI(autoCutModel, 0, c63a, c44716Hgm.LIZJ, c44716Hgm.LJIIIZ, c44716Hgm.LJIIJJI);
        this.LJJIFFI.clickFrom = this.LJJI;
        String str3 = null;
        if (!r1.templateList.isEmpty()) {
            AutoCutModel autoCutModel2 = this.LJJIFFI;
            AutoCutThemeData autoCutThemeData = (AutoCutThemeData) ListProtector.get(autoCutModel2.templateList, autoCutModel2.curIndexFromSource);
            NLEModel nLEModel = c44716Hgm.LJII;
            if (nLEModel != null) {
                str2 = nLEModel.toString();
            } else {
                str2 = null;
            }
            autoCutThemeData.templateData = str2;
        }
        LJIJJ("AutoCutAlbumHelper", this.LJJIFFI);
        if (!this.LJJII) {
            ShortVideoContext shortVideoContext = this.LJJIII;
            AVMusic aVMusic = c44716Hgm.LJ;
            String str4 = c44716Hgm.LJFF;
            if (aVMusic != null) {
                num2 = Integer.valueOf(aVMusic.getDuration());
            } else {
                num2 = null;
            }
            C44703HgZ.LIZ(shortVideoContext, aVMusic, str4, 0, num2);
        } else {
            ShortVideoContext shortVideoContext2 = this.LJJIII;
            AVMusic aVMusic2 = this.LJJIIJ;
            String musicPath = shortVideoContext2.getMusicPath();
            AVMusic aVMusic3 = c44716Hgm.LJ;
            if (aVMusic3 != null) {
                num = Integer.valueOf(aVMusic3.getDuration());
            } else {
                num = null;
            }
            C44703HgZ.LIZ(shortVideoContext2, aVMusic2, musicPath, 0, num);
            AVMusic aVMusic4 = this.LJJIIJ;
            if (aVMusic4 != null) {
                AutoCutModel autoCutModel3 = this.LJJIFFI;
                if (aVMusic4.isPgc()) {
                    str = "pgc";
                } else {
                    str = "ugc";
                }
                autoCutModel3.getClass();
                autoCutModel3.reuseMusicType = str;
            }
            if (c44716Hgm.LIZIZ == 0 && c44716Hgm.LIZ == c63a && (LJII = AnonymousClass636.LJII(this.LJJIFFI)) != null) {
                LJII.templateType = c44716Hgm.LIZJ;
            }
        }
        NLEModel nLEModel2 = c44716Hgm.LJII;
        if (nLEModel2 == null || nLEModel2.getMainTrack() == null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("AutoCutAlbumHelper checkAutoCutNLE: templateId=");
            LIZ.append(c44716Hgm.LJIIIZ);
            LIZ.append(", templateType=");
            LIZ.append(c44716Hgm.LIZJ);
            LIZ.append(", source=");
            LIZ.append(c44716Hgm.LIZ);
            LIZ.append(", indexFromSource=");
            LIZ.append(c44716Hgm.LIZIZ);
            C45049Hm9.LIZ(LogLevel.LEVEL_INFO, X1D.LIZIZ(LIZ));
        }
        NLEModel nLEModel3 = c44716Hgm.LJII;
        if (nLEModel3 != null && C45087Hml.LJIILJJIL()) {
            System.currentTimeMillis();
            C124144u2.LIZIZ(nLEModel3);
        }
        if (C44720Hgq.LIZIZ()) {
            this.LJJIIJZLJL.LJJJLL();
        }
        C82622Wbi c82622Wbi = this.LJJIIZ;
        List<MyMediaModel> list = this.LJJIIZI;
        ShortVideoContext shortVideoContext3 = this.LJJIII;
        ActivityC45651qj activityC45651qj = this.LJJIJ;
        if (C45087Hml.LJIILJJIL()) {
            str3 = C45087Hml.LJJIL(c44716Hgm.LJII);
        }
        C43045Guv.LIZLLL(new C43613H9t(c44716Hgm, str3, list, shortVideoContext3, c82622Wbi, activityC45651qj), 0L);
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIJ(int i) {
        super.LJIJ(i);
        this.LJJIFFI.asyncRenderModel.asyncRenderNecessaryDownloadCount = i;
    }

    @Override // X.AbstractC45048Hm8, X.InterfaceC45209Hoj
    public final void LJIILJJIL(String taskId, List templateList) {
        o.LJIIIZ(templateList, "templateList");
        o.LJIIIZ(taskId, "taskId");
        super.LJIILJJIL(taskId, templateList);
        AutoCutModel autoCutModel = this.LJJIFFI;
        List<AutoCutThemeData> LLJILJILJ = ORZ.LLJILJILJ(templateList);
        autoCutModel.getClass();
        autoCutModel.templateList = LLJILJILJ;
        this.LJJIFFI.taskId = taskId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C44711Hgh(String str, List<AutoCutMediaModel> list, AutoCutModel autoCutModel, boolean z, ShortVideoContext shortVideoContext, AVMusic aVMusic, InterfaceC44718Hgo interfaceC44718Hgo, C82622Wbi c82622Wbi, List<MyMediaModel> list2, ActivityC45651qj activityC45651qj, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, String str2, String str3, String str4) {
        super(str, str2, str3, list, str4, autoCutModel);
        this.LJJI = str;
        this.LJJIFFI = autoCutModel;
        this.LJJII = z;
        this.LJJIII = shortVideoContext;
        this.LJJIIJ = aVMusic;
        this.LJJIIJZLJL = interfaceC44718Hgo;
        this.LJJIIZ = c82622Wbi;
        this.LJJIIZI = list2;
        this.LJJIJ = activityC45651qj;
        this.LJJIJIIJI = interfaceC65784Pro;
    }
}
