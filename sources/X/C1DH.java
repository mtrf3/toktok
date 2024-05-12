package X;

import Y.ALAdapterS2S0100000_3;
import android.R;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.text.method.KeyListener;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.InteractionQuestionInfo;
import com.bytedance.android.livesdk.model.MaskLayer;
import com.bytedance.android.livesdk.model.RoomAuthStatus;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.nle.editor_jni.NLEEditor;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.google.gson.internal.n;
import com.ss.android.ugc.asve.context.PreviewSize;
import com.ss.android.ugc.aweme.beauty.ComposerBeauty;
import com.ss.android.ugc.aweme.beauty.ComposerBeautyExtraBeautify;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.im.service.model.IMContact;
import com.ss.android.ugc.aweme.im.service.model.IMConversation;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.services.BaseUserService;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.ugc.aweme.tools.beauty.BeautyCategory;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEUtils;
import java.io.Closeable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import kotlin.jvm.internal.o;

/* renamed from: X.1DH, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1DH implements n, InterfaceC67679QhH {
    public static int LJLIL = 3;
    public static int LJLILLLLZI = 3;
    public static int LJLJI = 3;
    public static int LJLJJI = 3;
    public static SoftReference LJLJJL;
    public static final C1DH LJLJJLL = new C1DH();
    public static final int[] LJLJL = {1, 2, 4, 8, 16, 32, 64, 128};
    public static final String[] LJLJLJ = {"", "A", "AI", "AN", "ANG", "AO", "BA", "BAI", "BAN", "BANG", "BAO", "BEI", "BEN", "BENG", "BI", "BIAN", "BIAO", "BIE", "BIN", "BING", "BO", "BU", "CA", "CAI", "CAN", "CANG", "CAO", "CE", "CEN", "CENG", "CHA", "CHAI", "CHAN", "CHANG", "CHAO", "CHE", "CHEN", "CHENG", "CHI", "CHONG", "CHOU", "CHU", "CHUAI", "CHUAN", "CHUANG", "CHUI", "CHUN", "CHUO", "CI", "CONG", "COU", "CU", "CUAN", "CUI", "CUN", "CUO", "DA", "DAI", "DAN", "DANG", "DAO", "DE", "DENG", "DI", "DIA", "DIAN", "DIAO", "DIE", "DING", "DIU", "DONG", "DOU", "DU", "DUAN", "DUI", "DUN", "DUO", "E", "EI", "EN", "ER", "E^", "FA", "FAN", "FANG", "FEI", "FEN", "FENG", "FO", "FOU", "FU", "GA", "GAI", "GAN", "GANG", "GAO", "GE", "GEI", "GEN", "GENG", "GONG", "GOU", "GU", "GUA", "GUAI", "GUAN", "GUANG", "GUI", "GUN", "GUO", "HA", "HAI", "HAN", "HANG", "HAO", "HE", "HEI", "HEN", "HENG", "HONG", "HOU", "HU", "HUA", "HUAI", "HUAN", "HUANG", "HUI", "HUN", "HUO", "JI", "JIA", "JIAN", "JIANG", "JIAO", "JIE", "JIN", "JING", "JIONG", "JIU", "JU", "JUAN", "JUE", "JUN", "KA", "KAI", "KAN", "KANG", "KAO", "KE", "KEN", "KENG", "KONG", "KOU", "KU", "KUA", "KUAI", "KUAN", "KUANG", "KUI", "KUN", "KUO", "LA", "LAI", "LAN", "LANG", "LAO", "LE", "LEI", "LENG", "LI", "LIA", "LIAN", "LIANG", "LIAO", "LIE", "LIN", "LING", "LIU", "LONG", "LOU", "LU", "LUAN", "LUN", "LUO", "LV", "LVE", "M", "MA", "MAI", "MAN", "MANG", "MAO", "ME", "MEI", "MEN", "MENG", "MI", "MIAN", "MIAO", "MIE", "MIN", "MING", "MIU", "MO", "MOU", "MU", "NA", "NAI", "NAN", "NANG", "NAO", "NE", "NEI", "NEN", "NENG", "NG", "NI", "NIAN", "NIANG", "NIAO", "NIE", "NIN", "NING", "NIU", "NONG", "NOU", "NU", "NUAN", "NUO", "NV", "NVE", "O", "OU", "PA", "PAI", "PAN", "PANG", "PAO", "PEI", "PEN", "PENG", "PI", "PIAN", "PIAO", "PIE", "PIN", "PING", "PO", "POU", "PU", "QI", "QIA", "QIAN", "QIANG", "QIAO", "QIE", "QIN", "QING", "QIONG", "QIU", "QU", "QUAN", "QUE", "QUN", "RAN", "RANG", "RAO", "RE", "REN", "RENG", "RI", "RONG", "ROU", "RU", "RUAN", "RUI", "RUN", "RUO", "SA", "SAI", "SAN", "SANG", "SAO", "SE", "SEN", "SENG", "SHA", "SHAI", "SHAN", "SHANG", "SHAO", "SHE", "SHEI", "SHEN", "SHENG", "SHI", "SHOU", "SHU", "SHUA", "SHUAI", "SHUAN", "SHUANG", "SHUI", "SHUN", "SHUO", "SI", "SONG", "SOU", "SU", "SUAN", "SUI", "SUN", "SUO", "TA", "TAI", "TAN", "TANG", "TAO", "TE", "TENG", "TI", "TIAN", "TIAO", "TIE", "TING", "TONG", "TOU", "TU", "TUAN", "TUI", "TUN", "TUO", "WA", "WAI", "WAN", "WANG", "WEI", "WEN", "WENG", "WO", "WU", "XI", "XIA", "XIAN", "XIANG", "XIAO", "XIE", "XIN", "XING", "XIONG", "XIU", "XU", "XUAN", "XUE", "XUN", "YA", "YAN", "YANG", "YAO", "YE", "YI", "YIAO", "YIN", "YING", "YO", "YONG", "YOU", "YU", "YUAN", "YUE", "YUN", "ZA", "ZAI", "ZAN", "ZANG", "ZAO", "ZE", "ZEI", "ZEN", "ZENG", "ZHA", "ZHAI", "ZHAN", "ZHANG", "ZHAO", "ZHE", "ZHEI", "ZHEN", "ZHENG", "ZHI", "ZHONG", "ZHOU", "ZHU", "ZHUA", "ZHUAI", "ZHUAN", "ZHUANG", "ZHUI", "ZHUN", "ZHUO", "ZI", "ZONG", "ZOU", "ZU", "ZUAN", "ZUI", "ZUN", "ZUO"};

    public static boolean LJIJJLI() {
        return BaseUserService.createIUserServicebyMonsterPlugin(false).getCurrentUser() != null && AV1.LJIIJJI();
    }

    public static Handler LJIILIIL() {
        Handler handler;
        SoftReference softReference = LJLJJL;
        if (softReference != null && (handler = (Handler) softReference.get()) != null) {
            return handler;
        }
        Handler handler2 = new Handler(C16880lQ.LLJJJJ());
        LJLJJL = new SoftReference(handler2);
        return handler2;
    }

    public static final boolean LJIL() {
        if (C35407Dv1.LIZ && C58572Rp.LIZ) {
            return true;
        }
        return false;
    }

    public static boolean LJJIFFI() {
        int i;
        int i2 = LJLIL;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        String str = Build.MANUFACTURER;
        if (!TextUtils.isEmpty(str) && str.contains("HUAWEI")) {
            i = 1;
        } else {
            i = 2;
        }
        LJLIL = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJIII() {
        int i;
        int i2 = LJLILLLLZI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(EXC.LIZ().LIZIZ("ro.miui.ui.version.name"))) {
            i = 1;
        } else {
            i = 2;
        }
        LJLILLLLZI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZ() {
        int i;
        int i2 = LJLJJI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        if (!TextUtils.isEmpty(EXC.LIZ().LIZIZ("ro.smartisan.version"))) {
            i = 1;
        } else {
            i = 2;
        }
        LJLJJI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    public static boolean LJJIIZI() {
        int i;
        int i2 = LJLJI;
        if (i2 != 3) {
            if (i2 != 1) {
                return false;
            }
            return true;
        }
        String LIZIZ = EXC.LIZ().LIZIZ("ro.vivo.os.name");
        if (!TextUtils.isEmpty(LIZIZ) && LIZIZ.toLowerCase().contains("funtouch")) {
            i = 1;
        } else {
            i = 2;
        }
        LJLJI = i;
        if (i != 1) {
            return false;
        }
        return true;
    }

    @Override // com.google.gson.internal.n
    public Object LJI() {
        return new TreeSet();
    }

    public static final boolean LIZIZ(VideoSegment videoSegment) {
        VEUtils.VEVideoFileInfo vEVideoFileInfo;
        o.LJIIIZ(videoSegment, "<this>");
        int min = Math.min(videoSegment.width, videoSegment.height);
        int max = Math.max(videoSegment.width, videoSegment.height);
        try {
        } catch (Exception e) {
            H78.LIZJ(e.getMessage());
        }
        if (((Boolean) C52379Kh5.LIZ.getValue()).booleanValue() && (vEVideoFileInfo = VEUtils.getVEVideoFileInfo(videoSegment.LJII(false))) != null && vEVideoFileInfo.bHDR) {
            return true;
        }
        if (((Number) C44660Hfs.LIZ(min, max, videoSegment.LJI(), videoSegment.LIZLLL()).getFirst()).intValue() != 0) {
            return false;
        }
        return true;
    }

    public static void LIZJ(Runnable runnable) {
        LJIILIIL().removeCallbacks(runnable);
    }

    public static final int LJ(HashMap hashMap) {
        if (((ArrayList) ORY.LJJIJLIJ(new Object[]{hashMap})).size() == 1) {
            return 1;
        }
        return 0;
    }

    public static final List LJFF(List list) {
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((Aweme) it.next()).m114clone());
            }
            return arrayList;
        }
        return C61878OQg.INSTANCE;
    }

    public static void LJII(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static final void LJIIIIZZ(NLEEditor nLEEditor) {
        o.LJIIIZ(nLEEditor, "<this>");
        nLEEditor.LIZIZ();
        nLEEditor.LIZJ();
    }

    public static void LJIIJ(C82A c82a) {
        c82a.animate().cancel();
        o.LJIIIIZZ(c82a.animate().alpha(0.0f).setDuration(150L).setListener(new ALAdapterS2S0100000_3(c82a, 7)), "View.fadeOut(\n    durati…\n            }\n        })");
    }

    public static final List LJIIL(List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                for (ComposerBeauty composerBeauty : ((BeautyCategory) it.next()).getBeautyList()) {
                    if (composerBeauty.isCollectionType()) {
                        List<ComposerBeauty> childList = composerBeauty.getChildList();
                        if (childList != null && !childList.isEmpty()) {
                            arrayList.addAll(childList);
                        }
                    } else {
                        arrayList.add(composerBeauty);
                    }
                }
            }
        }
        return arrayList;
    }

    public static final Room LJIILL(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Room) dataChannel.kv0(RoomChannel.class);
        }
        return null;
    }

    public static final int LJIILLIIL(List list) {
        o.LJIIIZ(list, "<this>");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            IMContact iMContact = (IMContact) it.next();
            if (iMContact instanceof IMConversation) {
                i = ((IMConversation) iMContact).getConversationMemberCount() + i;
            } else if (iMContact instanceof IMUser) {
                i++;
            }
        }
        return i;
    }

    public static final boolean LJIIZILJ(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        Integer num;
        if (!LJJIIJZLJL(dataChannel) || (LJIILL = LJIILL(dataChannel)) == null || (interactionQuestionInfo = LJIILL.interactionQuestion) == null || (num = interactionQuestionInfo.qaEntryType) == null || num.intValue() != 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJ(ComposerBeauty isAlbum) {
        boolean z;
        o.LJIIIZ(isAlbum, "$this$isAlbum");
        String parentId = isAlbum.getParentId();
        if (parentId == null || parentId.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static final boolean LJIJI(ComposerBeauty isCanUpdateComposerNode) {
        String unzipPath;
        o.LJIIIZ(isCanUpdateComposerNode, "$this$isCanUpdateComposerNode");
        List<ComposerBeautyExtraBeautify.ItemsBean> items = isCanUpdateComposerNode.getBeautifyExtra().getItems();
        if (((items == null || items.isEmpty()) && !isCanUpdateComposerNode.getExtra().isNone()) || (unzipPath = isCanUpdateComposerNode.getEffect().getUnzipPath()) == null || unzipPath.length() == 0 || !isCanUpdateComposerNode.getEnable()) {
            return false;
        }
        return true;
    }

    public static final boolean LJIJJ(ComposerBeauty isCategoryExclusive) {
        o.LJIIIZ(isCategoryExclusive, "$this$isCategoryExclusive");
        if (!LJIJ(isCategoryExclusive) && isCategoryExclusive.getCategoryExclusive()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJ(ComposerBeauty isExclusive) {
        o.LJIIIZ(isExclusive, "$this$isExclusive");
        if (LJIJ(isExclusive) || LJIJJ(isExclusive) || isExclusive.isBeautyMode()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJI(DataChannel dataChannel) {
        Room LJIILL;
        InteractionQuestionInfo interactionQuestionInfo;
        if (LJJIIJZLJL(dataChannel) && (LJIILL = LJIILL(dataChannel)) != null && (interactionQuestionInfo = LJIILL.interactionQuestion) != null && interactionQuestionInfo.qaEntryType != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJII(ComposerBeauty isMakeUpNone) {
        o.LJIIIZ(isMakeUpNone, "$this$isMakeUpNone");
        if (!LJIJ(isMakeUpNone) && !isMakeUpNone.getCategoryExclusive() && isMakeUpNone.getExtra().isNone()) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIIJ(DataChannel dataChannel) {
        Room LJIILL = LJIILL(dataChannel);
        if (LJIILL == null || LJIILL.questionVersion == 0) {
            return false;
        }
        return true;
    }

    public static final boolean LJJIIJZLJL(DataChannel dataChannel) {
        RoomAuthStatus roomAuthStatus;
        Room LJIILL = LJIILL(dataChannel);
        if (LJIILL == null || (roomAuthStatus = LJIILL.getRoomAuthStatus()) == null || !roomAuthStatus.isEnableQuestion()) {
            return false;
        }
        return true;
    }

    public static void LJJIJIIJI(Runnable runnable) {
        LJIILIIL().post(runnable);
    }

    public static final void LJJIJIL(EditText editText) {
        if (editText == null) {
            return;
        }
        editText.setFocusable(true);
        editText.setFocusableInTouchMode(true);
        editText.requestFocus();
        editText.setCursorVisible(true);
    }

    public static final int LJJJIL(String str) {
        Integer LJJIL;
        if (str != null && (LJJIL = C38350F3i.LJJIL(str)) != null) {
            return LJJIL.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC67679QhH
    public void onFailure(Exception it) {
        o.LJIIIZ(it, "it");
        C67550QfC.LIZIZ = true;
        C67550QfC.LIZ = false;
        C67550QfC.LIZJ = false;
        R5Q.LIZ(false, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x004d, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00b4, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.ss.android.ugc.aweme.beauty.ComposerBeauty LJIIJJI(com.ss.android.ugc.aweme.beauty.ComposerBeauty r8, java.util.List r9) {
        /*
            java.lang.String r0 = "$this$findBeautyParent"
            kotlin.jvm.internal.o.LJIIIZ(r8, r0)
            r7 = 0
            if (r9 == 0) goto L14
            java.lang.String r0 = r8.getParentId()
            if (r0 == 0) goto L14
            int r0 = r0.length()
            if (r0 != 0) goto L15
        L14:
            return r7
        L15:
            java.util.Iterator r6 = r9.iterator()
        L19:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L14
            java.lang.Object r5 = r6.next()
            com.ss.android.ugc.aweme.tools.beauty.BeautyCategory r5 = (com.ss.android.ugc.aweme.tools.beauty.BeautyCategory) r5
            java.util.List r0 = r5.getBeautyList()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L32:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L49
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            boolean r0 = r0.isCollectionType()
            if (r0 == 0) goto L32
            r3.add(r1)
            goto L32
        L49:
            java.util.Iterator r4 = r3.iterator()
        L4d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L76
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r3
            java.util.List r0 = r3.getChildList()
            if (r0 == 0) goto L4d
            java.util.Iterator r2 = r0.iterator()
        L63:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L4d
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r8)
            if (r0 == 0) goto L63
            if (r1 == 0) goto L4d
            return r3
        L76:
            java.util.List r0 = r5.getBeautyList()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L83:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L9a
            java.lang.Object r1 = r2.next()
            r0 = r1
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            boolean r0 = r0.isBeautyMode()
            if (r0 == 0) goto L83
            r3.add(r1)
            goto L83
        L9a:
            java.util.Iterator r5 = r3.iterator()
        L9e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L19
            java.lang.Object r0 = r5.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r0 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r0
            java.util.List r0 = r0.getChildList()
            if (r0 == 0) goto L9e
            java.util.Iterator r4 = r0.iterator()
        Lb4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L9e
            java.lang.Object r3 = r4.next()
            com.ss.android.ugc.aweme.beauty.ComposerBeauty r3 = (com.ss.android.ugc.aweme.beauty.ComposerBeauty) r3
            boolean r0 = r3.isCollectionType()
            if (r0 == 0) goto Lb4
            java.util.List r0 = r3.getChildList()
            if (r0 == 0) goto Lb4
            java.util.Iterator r2 = r0.iterator()
        Ld0:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto Lb4
            java.lang.Object r1 = r2.next()
            boolean r0 = kotlin.jvm.internal.o.LJ(r1, r8)
            if (r0 == 0) goto Ld0
            if (r1 == 0) goto Lb4
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DH.LJIIJJI(com.ss.android.ugc.aweme.beauty.ComposerBeauty, java.util.List):com.ss.android.ugc.aweme.beauty.ComposerBeauty");
    }

    public static final int LJIILJJIL(C19K c19k, int i) {
        int paddingLeft;
        int i2;
        if (c19k == null) {
            return i;
        }
        ViewGroup.LayoutParams layoutParams = c19k.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            paddingLeft = i - c19k.getPaddingLeft();
            i2 = c19k.getPaddingRight();
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            paddingLeft = ((i - c19k.getPaddingLeft()) - c19k.getPaddingRight()) - marginLayoutParams.leftMargin;
            i2 = marginLayoutParams.rightMargin;
        }
        return paddingLeft - i2;
    }

    public static void LJJIJIIJIL(long j, Runnable runnable) {
        LJIILIIL().postDelayed(runnable, j);
    }

    public static final void LJJIJL(C19K c19k, boolean z) {
        if (c19k == null) {
            return;
        }
        if (!z) {
            if (c19k.getKeyListener() != null) {
                c19k.setTag(-1043131756, c19k.getKeyListener());
            }
            c19k.setKeyListener(null);
        } else {
            Object tag = c19k.getTag(-1043131756);
            if (!(tag instanceof KeyListener)) {
                return;
            }
            c19k.setKeyListener((KeyListener) tag);
        }
    }

    public static final VECameraSettings LJJJI(InterfaceC83931Wwp toCameraSettings, InterfaceC88472Yns interfaceC88472Yns) {
        VECameraSettings.CAMERA_FACING_ID camera_facing_id;
        VECameraSettings.CAMERA_OUTPUT_MODE camera_output_mode;
        o.LJIIIZ(toCameraSettings, "$this$toCameraSettings");
        VECameraSettings.Builder builder = new VECameraSettings.Builder();
        builder.setIsUseNewCameraTypeStrategy(true);
        builder.setDontUseVendorCameraType(toCameraSettings.LJJIIZ());
        YZL toVEFacingID = toCameraSettings.LIZ();
        o.LJIIIZ(toVEFacingID, "$this$toVEFacingID");
        int i = YZN.LIZ[toVEFacingID.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_WIDE_ANGLE;
                } else {
                    throw new C162476Zf();
                }
            } else {
                camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_FRONT;
            }
        } else {
            camera_facing_id = VECameraSettings.CAMERA_FACING_ID.FACING_BACK;
        }
        builder.setCameraFacing(camera_facing_id);
        builder.setOptionFlag(toCameraSettings.LJIIIZ());
        if (toCameraSettings.LJJIIJ()) {
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        } else {
            C83739Wtj.LIZIZ();
            camera_output_mode = VECameraSettings.CAMERA_OUTPUT_MODE.SURFACE;
        }
        builder.setOutPutMode(camera_output_mode);
        builder.setRetryCnt(toCameraSettings.LJJIIJZLJL());
        builder.setRetryStartPreviewCnt(toCameraSettings.LJII());
        int[] LJIILL = toCameraSettings.LJIILL();
        if (LJIILL.length >= 2) {
            builder.setPreviewSize(LJIILL[0], LJIILL[1]);
            ORY.LJJJJL(LJIILL, "x", null, 62);
        } else {
            PreviewSize LJIIJJI = ((XFZ) C83739Wtj.LIZIZ()).LJIIJJI();
            if (LJIIJJI != null) {
                builder.setPreviewSize(LJIIJJI.getWidth(), LJIIJJI.getHeight());
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(LJIIJJI.getWidth());
                LIZ.append('x');
                LIZ.append(LJIIJJI.getHeight());
                String content = X1D.LIZIZ(LIZ);
                o.LJIIIZ(content, "content");
            }
        }
        int[] LJIJ = toCameraSettings.LJIJ();
        if (LJIJ != null && LJIJ.length >= 2) {
            builder.setFpsRange(LJIJ);
        }
        Boolean LJIIIIZZ = toCameraSettings.LJIIIIZZ();
        if (LJIIIIZZ != null) {
            builder.setCameraAntiShake(LJIIIIZZ.booleanValue());
        }
        builder.setCameraModeType(toCameraSettings.LIZLLL());
        builder.enableShutterSound(toCameraSettings.LJJII());
        HashMap<VKA, Cert> hashMap = new HashMap<>();
        C78862UxG c78862UxG = C83663WsV.LJIIIIZZ;
        if (c78862UxG != null) {
            hashMap.put(VKA.REGISTER_SENSOR, c78862UxG);
        }
        C78862UxG c78862UxG2 = C83663WsV.LJIIIZ;
        if (c78862UxG2 != null) {
            hashMap.put(VKA.UNREGISTER_SENSOR, c78862UxG2);
        }
        builder.setCameraPrivacyCertMap(hashMap);
        interfaceC88472Yns.invoke(builder);
        VECameraSettings build = builder.build();
        build.enableManualReleaseCaptureResult(toCameraSettings.LJI());
        return build;
    }

    public static final void LIZ(LifecycleOwner lifecycleOwner, InterfaceC55260LmS source, Class cls) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        o.LJIIIZ(source, "source");
        C55247LmF.LIZIZ(C85855Xml.LIZ(lifecycleOwner).LIZ, source, cls, null);
    }

    public static final void LIZLLL(ComposerBeauty checkExclusiveData, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88471Ynr composerNodeExclusionChecker) {
        o.LJIIIZ(checkExclusiveData, "$this$checkExclusiveData");
        o.LJIIIZ(composerNodeExclusionChecker, "composerNodeExclusionChecker");
        if (!((Boolean) interfaceC88472Yns.invoke(checkExclusiveData)).booleanValue() || !LJIJI(checkExclusiveData)) {
            return;
        }
        if (checkExclusiveData.getExtra().isNone()) {
            int[] iArr = (int[]) composerNodeExclusionChecker.invoke(checkExclusiveData.getEffect().getUnzipPath(), "");
            if (iArr == null || iArr.length != 2 || iArr[0] != 0 || iArr[1] != EnumC53635L3f.EXCLUDE.getFlag()) {
                return;
            }
            checkExclusiveData.setEnable(false);
            return;
        }
        List<ComposerBeautyExtraBeautify.ItemsBean> items = checkExclusiveData.getBeautifyExtra().getItems();
        if (items == null) {
            return;
        }
        Iterator<ComposerBeautyExtraBeautify.ItemsBean> it = items.iterator();
        while (it.hasNext()) {
            int[] iArr2 = (int[]) composerNodeExclusionChecker.invoke(checkExclusiveData.getEffect().getUnzipPath(), it.next().getTag());
            if (iArr2 != null && iArr2.length == 2 && iArr2[0] == 0 && iArr2[1] == EnumC53635L3f.EXCLUDE.getFlag()) {
                checkExclusiveData.setEnable(false);
            }
        }
    }

    public static void LJIIIZ(C82A c82a, long j, int i) {
        float f;
        if ((i & 1) != 0) {
            j = c82a.getResources().getInteger(R.integer.config_shortAnimTime);
        }
        if ((i & 2) != 0) {
            f = 1.0f;
        } else {
            f = 0.0f;
        }
        c82a.animate().cancel();
        C17N.LJJLIIIJJI(c82a);
        o.LJIIIIZZ(c82a.animate().alpha(f).setDuration(j).setListener(null), "animate()\n        .alpha…       .setListener(null)");
    }

    public static final boolean LJJIJLIJ(Room room, EnterRoomConfig enterRoomConfig, boolean z) {
        boolean LJJIL = LJJIL(room, enterRoomConfig, z);
        if (C30922CBq.LIZIZ) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("shouldShowMaskLayer(). shouldShow=");
            LIZ.append(LJJIL);
            LIZ.append('.');
            C0NB.LJIIIZ("MaskLayerExt", X1D.LIZIZ(LIZ));
        }
        return LJJIL;
    }

    public static final boolean LJJIL(Room room, EnterRoomConfig enterRoomConfig, boolean z) {
        boolean z2;
        MaskLayer maskLayer;
        boolean LJIJJ = C29306Beo.LJIJJ(room);
        if (room != null && (maskLayer = room.maskLayer) != null) {
            z2 = maskLayer.isR2OrUnknownMask();
        } else {
            z2 = false;
        }
        if (z || LJIJJ || !z2) {
            if (C30922CBq.LIZIZ) {
                StringBuilder LIZLLL = C00F.LIZLLL("shouldShowR2MaskLayer(). return false. \n params[isClickWatchLive=", z, ",  maskLayerNull=", LJIJJ, ", isNotR2Mask=");
                LIZLLL.append(!z2);
                LIZLLL.append(']');
                C0NB.LJIIL("MaskLayerExt", X1D.LIZIZ(LIZLLL));
            }
            return false;
        }
        if (enterRoomConfig != null) {
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
            String str = roomsData.enterMethod;
            String str2 = roomsData.enterFromMerge;
            if (o.LJ("live_cell", str) && (o.LJ("homepage_hot", str2) || o.LJ("homepage_follow", str2))) {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("shouldShowR2MaskLayer(). return false. \n params[enterMethod=");
                    LIZ.append(str);
                    LIZ.append(",  enterFromMerge=");
                    LIZ.append(str2);
                    LIZ.append(']');
                    C0NB.LJIIL("MaskLayerExt", X1D.LIZIZ(LIZ));
                }
                return false;
            }
            if (o.LJ("right_anchor", str) && o.LJ("live_detail", str2)) {
                if (C30922CBq.LIZIZ) {
                    StringBuilder LIZ2 = X1D.LIZ();
                    LIZ2.append("shouldShowR2MaskLayer(). return false. \n params[enterMethod=");
                    LIZ2.append(str);
                    LIZ2.append(",  enterFromMerge=");
                    LIZ2.append(str2);
                    LIZ2.append(']');
                    C0NB.LJIIL("MaskLayerExt", X1D.LIZIZ(LIZ2));
                }
                return false;
            }
        }
        return true;
    }

    public static final void LJJIJ(C19K c19k, int i, int i2, Integer num) {
        Editable text;
        int LJIILJJIL;
        int i3;
        if (c19k == null || (text = c19k.getText()) == null || text.length() == 0) {
            return;
        }
        if (num != null) {
            LJIILJJIL = num.intValue();
        } else {
            LJIILJJIL = LJIILJJIL(c19k, c19k.getMaxWidth());
        }
        try {
            if (c19k.getLayout() == null) {
                i3 = new StaticLayout(c19k.getText(), c19k.getPaint(), LJIILJJIL, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            } else {
                i3 = c19k.getLayout().getLineCount();
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            i3 = 0;
        }
        if (i3 > i || c19k.getText().length() > i2) {
            String obj = c19k.getText().toString();
            int i4 = i * 50;
            if (obj.length() >= i4) {
                obj = obj.substring(0, i4);
                o.LJIIIIZZ(obj, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            String LIZIZ = C58314Muc.LIZIZ(obj, 1, 0, "this as java.lang.String…ing(startIndex, endIndex)");
            for (int length = LIZIZ.length() - 1; length >= 0 && Character.isHighSurrogate(LIZIZ.charAt(length)); length--) {
                LIZIZ = LIZIZ.substring(0, length);
                o.LJIIIIZZ(LIZIZ, "this as java.lang.String…ing(startIndex, endIndex)");
            }
            c19k.setText(LIZIZ);
            c19k.setSelection(c19k.getText().length());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r0.getConfig() == r10) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap LJJIZ(android.graphics.drawable.Drawable r7, int r8, int r9, android.graphics.Bitmap.Config r10) {
        /*
            boolean r0 = r7 instanceof android.graphics.drawable.BitmapDrawable
            java.lang.String r6 = "bitmap"
            if (r0 == 0) goto L3d
            if (r10 == 0) goto L18
            r0 = r7
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r6)
            android.graphics.Bitmap$Config r0 = r0.getConfig()
            if (r0 != r10) goto L3d
        L18:
            android.graphics.drawable.BitmapDrawable r7 = (android.graphics.drawable.BitmapDrawable) r7
            int r0 = r7.getIntrinsicWidth()
            if (r8 != r0) goto L2e
            int r0 = r7.getIntrinsicHeight()
            if (r9 != r0) goto L2e
            android.graphics.Bitmap r0 = r7.getBitmap()
            kotlin.jvm.internal.o.LJIIIIZZ(r0, r6)
            return r0
        L2e:
            android.graphics.Bitmap r1 = r7.getBitmap()
            r0 = 1
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createScaledBitmap(r1, r8, r9, r0)
            java.lang.String r0 = "Bitmap.createScaledBitma…map, width, height, true)"
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r0)
            return r1
        L3d:
            android.graphics.Rect r0 = r7.getBounds()
            int r5 = r0.left
            int r4 = r0.top
            int r3 = r0.right
            int r2 = r0.bottom
            if (r10 == 0) goto L62
        L4b:
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r8, r9, r10)
            r0 = 0
            r7.setBounds(r0, r0, r8, r9)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r7.draw(r0)
            r7.setBounds(r5, r4, r3, r2)
            kotlin.jvm.internal.o.LJIIIIZZ(r1, r6)
            return r1
        L62:
            android.graphics.Bitmap$Config r10 = android.graphics.Bitmap.Config.ARGB_8888
            goto L4b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1DH.LJJIZ(android.graphics.drawable.Drawable, int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public static /* synthetic */ Bitmap LJJJ(Drawable drawable, int i, int i2, int i3) {
        if ((i3 & 1) != 0) {
            i = drawable.getIntrinsicWidth();
        }
        if ((i3 & 2) != 0) {
            i2 = drawable.getIntrinsicHeight();
        }
        return LJJIZ(drawable, i, i2, null);
    }

    public static InterfaceC68379QsZ LJJJJ(InterfaceC68406Qt0 interfaceC68406Qt0, C68376QsW c68376QsW, C68377QsX c68377QsX, List list) {
        if (interfaceC68406Qt0.LJFF(c68376QsW.LJLIL)) {
            InterfaceC68379QsZ LJIIIZ = interfaceC68406Qt0.LJIIIZ(c68376QsW.LJLIL);
            if (LJIIIZ instanceof AbstractC68364QsK) {
                return ((AbstractC68364QsK) LJIIIZ).LIZ(c68377QsX, list);
            }
            throw new IllegalArgumentException(C16880lQ.LLLZ("%s is not a function", new Object[]{c68376QsW.LJLIL}));
        }
        if ("hasOwnProperty".equals(c68376QsW.LJLIL)) {
            C68368QsO.LJII(1, "hasOwnProperty", list);
            if (interfaceC68406Qt0.LJFF(c68377QsX.LIZIZ((InterfaceC68379QsZ) ListProtector.get(list, 0)).LJII())) {
                return InterfaceC68379QsZ.LJIILL;
            }
            return InterfaceC68379QsZ.LJIILLIIL;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Object has no function %s", new Object[]{c68376QsW.LJLIL}));
    }
}
