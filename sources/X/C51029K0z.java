package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multihost.biz.dialog.LinkDialog;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.comment.widgets.CommentEditText$MentionSpan;
import com.ss.android.ugc.aweme.comment.widgets.CommentEmojiSpan;
import com.ss.android.ugc.aweme.creative.model.PostLandingModel;
import com.ss.android.ugc.aweme.feed.model.BitRate;
import com.ss.android.ugc.aweme.feed.model.BitrateAudioStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateMetaStruct;
import com.ss.android.ugc.aweme.feed.model.BitrateUrlStruct;
import com.ss.android.ugc.aweme.feed.model.CaptionItemModel;
import com.ss.android.ugc.aweme.feed.model.CaptionModel;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.aweme.feed.model.video.PlayTokenAuth;
import com.ss.android.ugc.aweme.im.message.template.card.StickerTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseRequestComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.ImageComponent;
import com.ss.android.ugc.aweme.im.message.template.component.PreviewHintComponent;
import com.ss.android.ugc.aweme.im.message.template.component.StickerCardFallbackInfoComponent;
import com.ss.android.ugc.aweme.im.message.template.component.UserInfoComponent;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.playerkit.simapicommon.model.SimAudioBitrate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimBitRate;
import com.ss.android.ugc.playerkit.simapicommon.model.SimPlayTokenAuth;
import com.ss.android.ugc.playerkit.simapicommon.model.SimUrlModel;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideo;
import com.ss.android.ugc.playerkit.simapicommon.model.SimVideoUrlModel;
import com.zhiliaoapp.musically.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.o;
import o53.IDdS197S0200000_12;
import org.json.JSONObject;
import ujb.s;

/* renamed from: X.K0z, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C51029K0z implements F4M, CN8, K1N {
    public static File LIZ;
    public static File LIZIZ;
    public static File LIZJ;
    public static File LIZLLL;
    public static File LJ;
    public static File LJFF;

    public static final int LJJIIZ(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    @Override // X.CN8
    public void LIZIZ() {
    }

    @Override // X.CN8
    public void LIZLLL() {
    }

    public static synchronized File LJIILJJIL() {
        File file;
        synchronized (C51029K0z.class) {
            if (LIZIZ == null) {
                File file2 = new File(LJJII(), "flush");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                LIZIZ = file2;
            }
            file = LIZIZ;
        }
        return file;
    }

    public static synchronized File LJIILL() {
        File file;
        synchronized (C51029K0z.class) {
            try {
                if (LJFF == null) {
                    File file2 = new File(LJJII(), "header");
                    if (!file2.exists()) {
                        file2.mkdirs();
                    }
                    LJFF = file2;
                }
            } catch (Exception e) {
                PAU.LIZIZ("header", e);
            }
            file = LJFF;
        }
        return file;
    }

    public static synchronized File LJIJ() {
        File file;
        synchronized (C51029K0z.class) {
            if (LJ == null) {
                File file2 = new File(LJJII(), "log");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                LJ = file2;
            }
            file = LJ;
        }
        return file;
    }

    public static synchronized File LJIJJ() {
        File file;
        synchronized (C51029K0z.class) {
            if (LIZJ == null) {
                File file2 = new File(LJJII(), "persistent");
                if (!file2.exists()) {
                    file2.mkdirs();
                }
                LIZJ = file2;
            }
            file = LIZJ;
        }
        return file;
    }

    public static synchronized File LJIJJLI() {
        File file;
        synchronized (C51029K0z.class) {
            if (LIZ == null) {
                try {
                    String LIZ2 = FCD.LIZ(C63985P9h.LIZ);
                    StringBuilder LIZ3 = X1D.LIZ();
                    LIZ3.append(LIZ2.replace(".", "_").replace(":", "-"));
                    LIZ3.append(".bin");
                    File file2 = new File(LJIJJ(), X1D.LIZIZ(LIZ3));
                    if (!file2.exists()) {
                        file2.createNewFile();
                    }
                    LIZ = file2;
                } catch (Exception e) {
                    PAU.LIZIZ("prepare PersistentFile fail.", e);
                }
            }
            file = LIZ;
        }
        return file;
    }

    public static synchronized File LJJII() {
        File file;
        synchronized (C51029K0z.class) {
            if (LIZLLL == null) {
                File file2 = new File(C16880lQ.LLIIJLIL(C63985P9h.LIZ), "apm6_sdk");
                LIZLLL = file2;
                if (!file2.exists()) {
                    LIZLLL.mkdirs();
                }
            }
            file = LIZLLL;
        }
        return file;
    }

    public static final String LJJIJIIJIL() {
        String methodName;
        StackTraceElement[] arr = new Throwable().getStackTrace();
        o.LJIIIIZZ(arr, "arr");
        StackTraceElement stackTraceElement = (StackTraceElement) ORY.LJJJJI(1, arr);
        if (stackTraceElement == null || (methodName = stackTraceElement.getMethodName()) == null) {
            return "";
        }
        return methodName;
    }

    public static int LJJIFFI() {
        Long.valueOf(EF7.LJI()).intValue();
        int i = 0;
        try {
            String[] split = EF7.LJII().split("\\.");
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                try {
                    i2 = CastIntegerProtector.valueOf(split[i]).intValue() + (i2 * 100);
                    i++;
                } catch (Throwable unused) {
                    i = i2;
                    return i;
                }
            }
            return i2;
        } catch (Throwable unused2) {
        }
    }

    public static final void LJ(String id) {
        C32781Qk LJIILIIL;
        Object obj;
        InterfaceC55235Lm3 LJIJ;
        o.LJIIIZ(id, "id");
        C18080nM.LIZ.getClass();
        C18090nN LJFF2 = C18080nM.LJFF(id);
        if (LJFF2 == null || (LJIILIIL = C12460eI.LJIILIIL(LJFF2)) == null) {
            return;
        }
        C40932G4q.LIZ.getClass();
        ReentrantLock reentrantLock = C40932G4q.LIZIZ;
        reentrantLock.lock();
        try {
            if (C40932G4q.LIZ(LJIILIIL) == null) {
                C40939G4x c40939G4x = new C40939G4x(LJIILIIL.LIZIZ());
                ((java.util.Map) C40932G4q.LIZJ.getValue()).put(C40932G4q.LIZIZ(LJIILIIL), c40939G4x);
                WeakReference<?> host = LJIILIIL.getHost();
                if (host != null && (obj = host.get()) != null) {
                    if (obj instanceof ActivityC45651qj) {
                        LJIJ = C55230Lly.LIZLLL((ActivityC45651qj) obj, null);
                    } else if (obj instanceof Fragment) {
                        LJIJ = C55230Lly.LIZJ((Fragment) obj, null);
                    } else if (obj instanceof InterfaceC55100Ljs) {
                        LJIJ = C55096Ljo.LJIJ((InterfaceC55100Ljs) obj);
                    }
                    if (LJIJ != null) {
                        C55247LmF.LIZIZ(LJIJ, c40939G4x, C40939G4x.class, "source_default_key");
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final boolean LJIIIZ(PostLandingModel postLandingModel) {
        o.LJIIIZ(postLandingModel, "<this>");
        if (!postLandingModel.landingBack) {
            return false;
        }
        String str = postLandingModel.backUrl;
        if ((str != null && str.length() != 0) || !postLandingModel.includeDraft) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC28236B6i LJIIJ(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    List<Fragment> LJJJJLI = fragment.getChildFragmentManager().LJJJJLI();
                    o.LJIIIIZZ(LJJJJLI, "fragment.childFragmentManager.fragments");
                    for (Fragment fragment2 : LJJJJLI) {
                        if (fragment2 instanceof InterfaceC28236B6i) {
                            return (InterfaceC28236B6i) fragment2;
                        }
                        InterfaceC28236B6i LJIIJ = LJIIJ(fragment2);
                        if (LJIIJ != null) {
                            return LJIIJ;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC28236B6i LJIIJJI(Fragment fragment) {
        if (fragment != 0) {
            try {
                if (!fragment.isDetached()) {
                    if ((fragment instanceof InterfaceC28236B6i) && ((InterfaceC28236B6i) fragment).provideDataChannel() != null) {
                        return (InterfaceC28236B6i) fragment;
                    }
                    return LJIIJJI(fragment.getParentFragment());
                }
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public static final String LJIIL(String str) {
        o.LJIIIZ(str, "str");
        try {
            String[] strArr = (String[]) s.LJLJJL(str, new String[]{"."}, 0, 6).toArray(new String[0]);
            if (strArr.length > 1) {
                return strArr[1];
            }
            C3C5.m7constructorimpl(C76800UCe.LIZ);
            return null;
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final DataChannel LJIILIIL(Fragment fragment) {
        ActivityC45651qj activityC45651qj;
        ActivityC45651qj mo49getActivity;
        if (fragment != null) {
            activityC45651qj = fragment.mo49getActivity();
        } else {
            activityC45651qj = null;
        }
        if (activityC45651qj instanceof InterfaceC28236B6i) {
            InterfaceC36571c5 mo49getActivity2 = fragment.mo49getActivity();
            o.LJII(mo49getActivity2, "null cannot be cast to non-null type com.bytedance.ies.sdk.datachannel.DataChannelProvider");
            return ((InterfaceC28236B6i) mo49getActivity2).provideDataChannel();
        }
        InterfaceC28236B6i LJIIJJI = LJIIJJI(fragment);
        if (LJIIJJI == null) {
            if (fragment == null || (mo49getActivity = fragment.mo49getActivity()) == null) {
                return null;
            }
            List<Fragment> LJJJJLI = mo49getActivity.getSupportFragmentManager().LJJJJLI();
            o.LJIIIIZZ(LJJJJLI, "activity.supportFragmentManager.fragments");
            for (Fragment fragment2 : LJJJJLI) {
                if (fragment2 instanceof InterfaceC28236B6i) {
                    LJIIJJI = (InterfaceC28236B6i) fragment2;
                    if (LJIIJJI == null) {
                        return null;
                    }
                } else {
                    LJIIJJI = LJIIJ(fragment2);
                    if (LJIIJJI != null) {
                    }
                }
            }
            return null;
        }
        return LJIIJJI.provideDataChannel();
    }

    public static final Object LJIILLIIL(ReusedAssem reusedAssem) {
        o.LJIIIZ(reusedAssem, "<this>");
        C8XE c8xe = reusedAssem.LJLJLJ;
        if (c8xe != null) {
            return c8xe.LJLIL;
        }
        return null;
    }

    public static final int LJIIZILJ(ReusedAssem reusedAssem) {
        InterfaceC65784Pro<Integer> interfaceC65784Pro;
        o.LJIIIZ(reusedAssem, "<this>");
        C8XE c8xe = reusedAssem.LJLJLJ;
        if (c8xe != null && (interfaceC65784Pro = c8xe.LJLJJL) != null) {
            return interfaceC65784Pro.invoke().intValue();
        }
        return -1;
    }

    public static Intent LJIJI(Context context) {
        return new Intent(context, (Class<?>) MainActivity.class);
    }

    public static final HPB LJIL(Intent intent) {
        if (intent != null && C79000UzU.LJ(intent)) {
            return HPH.LIZ;
        }
        return HR1.LIZ;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0032, code lost:
    
        if (r3.equals("text") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r3.equals("ul") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x001a, code lost:
    
        if (r3.equals("specification") == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:?, code lost:
    
        return X.O6R.LJJIIZ(X.C32151Nz.LJIIZILJ(17));
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x000f. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJ(java.lang.String r3) {
        /*
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r3, r0)
            int r2 = r3.hashCode()
            r0 = 17
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            switch(r2) {
                case -42298471: goto L47;
                case 3735: goto L35;
                case 3556653: goto L2c;
                case 110371416: goto L1d;
                case 1307197699: goto L14;
                default: goto L12;
            }
        L12:
            r0 = 0
        L13:
            return r0
        L14:
            java.lang.String r0 = "specification"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L12
        L1d:
            java.lang.String r0 = "title"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L12
            r0 = 18
            int r0 = X.C7MY.LIZIZ(r0)
            goto L13
        L2c:
            java.lang.String r0 = "text"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L12
        L35:
            java.lang.String r0 = "ul"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L3e
            goto L12
        L3e:
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            goto L13
        L47:
            java.lang.String r0 = "sub_title"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L50
            goto L12
        L50:
            float r0 = X.C32151Nz.LJIIZILJ(r1)
            int r0 = X.O6R.LJJIIZ(r0)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029K0z.LJJ(java.lang.String):int");
    }

    public static final String LJJIII(C64797Pbt c64797Pbt) {
        List<EJ6> list;
        String str;
        o.LJIIIZ(c64797Pbt, "<this>");
        C36910EeA c36910EeA = c64797Pbt.LIZ;
        if (c36910EeA != null) {
            list = c36910EeA.LIZIZ("X-Tt-Logid");
        } else {
            list = null;
        }
        if (list == null || list.size() <= 0 || (str = ((EJ6) ListProtector.get(list, 0)).LIZIZ) == null) {
            return "";
        }
        return str;
    }

    public static final LinkDialog LJJIIJZLJL(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        linkDialog.Al(EnumC76391TyV.MULTI_LIVE_ANCHOR_SETTING_FRAGMENT, new K15());
        return linkDialog;
    }

    public static final java.util.Map LJJIIZI(OSZ pair) {
        o.LJIIIZ(pair, "pair");
        java.util.Map singletonMap = Collections.singletonMap(pair.getFirst(), pair.getSecond());
        o.LJIIIIZZ(singletonMap, "singletonMap(pair.first, pair.second)");
        return singletonMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0172, code lost:
    
        if (r0 == null) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJIJ(X.F38 r14) {
        /*
            Method dump skipped, instructions count: 524
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029K0z.LJJIJ(X.F38):void");
    }

    public static final void LJJIJIIJI(InterfaceC88472Yns interfaceC88472Yns) {
        C18080nM.LIZ.getClass();
        C18090nN c18090nN = C18080nM.LIZJ;
        if (c18090nN != null) {
            for (InterfaceC12390eB LJIILIIL = C12460eI.LJIILIIL(c18090nN); LJIILIIL != null && !((Boolean) interfaceC88472Yns.invoke(LJIILIIL)).booleanValue(); LJIILIIL = LJIILIIL.LIZ()) {
            }
        }
    }

    public static BitrateAudioStruct LJJIJLIJ(SimAudioBitrate simAudioBitrate) {
        BitrateMetaStruct bitrateMetaStruct = null;
        BitrateUrlStruct bitrateUrlStruct = null;
        if (simAudioBitrate == null) {
            return null;
        }
        BitrateAudioStruct bitrateAudioStruct = new BitrateAudioStruct();
        C47055IdP audioMeta = simAudioBitrate.getAudioMeta();
        if (audioMeta != null) {
            BitrateMetaStruct bitrateMetaStruct2 = new BitrateMetaStruct();
            C58825N6v c58825N6v = audioMeta.LIZ;
            if (c58825N6v != null) {
                bitrateUrlStruct = new BitrateUrlStruct();
                bitrateUrlStruct.setMainUrl((String) c58825N6v.LIZ);
                bitrateUrlStruct.setBackupUrl((String) c58825N6v.LIZIZ);
                bitrateUrlStruct.setFallbackUrl((String) c58825N6v.LIZJ);
            }
            bitrateMetaStruct2.setUrlList(bitrateUrlStruct);
            bitrateMetaStruct2.setEncodedType(audioMeta.LIZIZ);
            bitrateMetaStruct2.setMediaType(audioMeta.LIZJ);
            bitrateMetaStruct2.setLogoType(audioMeta.LIZLLL);
            bitrateMetaStruct2.setDefinition(audioMeta.LJ);
            bitrateMetaStruct2.setQuality(audioMeta.LJFF);
            bitrateMetaStruct2.setQualityDesc(audioMeta.LJI);
            bitrateMetaStruct2.setFormat(audioMeta.LJII);
            bitrateMetaStruct2.setWidth(audioMeta.LJIIIIZZ);
            bitrateMetaStruct2.setHeight(audioMeta.LJIIIZ);
            bitrateMetaStruct2.setBitrate(audioMeta.LJIIJ);
            bitrateMetaStruct2.setCodecType(audioMeta.LJIIJJI);
            bitrateMetaStruct2.setSize(audioMeta.LJIIL);
            bitrateMetaStruct2.setFps(audioMeta.LJIILIIL);
            bitrateMetaStruct2.setFileId(audioMeta.LJIILJJIL);
            bitrateMetaStruct2.setFileHash(audioMeta.LJIILL);
            bitrateMetaStruct2.setSubInfo(audioMeta.LJIILLIIL);
            bitrateMetaStruct = bitrateMetaStruct2;
        }
        bitrateAudioStruct.setAudioMeta(bitrateMetaStruct);
        bitrateAudioStruct.setAudioExtra(simAudioBitrate.getAudioExtra());
        bitrateAudioStruct.setAudioQuality(simAudioBitrate.getQualityType());
        return bitrateAudioStruct;
    }

    public static BitRate LJJIL(SimBitRate simBitRate) {
        if (simBitRate == null) {
            return null;
        }
        BitRate bitRate = (BitRate) simBitRate.origin;
        if (bitRate == null) {
            bitRate = new BitRate();
        }
        bitRate.setBytevc1(simBitRate.getIsBytevc1());
        bitRate.setPlayAddr(LJJJJL(simBitRate.playAddrBytevc1));
        bitRate.setPlayAddr(LJJJJL(simBitRate.getPlayAddr()));
        bitRate.setBitRate(simBitRate.getBitRate());
        bitRate.setGearName(simBitRate.getGearName());
        bitRate.setQualityType(simBitRate.getQualityType());
        bitRate.setHdrBit(simBitRate.getHdrBit());
        bitRate.setHdrType(simBitRate.getHdrType());
        bitRate.setFormat(simBitRate.getFormat());
        return bitRate;
    }

    public static SimAudioBitrate LJJJ(BitrateAudioStruct bitrateAudioStruct) {
        C47055IdP c47055IdP = null;
        C58825N6v c58825N6v = null;
        if (bitrateAudioStruct == null) {
            return null;
        }
        SimAudioBitrate simAudioBitrate = new SimAudioBitrate();
        BitrateMetaStruct audioMeta = bitrateAudioStruct.getAudioMeta();
        if (audioMeta != null) {
            C47055IdP c47055IdP2 = new C47055IdP();
            BitrateUrlStruct urlList = audioMeta.getUrlList();
            if (urlList != null) {
                c58825N6v = new C58825N6v(1);
                c58825N6v.LIZ = urlList.getMainUrl();
                c58825N6v.LIZIZ = urlList.getBackupUrl();
                c58825N6v.LIZJ = urlList.getFallbackUrl();
            }
            c47055IdP2.LIZ = c58825N6v;
            c47055IdP2.LIZIZ = audioMeta.getEncodedType();
            c47055IdP2.LIZJ = audioMeta.getMediaType();
            c47055IdP2.LIZLLL = audioMeta.getLogoType();
            c47055IdP2.LJ = audioMeta.getDefinition();
            c47055IdP2.LJFF = audioMeta.getQuality();
            c47055IdP2.LJI = audioMeta.getQualityDesc();
            c47055IdP2.LJII = audioMeta.getFormat();
            c47055IdP2.LJIIIIZZ = audioMeta.getWidth();
            c47055IdP2.LJIIIZ = audioMeta.getHeight();
            c47055IdP2.LJIIJ = audioMeta.getBitrate();
            c47055IdP2.LJIIJJI = audioMeta.getCodecType();
            c47055IdP2.LJIIL = audioMeta.getSize();
            c47055IdP2.LJIILIIL = audioMeta.getFps();
            c47055IdP2.LJIILJJIL = audioMeta.getFileId();
            c47055IdP2.LJIILL = audioMeta.getFileHash();
            c47055IdP2.LJIILLIIL = audioMeta.getSubInfo();
            c47055IdP = c47055IdP2;
        }
        simAudioBitrate.setAudioMeta(c47055IdP);
        simAudioBitrate.setAudioExtra(bitrateAudioStruct.getAudioExtra());
        simAudioBitrate.setQualityType((int) bitrateAudioStruct.getAudioQuality());
        return simAudioBitrate;
    }

    public static SimBitRate LJJJI(BitRate bitRate) {
        if (bitRate == null) {
            return null;
        }
        SimBitRate simBitRate = new SimBitRate();
        simBitRate.origin = bitRate;
        simBitRate.setCodecType(bitRate.isBytevc1());
        simBitRate.setPlayAddr(LJJJIL(bitRate.getPlayAddr()));
        simBitRate.setBitRate(bitRate.getBitRate());
        simBitRate.setGearName(bitRate.getGearName());
        simBitRate.setQualityType(bitRate.getQualityType());
        simBitRate.setHdrType(bitRate.getHdrType());
        simBitRate.setHdrBit(bitRate.getHdrBit());
        simBitRate.setFormat(bitRate.getFormat());
        simBitRate.setVideoExtra(bitRate.getVideoExtra());
        return simBitRate;
    }

    public static SimUrlModel LJJJIL(UrlModel urlModel) {
        String uri;
        if (urlModel == null) {
            return null;
        }
        SimUrlModel simUrlModel = new SimUrlModel();
        simUrlModel.origin = urlModel;
        simUrlModel.setFileHash(urlModel.getFileHash());
        simUrlModel.setHeight(urlModel.getHeight());
        simUrlModel.setWidth(urlModel.getWidth());
        simUrlModel.setSize(urlModel.getSize());
        if (urlModel instanceof VideoUrlModel) {
            uri = ((VideoUrlModel) urlModel).getOriginUri();
        } else {
            uri = urlModel.getUri();
        }
        simUrlModel.setUri(uri);
        simUrlModel.setUrlKey(urlModel.getUrlKey());
        simUrlModel.setUrlList(urlModel.getUrlList());
        simUrlModel.setaK(urlModel.getaK());
        return simUrlModel;
    }

    public static SimVideo LJJJJ(Video video) {
        SimPlayTokenAuth simPlayTokenAuth;
        boolean z;
        IZ6 iz6 = null;
        if (video == null) {
            return null;
        }
        SimVideo simVideo = new SimVideo();
        simVideo.origin = video;
        simVideo.cdnUrlExpired = video.cdnUrlExpired;
        ArrayList arrayList = new ArrayList();
        if (video.getRawBitRate() != null) {
            Iterator it = new ArrayList(video.getRawBitRate()).iterator();
            while (it.hasNext()) {
                arrayList.add(LJJJI((BitRate) it.next()));
            }
        }
        simVideo.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> list = video.bitRateAudio;
        if (list != null) {
            Iterator it2 = new ArrayList(list).iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJJJ((BitrateAudioStruct) it2.next()));
            }
        }
        simVideo.setAudioBitRate(arrayList2);
        PlayTokenAuth drmTokenAuth = video.getDrmTokenAuth();
        if (drmTokenAuth == null) {
            simPlayTokenAuth = null;
        } else {
            simPlayTokenAuth = new SimPlayTokenAuth();
            simPlayTokenAuth.origin = drmTokenAuth;
            simPlayTokenAuth.setAuth(drmTokenAuth.getAuth());
            simPlayTokenAuth.setVersion(drmTokenAuth.getVersionN());
            simPlayTokenAuth.setHostIndex(drmTokenAuth.getHostIndex());
            simPlayTokenAuth.setHosts(drmTokenAuth.getHosts());
            simPlayTokenAuth.setVid(drmTokenAuth.getVid());
            simPlayTokenAuth.setToken(drmTokenAuth.getToken());
        }
        simVideo.setDrmTokenAuth(simPlayTokenAuth);
        simVideo.setDuration(video.getDuration());
        simVideo.setHeight(video.getHeight());
        simVideo.setNeedSetCookie(video.isNeedSetCookie());
        SimVideoUrlModel LJJJJI = LJJJJI(video.getPlayAddr());
        simVideo.setPlayAddr(LJJJJI);
        if (LJJJJI != null && LJJJJI.getSourceId() != null) {
            simVideo.setSourceId(LJJJJI.getSourceId());
        }
        SimVideoUrlModel LJJJJI2 = LJJJJI(video.getPlayAddrBytevc1());
        if (LJJJJI2 != null && LJJJJI2.getSourceId() != null) {
            simVideo.setSourceId(LJJJJI2.getSourceId());
        }
        simVideo.setPlayAddrBytevc1(LJJJJI2);
        SimVideoUrlModel LJJJJI3 = LJJJJI(video.getH264PlayAddr());
        if (LJJJJI3 != null && LJJJJI3.getSourceId() != null) {
            simVideo.setSourceId(LJJJJI3.getSourceId());
        }
        simVideo.setRatio(video.getRatio());
        simVideo.setEnableIntertrustDrm(video.enableIntertrustDrm());
        simVideo.setMeta(video.getMeta());
        simVideo.setVideoLength(video.getVideoLength());
        simVideo.setFormat(video.getFormat());
        simVideo.setVideoModelStr(video.getVideoModelStr());
        simVideo.setVideoModel(video.getVideoModelObject());
        simVideo.setWidth(video.getWidth());
        CaptionModel captionModel = video.getCaptionModel();
        if (captionModel != null && captionModel.getCaptionList() != null && captionModel.getOriginalCaptionLanguage() != null) {
            ArrayList arrayList3 = new ArrayList();
            int i = 0;
            for (CaptionItemModel captionItemModel : captionModel.getCaptionList()) {
                arrayList3.add(new IYA(captionItemModel.getExpire(), captionItemModel.getFormat(), captionItemModel.getLanguageName(), captionItemModel.getSubId(), captionItemModel.getVersionType(), captionItemModel.getUrl(), captionItemModel.getLanguageId(), captionItemModel.isAutoGenerated(), captionItemModel.getComplaintId(), SystemClock.elapsedRealtime(), i, ""));
                i++;
            }
            boolean z2 = true;
            if (captionModel.getEnableAutoCaption() != 0) {
                z = true;
            } else {
                z = false;
            }
            if (captionModel.getHasOriginalAudio() == 0) {
                z2 = false;
            }
            iz6 = new IZ6(z, z2, new E8K(captionModel.getOriginalCaptionLanguage().getLanguageName(), (int) captionModel.getOriginalCaptionLanguage().getLanguageId()), arrayList3);
        }
        simVideo.setClaInfo(iz6);
        return simVideo;
    }

    public static SimVideoUrlModel LJJJJI(VideoUrlModel videoUrlModel) {
        if (videoUrlModel == null) {
            return null;
        }
        SimVideoUrlModel simVideoUrlModel = new SimVideoUrlModel();
        simVideoUrlModel.origin = videoUrlModel;
        simVideoUrlModel.setCdnUrlExpired(videoUrlModel.getCdnUrlExpired());
        ArrayList arrayList = new ArrayList();
        if (videoUrlModel.getRawBitRate() != null) {
            Iterator it = new ArrayList(videoUrlModel.getRawBitRate()).iterator();
            while (it.hasNext()) {
                arrayList.add(LJJJI((BitRate) it.next()));
            }
        }
        simVideoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<BitrateAudioStruct> audioBitrate = videoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it2 = new ArrayList(audioBitrate).iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJJJ((BitrateAudioStruct) it2.next()));
            }
        }
        simVideoUrlModel.setAudioBitRate(arrayList2);
        simVideoUrlModel.setMeta(videoUrlModel.getMeta());
        simVideoUrlModel.setFormat(videoUrlModel.getFormat());
        simVideoUrlModel.setAspectRatio(videoUrlModel.getAspectRatio());
        simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        simVideoUrlModel.setDashVideoModelStr(videoUrlModel.getDashVideoModelStr());
        simVideoUrlModel.setDashVideoId(videoUrlModel.getDashVideoId());
        simVideoUrlModel.setFileCheckSum(videoUrlModel.getFileCheckSum());
        simVideoUrlModel.setCodecType(videoUrlModel.getCodecType());
        simVideoUrlModel.setHitBitrate(videoUrlModel.getHitBitrate());
        simVideoUrlModel.setHitDashVideoBitrate(LJJJI(videoUrlModel.getHitDashVideoBitrate()));
        simVideoUrlModel.setHitDashAudioBitrate(LJJJ(videoUrlModel.getHitDashAudioBitrate()));
        simVideoUrlModel.setRatio(videoUrlModel.getRatio());
        simVideoUrlModel.setVr(videoUrlModel.isVr());
        simVideoUrlModel.setSourceId(videoUrlModel.getSourceId());
        simVideoUrlModel.setDuration(videoUrlModel.getDuration());
        simVideoUrlModel.setFileHash(videoUrlModel.getFileHash());
        simVideoUrlModel.setHeight(videoUrlModel.getHeight());
        simVideoUrlModel.setWidth(videoUrlModel.getWidth());
        simVideoUrlModel.setSize(videoUrlModel.getSize());
        simVideoUrlModel.setUri(videoUrlModel.getOriginUri());
        simVideoUrlModel.setUrlKey(videoUrlModel.getUrlKey());
        simVideoUrlModel.setUrlList(videoUrlModel.getUrlList());
        simVideoUrlModel.setaK(videoUrlModel.getaK());
        return simVideoUrlModel;
    }

    public static final java.util.Map LJJJJIZL(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        java.util.Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        o.LJIIIIZZ(singletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return singletonMap;
    }

    public static final SortedMap LJJJJJ(java.util.Map map) {
        o.LJIIIZ(map, "<this>");
        return new TreeMap(map);
    }

    public static final StickerTemplate LJJJJJL(V45 v45) {
        ImageComponent LIZ2;
        StickerCardFallbackInfoComponent stickerCardFallbackInfoComponent;
        UserInfoComponent userInfoComponent;
        PreviewHintComponent LIZ3;
        BaseRequestComponent baseRequestComponent;
        BaseResponseComponent baseResponseComponent;
        long longValue;
        ImageComponent LIZ4;
        ImageComponent LIZ5;
        C79135V3z c79135V3z = v45.sticker;
        if (c79135V3z != null) {
            LIZ2 = C79081V1x.LJJIZ(c79135V3z);
        } else {
            ImageComponent.Companion.getClass();
            LIZ2 = C79095V2l.LIZ();
        }
        C79148V4m c79148V4m = v45.fallback;
        if (c79148V4m != null) {
            C79135V3z c79135V3z2 = c79148V4m.placeholder;
            if (c79135V3z2 != null) {
                LIZ5 = C79081V1x.LJJIZ(c79135V3z2);
            } else {
                ImageComponent.Companion.getClass();
                LIZ5 = C79095V2l.LIZ();
            }
            stickerCardFallbackInfoComponent = new StickerCardFallbackInfoComponent(LIZ5);
        } else {
            StickerCardFallbackInfoComponent.Companion.getClass();
            stickerCardFallbackInfoComponent = StickerCardFallbackInfoComponent.EMPTY_FALLBACK;
        }
        V4Y v4y = v45.sticker_creator_user_info;
        if (v4y != null) {
            Long l = v4y.user_id;
            if (l == null) {
                longValue = -1;
            } else {
                longValue = l.longValue();
            }
            String str = v4y.nick_name;
            if (str == null) {
                str = "";
            }
            C79135V3z c79135V3z3 = v4y.avatar_thumb;
            if (c79135V3z3 != null) {
                LIZ4 = C79081V1x.LJJIZ(c79135V3z3);
            } else {
                ImageComponent.Companion.getClass();
                LIZ4 = C79095V2l.LIZ();
            }
            userInfoComponent = new UserInfoComponent(longValue, str, LIZ4);
        } else {
            UserInfoComponent.Companion.getClass();
            userInfoComponent = UserInfoComponent.EMPTY_USER_INFO;
        }
        V4L v4l = v45.preview_hint;
        if (v4l != null) {
            LIZ3 = V2B.LJIIZILJ(v4l);
        } else {
            PreviewHintComponent.Companion.getClass();
            LIZ3 = C79087V2d.LIZ();
        }
        RU2 ru2 = v45.req_base;
        if (ru2 != null) {
            baseRequestComponent = C62819Ol5.LJJIIJZLJL(ru2);
        } else {
            baseRequestComponent = new BaseRequestComponent(0);
        }
        RUB rub = v45.resp_base;
        if (rub != null) {
            baseResponseComponent = C69648RVc.LIZJ(rub);
        } else {
            baseResponseComponent = new BaseResponseComponent(260000L, 11);
        }
        return new StickerTemplate(LIZ2, stickerCardFallbackInfoComponent, userInfoComponent, LIZ3, baseRequestComponent, baseResponseComponent);
    }

    public static UrlModel LJJJJL(SimUrlModel simUrlModel) {
        String uri;
        if (simUrlModel == null) {
            return null;
        }
        UrlModel urlModel = (UrlModel) simUrlModel.origin;
        if (urlModel == null) {
            urlModel = new UrlModel();
        }
        urlModel.setFileHash(simUrlModel.getFileHash());
        urlModel.setHeight(simUrlModel.getHeight());
        urlModel.setWidth(simUrlModel.getWidth());
        urlModel.setSize(simUrlModel.getSize());
        if (simUrlModel instanceof SimVideoUrlModel) {
            uri = ((SimVideoUrlModel) simUrlModel).getOriginUri();
        } else {
            uri = simUrlModel.getUri();
        }
        urlModel.setUri(uri);
        urlModel.setUrlKey(simUrlModel.getUrlKey());
        urlModel.setUrlList(simUrlModel.getUrlList());
        urlModel.setaK(simUrlModel.getaK());
        return urlModel;
    }

    public static VideoUrlModel LJJJJLI(CaptionItemModel captionItemModel) {
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(captionItemModel.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(captionItemModel.getUrl());
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUrlList(arrayList);
        videoUrlModel.setUri(String.valueOf(captionItemModel.getSubId()));
        videoUrlModel.setUrlKey(String.valueOf(captionItemModel.getSubId()));
        return videoUrlModel;
    }

    public static VideoUrlModel LJJJJLL(IYA iya) {
        if (iya == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = new VideoUrlModel();
        videoUrlModel.setSourceId(String.valueOf(iya.getSubId()));
        ArrayList arrayList = new ArrayList();
        arrayList.add(iya.getUrl());
        videoUrlModel.setUrlList(arrayList);
        return videoUrlModel;
    }

    public static VideoUrlModel LJJJJZ(SimVideoUrlModel simVideoUrlModel) {
        if (simVideoUrlModel == null) {
            return null;
        }
        VideoUrlModel videoUrlModel = (VideoUrlModel) simVideoUrlModel.origin;
        if (videoUrlModel == null) {
            videoUrlModel = new VideoUrlModel();
        }
        ArrayList arrayList = new ArrayList();
        if (simVideoUrlModel.getRawBitRate() != null) {
            Iterator it = new ArrayList(simVideoUrlModel.getRawBitRate()).iterator();
            while (it.hasNext()) {
                arrayList.add(LJJIL((SimBitRate) it.next()));
            }
        }
        videoUrlModel.setBitRate(arrayList);
        ArrayList arrayList2 = new ArrayList();
        List<SimAudioBitrate> audioBitrate = simVideoUrlModel.getAudioBitrate();
        if (audioBitrate != null) {
            Iterator it2 = new ArrayList(audioBitrate).iterator();
            while (it2.hasNext()) {
                arrayList2.add(LJJIJLIJ((SimAudioBitrate) it2.next()));
            }
        }
        videoUrlModel.setAudioBitrate(arrayList2);
        videoUrlModel.setMeta(simVideoUrlModel.getMeta());
        videoUrlModel.setFormat(simVideoUrlModel.getFormat());
        videoUrlModel.setAspectRatio(simVideoUrlModel.getAspectRatio());
        videoUrlModel.setDashVideoId(simVideoUrlModel.getDashVideoId());
        videoUrlModel.setDashVideoModelStr(simVideoUrlModel.getDashVideoModelStr());
        videoUrlModel.setDashVideoId(simVideoUrlModel.getDashVideoId());
        videoUrlModel.setFileCheckSum(simVideoUrlModel.getFileCheckSum());
        videoUrlModel.setCodecType(simVideoUrlModel.getCodecType());
        videoUrlModel.setHitBitrate(simVideoUrlModel.getHitBitrate());
        videoUrlModel.setHitDashVideoBitrate(LJJIL(simVideoUrlModel.getHitDashVideoBitrate()));
        videoUrlModel.setHitDashAudioBitrate(LJJIJLIJ(simVideoUrlModel.getHitDashAudioBitrate()));
        videoUrlModel.setRatio(simVideoUrlModel.getRatio());
        videoUrlModel.setVr(simVideoUrlModel.isVr());
        videoUrlModel.setSourceId(simVideoUrlModel.getSourceId());
        videoUrlModel.setDuration(simVideoUrlModel.getDuration());
        videoUrlModel.setFileHash(simVideoUrlModel.getFileHash());
        videoUrlModel.setHeight(simVideoUrlModel.getHeight());
        videoUrlModel.setWidth(simVideoUrlModel.getWidth());
        videoUrlModel.setSize(simVideoUrlModel.getSize());
        videoUrlModel.setUri(simVideoUrlModel.getOriginUri());
        videoUrlModel.setUrlKey(simVideoUrlModel.getUrlKey());
        videoUrlModel.setUrlList(simVideoUrlModel.getUrlList());
        videoUrlModel.setCdnUrlExpired(simVideoUrlModel.getCdnUrlExpired());
        videoUrlModel.setaK(simVideoUrlModel.getaK());
        return videoUrlModel;
    }

    public static final void LJFF(TDE bindIconImageViewUrl, String str) {
        o.LJIIIZ(bindIconImageViewUrl, "$this$bindIconImageViewUrl");
        if (str == null || str.length() == 0) {
            return;
        }
        C78764Uvg.LJIIIZ(bindIconImageViewUrl.getImageView(), str, -1, -1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r8.equals("specification") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        r4 = X.C7MY.LIZIZ(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x007e, code lost:
    
        if (r8.equals("text") == false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (r8.equals("ul") == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int LJJI(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r5 = "text"
            kotlin.jvm.internal.o.LJIIIZ(r7, r5)
            java.lang.String r0 = "type"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            int r6 = X.C27162AlK.LIZ
            android.content.Context r0 = X.EF7.LIZIZ()
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131165521(0x7f070151, float:1.7945261E38)
            float r4 = r1.getDimension(r0)
            java.lang.String r3 = "ul"
            boolean r2 = kotlin.jvm.internal.o.LJ(r8, r3)
            r0 = 2
            float r1 = (float) r6
            if (r2 != 0) goto L8e
            float r0 = (float) r0
            float r0 = r0 * r4
            float r1 = r1 - r0
        L28:
            int r2 = r8.hashCode()
            r0 = 3735(0xe97, float:5.234E-42)
            if (r2 == r0) goto L81
            r0 = 3556653(0x36452d, float:4.983932E-39)
            if (r2 == r0) goto L7a
            r0 = 110371416(0x6942258, float:5.5721876E-35)
            if (r2 == r0) goto L6b
            r0 = 1307197699(0x4dea4103, float:4.9126614E8)
            if (r2 == r0) goto L62
        L3f:
            r4 = 0
        L40:
            int r2 = r7.length()
            int r2 = r2 * r4
            int r0 = (int) r1
            if (r2 >= r0) goto L4a
            r3 = 1
        L49:
            return r3
        L4a:
            int r3 = r7.length()
            int r3 = r3 * r4
            int r3 = r3 / r0
            int r0 = r7.length()
            int r0 = r0 * r4
            float r2 = (float) r0
            float r0 = (float) r3
            float r0 = r0 * r1
            float r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L5f
            goto L49
        L5f:
            int r3 = r3 + 1
            goto L49
        L62:
            java.lang.String r0 = "specification"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L88
            goto L3f
        L6b:
            java.lang.String r0 = "title"
            boolean r0 = r8.equals(r0)
            if (r0 != 0) goto L74
            goto L3f
        L74:
            r0 = 7
            int r4 = X.C7MY.LIZIZ(r0)
            goto L40
        L7a:
            boolean r0 = r8.equals(r5)
            if (r0 != 0) goto L88
            goto L3f
        L81:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L88
            goto L3f
        L88:
            r0 = 4
            int r4 = X.C7MY.LIZIZ(r0)
            goto L40
        L8e:
            float r0 = (float) r0
            float r0 = r0 * r4
            float r1 = r1 - r0
            r0 = 24
            int r0 = X.C7MY.LIZIZ(r0)
            float r0 = (float) r0
            float r1 = r1 - r0
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029K0z.LJJI(java.lang.String, java.lang.String):int");
    }

    public static final void LJJIJIL(TDE selectStatus, boolean z) {
        o.LJIIIZ(selectStatus, "$this$selectStatus");
        selectStatus.setCustomSelected(z);
        TextView textView = selectStatus.getTextView();
        if (textView instanceof C74253TCf) {
            ((C74253TCf) textView).setMarqueeEnable(z);
        } else {
            if (!(textView instanceof TD7)) {
                return;
            }
            ((TD7) textView).setMarqueeEnable$lib_runtime_release(z);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LJJIJL(com.ss.android.ugc.aweme.feed.model.live.MaskLayer r7, boolean r8) {
        /*
            X.Ol8 r0 = X.C35201Drh.LIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lae
            boolean r0 = X.C35810E3q.LJIIIIZZ()
            if (r0 == 0) goto Laa
            java.lang.String r3 = LJJIJIIJIL()
        L18:
            X.K12 r0 = X.K12.LIZ
            r0.getClass()
            X.Ol8 r0 = X.K12.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r2 = 1
            if (r0 == 0) goto La5
            if (r7 == 0) goto L40
            com.ss.android.ugc.aweme.feed.model.live.Text r0 = r7.getTitle()
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.getDefaultPattern()
            if (r0 == 0) goto L40
            int r0 = r0.length()
            if (r0 != 0) goto L92
        L40:
            r6 = 1
            if (r7 == 0) goto L90
        L43:
            boolean r0 = r7.isR2OrUnknownMask()
        L47:
            r5 = r0 ^ 1
            java.lang.String r4 = "FeedMaskLayerExt"
            if (r8 != 0) goto L51
            if (r6 != 0) goto L51
            if (r5 == 0) goto L66
        L51:
            java.lang.String r2 = "shouldShowR2MaskLayer(). return false. \n params[clickWatchLive="
            java.lang.String r1 = ", isMaskLayerNUll="
            java.lang.String r0 = ", isNotR2OrUnknownMask="
            java.lang.StringBuilder r1 = X.C00F.LIZLLL(r2, r8, r1, r6, r0)
            r0 = 93
            java.lang.String r1 = X.C48339Iy7.LIZJ(r1, r5, r0, r1)
            X.PvW r0 = X.AbstractC66014PvW.LIZ
            if (r0 != 0) goto L8c
        L65:
            r2 = 0
        L66:
            java.lang.StringBuilder r1 = X.X1D.LIZ()
            java.lang.String r0 = "shouldShowMaskLayer(). shouldShow="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ". \n enterMethod="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "()"
            r1.append(r0)
            java.lang.String r1 = X.X1D.LIZIZ(r1)
            X.PvW r0 = X.AbstractC66014PvW.LIZ
            if (r0 != 0) goto L88
        L87:
            return r2
        L88:
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogI(r4, r1)
            goto L87
        L8c:
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogW(r4, r1)
            goto L65
        L90:
            r0 = 0
            goto L47
        L92:
            com.ss.android.ugc.aweme.feed.model.live.Text r0 = r7.getSubTitle()
            if (r0 == 0) goto L40
            java.lang.String r0 = r0.getDefaultPattern()
            if (r0 == 0) goto L40
            int r0 = r0.length()
            if (r0 != 0) goto La8
            goto L40
        La5:
            if (r7 != 0) goto La8
            goto L40
        La8:
            r6 = 0
            goto L43
        Laa:
            java.lang.String r3 = ""
            goto L18
        Lae:
            java.lang.String r3 = LJJIJIIJIL()
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029K0z.LJJIJL(com.ss.android.ugc.aweme.feed.model.live.MaskLayer, boolean):boolean");
    }

    public static final void LJJIZ(C5CW c5cw, W5F w5f) {
        Integer num = c5cw.LIZ;
        if (num != null) {
            int intValue = num.intValue();
            Integer num2 = c5cw.LIZIZ;
            if (num2 != null) {
                int intValue2 = num2.intValue();
                w5f.LJII = intValue;
                w5f.LJIIIIZZ = intValue2;
            }
        }
        Bitmap.Config config = c5cw.LIZJ;
        if (config != null) {
            w5f.LJIJI = config;
        }
        if (c5cw.LJ > 0) {
            S3I s3i = new S3I();
            s3i.LIZLLL = SFS.LJI(r0);
            w5f.LJIJJLI = new S3L(s3i);
        }
        w5f.LIZLLL = true;
        Integer num3 = c5cw.LIZLLL;
        if (num3 != null) {
            w5f.LJIIJJI = num3.intValue();
        }
        w5f.LJJIII = EnumC62195Ob1.SMALL;
        w5f.LJFF = 0;
    }

    public static final java.util.Map LJJJJZI(java.util.Map map, C35964E9o defaultValue) {
        o.LJIIIZ(map, "<this>");
        o.LJIIIZ(defaultValue, "defaultValue");
        if (map instanceof InterfaceC35963E9n) {
            return LJJJJZI(((InterfaceC35963E9n) map).LJIIJ(), defaultValue);
        }
        return new C35962E9m(map, defaultValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0090  */
    @Override // X.F4M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public X.C37659EqF LIZJ(X.EnumC37658EqE r12, X.K10 r13) {
        /*
            r11 = this;
            X.EqE r3 = X.EnumC37658EqE.Online
            r1 = 0
            if (r12 != r3) goto L49
            android.webkit.WebView r5 = r13.LIZ()
            if (r5 == 0) goto L48
            java.util.Map r9 = r13.getRequestHeaders()
            if (r9 != 0) goto L16
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
        L16:
            java.lang.String r2 = "x-tt-bypass-dp"
            java.lang.String r0 = "1"
            r9.put(r2, r0)
            com.ss.android.ugc.aweme.compliance.sandbox.api.webview.IWebViewTTNetHandler r4 = com.ss.android.ugc.aweme.compliance.sandbox.webview.WebViewTTNetHandlerImp.LIZIZ()
            boolean r6 = r13.isForMainFrame()
            java.lang.String r7 = "GET"
            android.net.Uri r8 = r13.getUrl()
            java.lang.String r0 = "request.url"
            kotlin.jvm.internal.o.LJIIIIZZ(r8, r0)
            X.EiT r10 = X.EnumC37177EiT.RESOURCE_INTERCEPT
            X.Dz7 r2 = r4.LIZ(r5, r6, r7, r8, r9, r10)
            if (r2 == 0) goto L48
            android.net.Uri r0 = r13.getUrl()
            java.lang.String r0 = r0.toString()
            android.webkit.WebResourceResponse r0 = r2.LIZ(r0)
            X.EqF r1 = X.C37660EqG.LIZ(r0, r3, r1)
        L48:
            return r1
        L49:
            X.EqE r0 = X.EnumC37658EqE.Offline
            if (r12 != r0) goto Lbc
            android.net.Uri r0 = r13.getUrl()     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L80
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L82
            java.lang.String r0 = "uri.toString()"
            kotlin.jvm.internal.o.LJIIIIZZ(r4, r0)     // Catch: java.lang.Throwable -> L82
            com.bytedance.forest.Forest r3 = X.C39914FlW.LIZ()     // Catch: java.lang.Throwable -> L82
            com.bytedance.forest.model.RequestParams r2 = new com.bytedance.forest.model.RequestParams     // Catch: java.lang.Throwable -> L82
            X.NxI r0 = X.EnumC61028NxI.WEB_CHILD_RESOURCE     // Catch: java.lang.Throwable -> L82
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L82
            r0 = 0
            r2.setDisableBuiltin(r0)     // Catch: java.lang.Throwable -> L82
            r2.setDisableOffline(r0)     // Catch: java.lang.Throwable -> L82
            r0 = 1
            r2.setDisableCdn(r0)     // Catch: java.lang.Throwable -> L82
            X.F9r r0 = r3.createSyncRequest(r4, r2)     // Catch: java.lang.Throwable -> L82
            if (r0 == 0) goto L80
            X.O3v r3 = r0.LIZ()     // Catch: java.lang.Throwable -> L82
        L7c:
            X.C3C5.m7constructorimpl(r3)     // Catch: java.lang.Throwable -> L82
            goto L8a
        L80:
            r3 = r1
            goto L7c
        L82:
            r0 = move-exception
            X.3C4 r3 = X.C141335gf.LIZ(r0)
            X.C3C5.m7constructorimpl(r3)
        L8a:
            boolean r0 = X.C3C5.m12isFailureimpl(r3)
            if (r0 == 0) goto L91
            r3 = r1
        L91:
            X.O3v r3 = (X.C61295O3v) r3
            if (r3 == 0) goto Lbc
            android.webkit.WebResourceResponse r2 = r3.V()
            if (r2 == 0) goto Lbc
            java.lang.String r1 = r3.LLD
            java.lang.String r0 = "cdn"
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r0)
            if (r0 == 0) goto Lc5
            X.EqE r1 = X.EnumC37658EqE.Online
        La7:
            int r0 = r2.getStatusCode()
            if (r0 != 0) goto Lc0
            boolean r0 = r3.LJZL
            if (r0 == 0) goto Lbd
            r0 = 200(0xc8, float:2.8E-43)
        Lb3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.EqF r1 = X.C37660EqG.LIZ(r2, r1, r0)
        Lbc:
            return r1
        Lbd:
            r0 = 404(0x194, float:5.66E-43)
            goto Lb3
        Lc0:
            int r0 = r2.getStatusCode()
            goto Lb3
        Lc5:
            X.EqE r1 = X.EnumC37658EqE.Offline
            goto La7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51029K0z.LIZJ(X.EqE, X.K10):X.EqF");
    }

    public static final void LJII(int i, int i2, CharSequence charSequence) {
        SpannableStringBuilder spannableStringBuilder;
        CharacterStyle[] characterStyleArr;
        SpannableStringBuilder spannableStringBuilder2;
        CommentEditText$MentionSpan[] commentEditText$MentionSpanArr;
        if (i2 > 0) {
            CharSequence charSequence2 = null;
            if (charSequence != null) {
                charSequence2 = charSequence.subSequence(i, i2 + i);
            }
            boolean z = charSequence2 instanceof SpannableStringBuilder;
            if (z) {
                SpannableStringBuilder spannableStringBuilder3 = (SpannableStringBuilder) charSequence2;
                if ((spannableStringBuilder3 == null || (commentEditText$MentionSpanArr = (CommentEditText$MentionSpan[]) spannableStringBuilder3.getSpans(0, ((SpannableStringBuilder) charSequence2).length(), CommentEditText$MentionSpan.class)) == null || commentEditText$MentionSpanArr.length != 1) && z && (spannableStringBuilder = (SpannableStringBuilder) charSequence2) != null && (characterStyleArr = (CharacterStyle[]) spannableStringBuilder.getSpans(0, ((SpannableStringBuilder) charSequence2).length(), CharacterStyle.class)) != null) {
                    for (CharacterStyle characterStyle : characterStyleArr) {
                        if (!(characterStyle instanceof CommentEditText$MentionSpan) && !(characterStyle instanceof CommentEmojiSpan) && (charSequence instanceof SpannableStringBuilder) && (spannableStringBuilder2 = (SpannableStringBuilder) charSequence) != null) {
                            spannableStringBuilder2.removeSpan(characterStyle);
                        }
                    }
                }
            }
        }
    }

    public static final void LJIIIIZZ(AbstractC029409q adapter, List list, List newList) {
        o.LJIIIZ(adapter, "adapter");
        o.LJIIIZ(newList, "newList");
        C03200Aq.LIZ(new C25551A1b(list, newList), true).LIZJ(adapter);
    }

    public static final LinkDialog LJJIIJ(LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, boolean z) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        LinkDialog linkDialog = new LinkDialog(lifecycleOwner);
        EnumC76391TyV enumC76391TyV = EnumC76391TyV.MULTI_CO_HOST_MANAGER;
        K11 k11 = new K11();
        k11.LIZIZ = z;
        k11.LIZJ = interfaceC88472Yns;
        linkDialog.Al(enumC76391TyV, k11);
        return linkDialog;
    }

    public static final void LJI(TDE bindIconImageViewUrl, String str, SIY siy, IDdS197S0200000_12 iDdS197S0200000_12) {
        o.LJIIIZ(bindIconImageViewUrl, "$this$bindIconImageViewUrl");
        if (str.length() == 0) {
            return;
        }
        C78764Uvg.LJIIJ(bindIconImageViewUrl.getImageView(), str, -1, -1, null, siy, iDdS197S0200000_12);
    }

    @Override // X.K1N
    public void LIZ(C81535VzH c81535VzH, EnumC79770VSk networkState, HashMap detailMap, JSONObject jSONObject) {
        o.LJIIIZ(networkState, "networkState");
        o.LJIIIZ(detailMap, "detailMap");
        if (networkState == EnumC79770VSk.NO_NETWORK && c81535VzH.LIZIZ) {
            C1DH.LJJIJIIJI(new Runnable() { // from class: X.2LL
                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ2;
                    try {
                        C5S1 c5s1 = new C5S1(EF7.LIZIZ());
                        c5s1.LIZJ(R.string.tg1);
                        c5s1.LJ();
                    } finally {
                        if (LIZ2) {
                        }
                    }
                }
            });
        }
        try {
            FUA.LIZJ("aweme_music_download_netdetect_log", jSONObject);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }
}
