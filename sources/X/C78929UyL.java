package X;

import android.app.Application;
import android.os.Build;
import android.text.TextUtils;
import androidx.fragment.app.Fragment;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFDialogAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFFeedAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFPubAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFSocialAbility;
import com.bytedance.tiktok.homepage.mainfragment.ability.IMFToolBarAbility;
import com.ss.android.ugc.aweme.base.mainfragment.HomeViewPagerAbility;
import com.ss.android.ugc.aweme.canvas.CanvasExtra;
import com.ss.android.ugc.aweme.canvas.CanvasVideoData;
import com.ss.android.ugc.aweme.creative.compileConfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.ecommercebase.monitor.PageNodeMonitorService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.main.MainFragment;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import dalvik.system.PathClassLoader;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.UyL, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78929UyL implements InterfaceC48038ItG {
    public static Application LJLIL = null;
    public static String LJLILLLLZI = "defaultmd5";
    public static long LJLJI;
    public static long LJLJJI;
    public static ArrayList LJLJJL;
    public static String LJLJJLL;
    public static final C78929UyL LJLJL = new C78929UyL();

    public static final boolean LJI() {
        if (Build.VERSION.SDK_INT < 24 || C1DG.LJIIIIZZ() || !C1B8.LIZJ()) {
            return false;
        }
        return true;
    }

    public static final void LJIILJJIL() {
        "Invalid applier".toString();
        throw new IllegalStateException("Invalid applier");
    }

    public static final long LIZLLL(EditPreviewInfo editPreviewInfo) {
        long j = 0;
        if (editPreviewInfo == null) {
            return 0L;
        }
        Iterator<EditVideoSegment> it = editPreviewInfo.getVideoList().iterator();
        while (it.hasNext()) {
            j += it.next().getVideoFileInfo().getDuration();
        }
        return j;
    }

    public static final C53447KyJ LJ(L69 l69) {
        int i;
        int i2;
        int i3 = 0;
        if (l69 != null) {
            i = l69.getAvatarSizePx();
            i2 = l69.getContainerWidthPx();
            i3 = l69.getContainerHeightPx();
        } else {
            i = 0;
            i2 = 0;
        }
        return new C53447KyJ(i, i2, i3);
    }

    public static final IMFDialogAbility LJFF(MainFragment mainFragment) {
        C2K0 c2k0 = null;
        if (mainFragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(mainFragment, null), IMFDialogAbility.class, null);
        }
        return (IMFDialogAbility) c2k0;
    }

    public static final IMFFeedAbility LJII(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        C2K0 c2k0 = null;
        if ((fragment instanceof InterfaceC54054LJi) && fragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IMFFeedAbility.class, null);
        }
        return (IMFFeedAbility) c2k0;
    }

    public static ClassLoader LJIIIIZZ(ClassLoader classLoader) {
        if (classLoader == null) {
            return null;
        }
        if (classLoader.getClass().equals(PathClassLoader.class)) {
            return classLoader;
        }
        return LJIIIIZZ(classLoader.getParent());
    }

    public static String LJIIIZ(int i) {
        int i2 = i / 1000;
        int i3 = i2 % 60;
        int i4 = i2 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        if (i5 == 0) {
            return C16880lQ.LLLZI(Locale.CHINA, "%02d:%02d", new Object[]{Integer.valueOf(i6), Integer.valueOf(i3)});
        }
        return C16880lQ.LLLZI(Locale.CHINA, "%02d:%02d:%02d", new Object[]{Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i3)});
    }

    public static final int LJIIJ(CanvasVideoData canvasVideoData) {
        CanvasExtra extra;
        CanvasExtra extra2;
        CanvasExtra extra3;
        if (C79004UzY.LJJIIZI(canvasVideoData)) {
            if (canvasVideoData != null && (extra2 = canvasVideoData.getExtra()) != null && extra2.getDuration() > 0) {
                if (canvasVideoData == null || (extra3 = canvasVideoData.getExtra()) == null) {
                    return 0;
                }
                return extra3.getDuration();
            }
            return C149535tt.LIZ.defaultDuration;
        }
        if (canvasVideoData != null && (extra = canvasVideoData.getExtra()) != null) {
            return extra.getDuration();
        }
        return -1;
    }

    public static final XKS LJIILIIL(InterfaceC67352kd interfaceC67352kd) {
        if (!(interfaceC67352kd instanceof XKT)) {
            return new XKS(1, interfaceC67352kd);
        }
        XKS LJIIIIZZ = ((XKT) interfaceC67352kd).LJIIIIZZ();
        if (LJIIIIZZ == null || !LJIIIIZZ.LJIJI()) {
            return new XKS(2, interfaceC67352kd);
        }
        return LJIIIIZZ;
    }

    public static final boolean LJIILL(C43585H8r c43585H8r) {
        if (c43585H8r.LJIIIIZZ || c43585H8r.LJII != null || !TextUtils.isEmpty(c43585H8r.LJI)) {
            return true;
        }
        return false;
    }

    public static final IMFSocialAbility LJIILLIIL(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        C2K0 c2k0 = null;
        if ((fragment instanceof InterfaceC54054LJi) && fragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IMFSocialAbility.class, null);
        }
        return (IMFSocialAbility) c2k0;
    }

    public static final HomeViewPagerAbility LJIIZILJ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        C2K0 c2k0 = null;
        if ((fragment instanceof InterfaceC54054LJi) && fragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), HomeViewPagerAbility.class, null);
        }
        return (HomeViewPagerAbility) c2k0;
    }

    public static final IMFPubAbility LJIJ(Fragment fragment) {
        o.LJIIIZ(fragment, "<this>");
        C2K0 c2k0 = null;
        if ((fragment instanceof InterfaceC54054LJi) && fragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IMFPubAbility.class, null);
        }
        return (IMFPubAbility) c2k0;
    }

    public static final void LJIJI(InterfaceC27538ArO interfaceC27538ArO) {
        o.LJIIIZ(interfaceC27538ArO, "<this>");
        PageNodeMonitorService.LJIIIZ().LJI(interfaceC27538ArO.getPageName());
    }

    public static void LJIJJLI(InterfaceC27538ArO interfaceC27538ArO) {
        LJIJJ(interfaceC27538ArO, C61878OQg.INSTANCE);
    }

    public static final boolean LJIL(InterfaceC27538ArO interfaceC27538ArO) {
        o.LJIIIZ(interfaceC27538ArO, "<this>");
        return PageNodeMonitorService.LJIIIZ().LJ(interfaceC27538ArO.getPageName());
    }

    public static final AbstractC24810yD LJJ(InterfaceC24520xk interfaceC24520xk) {
        interfaceC24520xk.LJJIIJ(-1165786124);
        C35911b1 LJFF = interfaceC24520xk.LJFF();
        interfaceC24520xk.LJJIJIIJIL();
        return LJFF;
    }

    public static final boolean LJJI(ShortVideoContext shortVideoContext) {
        if (HVI.LIZ() && !shortVideoContext.LJJJI() && !shortVideoContext.LJJIIZ() && !shortVideoContext.LJJIJIIJI()) {
            return true;
        }
        return false;
    }

    public static final OSZ LJJII(CompileConfigResolution compileConfigResolution) {
        o.LJIIIZ(compileConfigResolution, "<this>");
        return new OSZ(Integer.valueOf(compileConfigResolution.getWidth()), Integer.valueOf(compileConfigResolution.getHeight()));
    }

    public static final String LJJIII(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder LJ = C7MY.LJ("the ", i, " audio path => {");
                LJ.append(editVideoSegment.getAudioPath());
                LJ.append("} \n");
                sb.append(X1D.LIZIZ(LJ));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static final String LJJIIJ(EditPreviewInfo editPreviewInfo) {
        if (editPreviewInfo == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (EditVideoSegment editVideoSegment : editPreviewInfo.getVideoList()) {
            int i2 = i + 1;
            if (i >= 0) {
                StringBuilder LJ = C7MY.LJ("the ", i, " video path =>{");
                LJ.append(editVideoSegment.getVideoPath());
                LJ.append("} \n");
                sb.append(X1D.LIZIZ(LJ));
                i = i2;
            } else {
                C47261Igj.LJJJJJ();
                throw null;
            }
        }
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "stringBuilder.toString()");
        return sb2;
    }

    public static final IMFToolBarAbility LJJIIJZLJL(Fragment fragment) {
        C2K0 c2k0 = null;
        if ((fragment instanceof InterfaceC54054LJi) && fragment.getFragmentManager() != null) {
            c2k0 = C55096Ljo.LIZ(C55230Lly.LIZJ(fragment, null), IMFToolBarAbility.class, null);
        }
        return (IMFToolBarAbility) c2k0;
    }

    @Override // X.InterfaceC48038ItG
    public Object apply(Object it) {
        o.LJIIIZ(it, "it");
        UBW ubw = new UBW();
        ubw.LIZ = it;
        return ubw;
    }

    public static final C10390ax LIZ(long j, long j2) {
        return new C10390ax(C10370av.LIZLLL(j), C10370av.LJ(j), C10430b1.LIZLLL(j2) + C10370av.LIZLLL(j), C10430b1.LIZIZ(j2) + C10370av.LJ(j));
    }

    public static final C145995oB LIZJ(VideoPublishEditModel videoPublishEditModel, C145995oB c145995oB) {
        if (videoPublishEditModel != null && H7R.LJJLIIIJJIZ(videoPublishEditModel)) {
            c145995oB.LJI("content_type", H7R.LJIIIZ(videoPublishEditModel));
        }
        return c145995oB;
    }

    public static String LJIIJJI(EnumC66752QHs enumC66752QHs, JSONObject jSONObject) {
        if (jSONObject == null || enumC66752QHs == null || enumC66752QHs != EnumC66752QHs.USER_ID) {
            return "";
        }
        return jSONObject.optString("user_id", CardStruct.IStatusCode.DEFAULT);
    }

    public static final void LJIJJ(InterfaceC27538ArO interfaceC27538ArO, List imageUriList) {
        o.LJIIIZ(interfaceC27538ArO, "<this>");
        o.LJIIIZ(imageUriList, "imageUriList");
        PageNodeMonitorService.LJIIIZ().LIZ(interfaceC27538ArO.getPageName(), C78948Uye.LJIILJJIL(interfaceC27538ArO, "lib_track_builtin_lane_business"));
        PageNodeMonitorService.LJIIIZ().LIZIZ(interfaceC27538ArO.getPageName(), imageUriList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00eb A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.text.SpannableString LJJIFFI(X.C08440Uu r38, X.InterfaceC23370vt r39, X.InterfaceC13480fw r40) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C78929UyL.LJJIFFI(X.0Uu, X.0vt, X.0fw):android.text.SpannableString");
    }

    public static final void LIZIZ(OHW ohw, String str, String str2, java.util.Map map) {
        ohw.LIZ.put("classIdentifier", str);
        ohw.LIZ.put("methodSignature", str2);
        ohw.LIZ.put("methodParams", map);
    }

    public static File[] LJIIL(final long j, final long j2, String str, String str2, String str3) {
        String quote;
        LJLJI = j;
        LJLJJI = j2;
        LJLJJLL = null;
        LJLJJL = null;
        if (j > j2) {
            LJLJJLL = "time interval is invalid";
            return new File[0];
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory()) {
            LJLJJLL = "log dir not exists";
            return new File[0];
        }
        if (!TextUtils.isEmpty(str2)) {
            str2 = str2.replace(':', '-');
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("^\\d{4}_\\d{2}_\\d{2}_(\\d+)__");
        String str4 = "\\S+";
        if (TextUtils.isEmpty(str2)) {
            quote = "\\S+";
        } else {
            quote = Pattern.quote(str2);
        }
        LIZ.append(quote);
        LIZ.append("__");
        if (!TextUtils.isEmpty(str3)) {
            str4 = Pattern.quote(str3);
        }
        LIZ.append(str4);
        LIZ.append("\\.alog\\.hot$");
        final Pattern compile = PatternProtector.compile(X1D.LIZIZ(LIZ));
        final ArrayList arrayList = new ArrayList();
        File[] listFiles = file.listFiles(new FilenameFilter() { // from class: X.0io
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str5) {
                String group;
                arrayList.add(str5);
                Matcher matcher = compile.matcher(str5);
                if (!matcher.find() || matcher.groupCount() != 1 || (group = matcher.group(1)) == null) {
                    return false;
                }
                long parseLong = CastLongProtector.parseLong(group);
                if (parseLong > 0 && parseLong <= j2) {
                    long lastModified = new File(file2, str5).lastModified();
                    if (lastModified > 0 && lastModified >= j) {
                        return true;
                    }
                }
                return false;
            }
        });
        if (listFiles == null || listFiles.length == 0) {
            LJLJJLL = "log file not found";
            LJLJJL = arrayList;
            if (listFiles == null) {
                return new File[0];
            }
            return listFiles;
        }
        return listFiles;
    }
}
