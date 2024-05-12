package X;

import com.ss.android.ugc.aweme.autocut.PreloadNLEConfig;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.AutoCutMediaModel;
import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.HmI, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45058HmI implements InterfaceC45080Hme<C44716Hgm> {
    public final VideoPublishEditModel LIZ;
    public final List<AutoCutMediaModel> LIZIZ;
    public final boolean LIZJ;
    public final LinkedList<C45059HmJ> LIZLLL;
    public final LinkedHashMap<OSZ<Integer, C63A>, C45059HmJ> LJ;
    public boolean LJFF;
    public final PreloadNLEConfig LJI;
    public int LJII;
    public InterfaceC88471Ynr<? super OSZ<Integer, ? extends C63A>, ? super C44716Hgm, C76800UCe> LJIIIIZZ;

    @Override // X.InterfaceC45080Hme
    public final void LIZ() {
        this.LJFF = true;
    }

    @Override // X.InterfaceC45080Hme
    public final void LIZIZ() {
        this.LJFF = false;
        LIZJ();
    }

    public final void LIZJ() {
        Object obj;
        if (this.LJFF) {
            return;
        }
        if (this.LJII >= this.LJI.maxConcurrentCount) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("executeNext: over preloading count limit. maxConcurrentCount=");
            LIZ.append(this.LJI.maxConcurrentCount);
            X1D.LIZIZ(LIZ);
            return;
        }
        Iterator<C45059HmJ> it = this.LIZLLL.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            C45059HmJ c45059HmJ = (C45059HmJ) next;
            if (c45059HmJ != null) {
                obj = c45059HmJ.LJFF;
            }
            if (obj == EnumC45067HmR.NONE) {
                obj = next;
                break;
            }
        }
        C45059HmJ c45059HmJ2 = (C45059HmJ) obj;
        if (c45059HmJ2 != null) {
            this.LJII++;
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("executeNext: next task source =");
            LIZ2.append(c45059HmJ2.LJ.LIZ);
            LIZ2.append(", next task theme=");
            LIZ2.append(new OSZ(Integer.valueOf(c45059HmJ2.LJ.LIZIZ), c45059HmJ2.LJ.LIZ));
            LIZ2.append(", left task size=");
            LIZ2.append(this.LIZLLL.size());
            LIZ2.append(", preloadingCount=");
            LIZ2.append(this.LJII);
            X1D.LIZIZ(LIZ2);
            c45059HmJ2.LJI = System.currentTimeMillis();
            EnumC45067HmR enumC45067HmR = EnumC45067HmR.PRELOADING;
            o.LJIIIZ(enumC45067HmR, "<set-?>");
            c45059HmJ2.LJFF = enumC45067HmR;
            EnumC45070HmU enumC45070HmU = EnumC45070HmU.TEMPLATE_CC;
            if (c45059HmJ2.LIZ.LIZIZ.templateType == EnumC43998HOo.DESIGNER_FIXED_TEMPLATE.getValue() || c45059HmJ2.LIZ.LIZIZ.templateType == EnumC43998HOo.ALGORITHM_TEMPLATE.getValue()) {
                AutoCutThemeData autoCutThemeData = c45059HmJ2.LIZ.LIZIZ;
                if (autoCutThemeData.musicId == null) {
                    return;
                }
                enumC45070HmU = EnumC45070HmU.TEMPLATE_MUSIC;
                AVMusic extractAVMusic = MusicBeanUtilKt.extractAVMusic(autoCutThemeData.musicBuzModel);
                if (extractAVMusic != null) {
                    c45059HmJ2.LJ.LJ = extractAVMusic;
                    c45059HmJ2.LIZ(extractAVMusic);
                } else {
                    String str = autoCutThemeData.musicId;
                    if (str != null) {
                        C78934UyQ.LJLIL.getMusicService().requestMusic(str, new C45064HmO(c45059HmJ2));
                    }
                }
            }
            C44716Hgm c44716Hgm = c45059HmJ2.LJ;
            C45060HmK c45060HmK = c45059HmJ2.LIZ;
            AutoCutThemeData autoCutThemeData2 = c45060HmK.LIZIZ;
            int i = autoCutThemeData2.templateType;
            c44716Hgm.LIZJ = i;
            String str2 = autoCutThemeData2.templateId;
            c44716Hgm.LJIIIZ = str2;
            String str3 = autoCutThemeData2.templateGroupId;
            c44716Hgm.LJIIJJI = str3;
            String str4 = c45060HmK.LIZJ;
            String str5 = autoCutThemeData2.musicId;
            if (str5 == null) {
                str5 = "";
            }
            if (str3 == null) {
                str3 = "";
            }
            String str6 = autoCutThemeData2.templateUrl;
            String str7 = autoCutThemeData2.templateData;
            List<AutoCutMediaModel> list = c45060HmK.LIZLLL;
            java.util.Set<String> set = autoCutThemeData2.preloadUrsSet;
            CreativeInfo creativeInfo = c45060HmK.LJ;
            c44716Hgm.LJIIL = set;
            c45059HmJ2.LIZLLL = C45087Hml.LJJIJIIJI(str4, str5, str2, str6, str7, enumC45070HmU, list, set, creativeInfo, c45060HmK.LJFF, false, i, "source_preload", new C45061HmL(c45059HmJ2, i, str3, C61878OQg.INSTANCE));
        }
    }

    @Override // X.InterfaceC45080Hme
    public final void cancel() {
        Iterator<C45059HmJ> it = this.LIZLLL.iterator();
        while (it.hasNext()) {
            C45059HmJ next = it.next();
            if (next != null) {
                next.LJI = -1L;
                String str = next.LIZLLL;
                if (str != null) {
                    C45087Hml.LIZLLL(str);
                }
                EnumC45067HmR enumC45067HmR = EnumC45067HmR.CANCEL;
                o.LJIIIZ(enumC45067HmR, "<set-?>");
                next.LJFF = enumC45067HmR;
            }
        }
        this.LJ.clear();
        this.LIZLLL.clear();
        this.LJFF = false;
        this.LJII = 0;
    }

    public C45058HmI(VideoPublishEditModel model, List<AutoCutMediaModel> mediaModelList, boolean z) {
        o.LJIIIZ(model, "model");
        o.LJIIIZ(mediaModelList, "mediaModelList");
        this.LIZ = model;
        this.LIZIZ = mediaModelList;
        this.LIZJ = z;
        this.LIZLLL = new LinkedList<>();
        this.LJ = new LinkedHashMap<>();
        PreloadNLEConfig LIZ = C35567Dxb.LIZ();
        this.LJI = LIZ;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("preload: ab config=");
        LIZ2.append(LIZ);
        X1D.LIZIZ(LIZ2);
    }
}
