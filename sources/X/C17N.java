package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.os.HandlerThread;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.g1;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.live.UgActivityResult;
import com.bytedance.android.live.network.response.BaseResponse;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestV3GuestMonitoringTipsSetting;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.ttnet.TTNetInit;
import com.google.android.play.core.appupdate.u;
import com.google.gson.s;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.search.common.communicate.SearchServiceImpl;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.edit.model.VideoCutInfo;
import com.ss.android.ugc.aweme.utils.JsonParseUtils;
import com.ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import com.ss.android.vesdk.ROTATE_DEGREE;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.17N, reason: invalid class name */
/* loaded from: classes.dex */
public class C17N implements InterfaceC48038ItG, InterfaceC84511XEt, InterfaceC85311Xdz, V22, InterfaceC29424Bgi {
    public static final C17N LJLIL = new C17N();
    public static final C17N LJLILLLLZI = new C17N();

    public static String LJIJ(long j) {
        return j < 0 ? "[-∞, 0)" : j < 5000 ? "[0, 5s)" : j < 12000 ? "[5s, 12s)" : j < 30000 ? "[12s, 30s)" : j < 60000 ? "[30s, 1min)" : j < 180000 ? "[1min, 3min)" : j < 900000 ? "[3min, 15min)" : j < 1800000 ? "[15min, 0.5h)" : j < 3600000 ? "[0.5h, 1h)" : "[1h, +∞)";
    }

    @Override // X.InterfaceC84511XEt
    public boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC84511XEt
    public void LIZIZ(Queue queue) {
    }

    @Override // X.InterfaceC84511XEt
    public void LJFF() {
    }

    @Override // X.InterfaceC29424Bgi
    public String getSource() {
        return null;
    }

    @Override // X.InterfaceC85311Xdz
    public void LIZJ() {
        DJX.LIZ.storeLong(C43001GuD.LJIILJJIL(), System.currentTimeMillis());
    }

    public static String LJIL() {
        TTNetInit.getTTNetDepend().LJIIIIZZ();
        if (!TextUtils.isEmpty(".tiktokv.com")) {
            return ".tiktokv.com";
        }
        throw new IllegalArgumentException("hostSuffix is not init !!!");
    }

    public static final ISearchContextAbility LJJJJLI() {
        return SearchServiceImpl.LLLZI().LJJJLL();
    }

    public static final ISearchContextAbility LJJJJLL() {
        return SearchServiceImpl.LLLZI().LLJ();
    }

    public static final boolean LJIIIIZZ(Activity activity) {
        long j;
        o.LJIIIZ(activity, "activity");
        if (C37284EkC.LIZIZ) {
            C37284EkC.LIZIZ = false;
            return true;
        }
        if (!C39579Fg7.LJIILL()) {
            H78.LIZJ("record check SD not available");
            C5S1 c5s1 = new C5S1(activity);
            c5s1.LIZJ(R.string.qb6);
            c5s1.LJ();
            C37284EkC.LIZIZ(-1L, -1L, false, false);
        } else {
            long j2 = 1024;
            long LIZ = C00F.LIZ(31744, 20, "record_min_disk_amount_mb", true) * j2 * j2;
            try {
                j = C39579Fg7.LJIILIIL();
            } catch (Exception unused) {
                j = 0;
            }
            if (j < LIZ) {
                long j3 = LIZ - j;
                if (j3 > 0) {
                    C44172HVg.LIZJ.getClass();
                    LocalVideoPlayerManager LIZLLL = LocalVideoPlayerManager.LIZLLL();
                    LIZLLL.LIZ();
                    if (!LIZLLL.LJLIL.LJII(j3)) {
                        H78.LIZJ("RecordCheck disk space insufficient sdAvailableSize:" + j + " minDiskAmountByte:" + LIZ);
                        C5S1 c5s12 = new C5S1(C16880lQ.LLLLJ(activity));
                        c5s12.LIZJ(R.string.ekn);
                        c5s12.LJ();
                        C37284EkC.LIZIZ(j, LIZ, true, false);
                    }
                }
            }
            C37284EkC.LIZIZ(j, LIZ, true, true);
            return true;
        }
        return false;
    }

    public static final void LJIIJ(int i) {
        if (new C40517FvF(2, 36).LJIILJJIL(i)) {
            return;
        }
        StringBuilder LJ = C7MY.LJ("radix ", i, " was not in valid range ");
        LJ.append(new C40517FvF(2, 36));
        throw new IllegalArgumentException(X1D.LIZIZ(LJ));
    }

    public static final XBaseModel LJIIL(Class cls) {
        return ED5.LIZJ(cls, null);
    }

    public static final XBaseModel LJIILJJIL(C65776Prg c65776Prg) {
        return ED5.LIZJ(C39557Ffl.LIZ(c65776Prg), null);
    }

    public static int LJIILL(double d) {
        Context LIZIZ = EF7.LIZIZ();
        if (LIZIZ.getResources() != null && LIZIZ.getResources().getDisplayMetrics() != null) {
            return (int) ((d * LIZIZ.getResources().getDisplayMetrics().density) + 0.5d);
        }
        return 0;
    }

    public static final float LJIJJLI(float f) {
        return (EF7.LIZIZ().getResources().getDisplayMetrics().density * f) + 0.5f;
    }

    public static final NLEModel LJJ(InterfaceC153045zY getNLEModel) {
        o.LJIIIZ(getNLEModel, "$this$getNLEModel");
        if (!(getNLEModel instanceof C133765Mu)) {
            getNLEModel = null;
        }
        C133765Mu c133765Mu = (C133765Mu) getNLEModel;
        if (c133765Mu == null) {
            return null;
        }
        return c133765Mu.LJFF();
    }

    public static final C122034qd LJJI(InterfaceC153045zY getNLEPro) {
        o.LJIIIZ(getNLEPro, "$this$getNLEPro");
        if (!(getNLEPro instanceof C133765Mu)) {
            getNLEPro = null;
        }
        C133765Mu c133765Mu = (C133765Mu) getNLEPro;
        if (c133765Mu == null) {
            return null;
        }
        return c133765Mu.LJI();
    }

    public static final String LJJIFFI(String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            return null;
        }
        return str;
    }

    public static final C35936E8m LJJII(HashMap hashMap) {
        C35936E8m c35936E8m = new C35936E8m();
        if (hashMap == null) {
            return c35936E8m;
        }
        for (Map.Entry entry : hashMap.entrySet()) {
            c35936E8m.LIZJ((String) entry.getKey(), (String) entry.getValue());
        }
        return c35936E8m;
    }

    public static final String LJJIII(Object obj) {
        o.LJIIIZ(obj, "<this>");
        String LJLLJ = C16880lQ.LJLLJ(obj.getClass());
        if (LJLLJ.length() <= 23) {
            return LJLLJ;
        }
        String substring = LJLLJ.substring(0, 23);
        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void LJJIIJZLJL(View view) {
        if (view != null && view.getVisibility() != 8) {
            view.setVisibility(8);
        }
    }

    public static boolean LJJIIZI(List list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean LJJIJ(EnterRoomConfig enterRoomConfig) {
        C28595BKd c28595BKd;
        if (o.LJ("live_merge", enterRoomConfig.mRoomsData.enterFromMerge) && o.LJ("live_cover", enterRoomConfig.mRoomsData.enterMethod)) {
            C28594BKc LIZJ = C28594BKc.LIZJ();
            if (!LIZJ.LIZ || (c28595BKd = LIZJ.LIZIZ) == null || !c28595BKd.LIZLLL) {
                return true;
            }
        }
        return false;
    }

    public static final boolean LJJIJIIJIL(char c) {
        if (Character.isWhitespace(c) || Character.isSpaceChar(c)) {
            return true;
        }
        return false;
    }

    public static final String LJJIJIL(String joinSeparator) {
        o.LJIIIZ(joinSeparator, "$this$joinSeparator");
        String str = File.separator;
        o.LJIIIIZZ(str, "File.separator");
        if (ujb.o.LJJJJ(joinSeparator, str, false)) {
            return joinSeparator;
        }
        return i0.LJFF(joinSeparator, str);
    }

    public static final C5H3 LJJIJL(InterfaceC65784Pro initializer) {
        o.LJIIIZ(initializer, "initializer");
        return C221108m2.LIZ(EnumC221088m0.NONE, initializer);
    }

    public static final String LJJIJLIJ(int i) {
        StringBuilder LIZ = X1D.LIZ();
        return C17M.LIZ(U44.BIZ, LIZ, "_MultiLiveActivityViewBinder_", i, LIZ);
    }

    public static int LJJJJI(double d) {
        return (int) ((d / EF7.LIZIZ().getResources().getDisplayMetrics().density) + 0.5d);
    }

    public static final android.net.Uri LJJJJIZL(String str) {
        try {
            android.net.Uri parse = UriProtector.parse(str);
            o.LJFF(parse, "Uri.parse(this)");
            return parse;
        } catch (Exception unused) {
            android.net.Uri uri = android.net.Uri.EMPTY;
            o.LJFF(uri, "Uri.EMPTY");
            return uri;
        }
    }

    public static final ISearchContextAbility LJJJJJ(View view) {
        o.LJIIIZ(view, "<this>");
        return SearchServiceImpl.LLLZI().LLLI(view);
    }

    public static final ISearchContextAbility LJJJJJL(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "<this>");
        return SearchServiceImpl.LLLZI().LLLLLILLIL(lifecycleOwner);
    }

    public static final ISearchContextAbility LJJJJL(Aweme aweme) {
        o.LJIIIZ(aweme, "<this>");
        return SearchServiceImpl.LLLZI().LLJJI(aweme);
    }

    public static int LJJJLL(double d) {
        return (int) ((d * EF7.LIZIZ().getResources().getDisplayMetrics().scaledDensity) + 0.5d);
    }

    public static final Boolean LJJJLZIJ(String v) {
        o.LJIIIZ(v, "v");
        if (o.LJ(v, CardStruct.IStatusCode.DEFAULT)) {
            return Boolean.FALSE;
        }
        if (o.LJ(v, "1")) {
            return Boolean.TRUE;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static String[] LJJJZ(java.util.Set set) {
        String[] strArr = new String[set.size()];
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            strArr[i] = it.next();
            i++;
        }
        return strArr;
    }

    public static final TextComponent LJJL(RUF ruf) {
        if (ruf.text == null) {
            return null;
        }
        String text = ruf.text;
        o.LJIIIIZZ(text, "text");
        return new TextComponent(text);
    }

    public static final EnumC74783TWp LJJLI(int i) {
        MultiGuestV3GuestMonitoringTipsSetting multiGuestV3GuestMonitoringTipsSetting = MultiGuestV3GuestMonitoringTipsSetting.INSTANCE;
        List<Integer> badLevelList = multiGuestV3GuestMonitoringTipsSetting.getBadLevelList();
        List<Integer> veryBadLevelList = multiGuestV3GuestMonitoringTipsSetting.getVeryBadLevelList();
        List<Integer> hiddenLevelList = multiGuestV3GuestMonitoringTipsSetting.getHiddenLevelList();
        if (badLevelList.contains(Integer.valueOf(i))) {
            return EnumC74783TWp.BAD;
        }
        if (veryBadLevelList.contains(Integer.valueOf(i))) {
            return EnumC74783TWp.VERY_BAD;
        }
        if (hiddenLevelList.contains(Integer.valueOf(i))) {
            return EnumC74783TWp.GOOD;
        }
        return EnumC74783TWp.UNKNOWN;
    }

    public static final String LJJLIIIIJ(HandlerThread handlerThread) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("HandlerThread@");
        LIZ.append(Integer.toHexString(handlerThread.hashCode()));
        LIZ.append(" | ");
        StringBuilder sb = new StringBuilder(X1D.LIZIZ(LIZ));
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("alive=");
        LIZ2.append(handlerThread.isAlive());
        LIZ2.append(" ; looper=");
        LIZ2.append(handlerThread.getLooper());
        sb.append(X1D.LIZIZ(LIZ2));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final String LJJLIIIJ(IX4 ix4) {
        boolean z;
        o.LJIIIZ(ix4, "<this>");
        StringBuilder sb = new StringBuilder("PrepareData | ");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("id=");
        LIZ.append((Object) ix4.LJIIIZ);
        LIZ.append(" ; codecType=");
        LIZ.append(ix4.LJIILIIL);
        LIZ.append(" ; decoderType=");
        LIZ.append(ix4.LJIJ);
        LIZ.append(" ; prepareOnly=");
        LIZ.append(ix4.LJJ);
        LIZ.append(" ; uri=");
        LIZ.append((Object) ix4.LJJIIJ);
        LIZ.append(" ; dash=");
        if (ix4.LJJJJZI != null) {
            z = true;
        } else {
            z = false;
        }
        LIZ.append(z);
        sb.append(X1D.LIZIZ(LIZ));
        String sb2 = sb.toString();
        o.LJIIIIZZ(sb2, "sb.toString()");
        return sb2;
    }

    public static final ROTATE_DEGREE[] LJJLIIIJILLIZJL(EditPreviewInfo totalRotate) {
        ROTATE_DEGREE rotate_degree;
        o.LJIIIZ(totalRotate, "$this$totalRotate");
        List<EditVideoSegment> videoList = totalRotate.getVideoList();
        ArrayList arrayList = new ArrayList(C32I.LJJL(videoList, 10));
        Iterator<EditVideoSegment> it = videoList.iterator();
        while (it.hasNext()) {
            VideoCutInfo videoCutInfo = it.next().getVideoCutInfo();
            if (videoCutInfo != null) {
                int rotate = videoCutInfo.getRotate();
                if (rotate != 90) {
                    if (rotate != 180) {
                        if (rotate != 270) {
                            rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
                        } else {
                            rotate_degree = ROTATE_DEGREE.ROTATE_270;
                        }
                    } else {
                        rotate_degree = ROTATE_DEGREE.ROTATE_180;
                    }
                } else {
                    rotate_degree = ROTATE_DEGREE.ROTATE_90;
                }
                if (rotate_degree != null) {
                    arrayList.add(rotate_degree);
                }
            }
            rotate_degree = ROTATE_DEGREE.ROTATE_NONE;
            arrayList.add(rotate_degree);
        }
        Object[] array = arrayList.toArray(new ROTATE_DEGREE[0]);
        if (array != null) {
            return (ROTATE_DEGREE[]) array;
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
    }

    public static final void LJJLIIIJJI(View view) {
        if (view != null && view.getVisibility() != 0) {
            view.setVisibility(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC48038ItG
    public Object apply(Object obj) {
        BaseResponse ugActivityResultResponse = (BaseResponse) obj;
        o.LJIIIZ(ugActivityResultResponse, "ugActivityResultResponse");
        int i = ((UgActivityResult) ugActivityResultResponse.data).statusCode;
        if (i != 0 && i != 51) {
            return AbstractC73672Svk.LJJI(new Exception("retry"));
        }
        return AbstractC73672Svk.LJJIJIL(ugActivityResultResponse);
    }

    public static final long LIZLLL(int i, int i2) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i2 >= 0) {
                return (i2 & 4294967295L) | (i << 32);
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("end cannot be negative. [start: ");
            LIZ.append(i);
            LIZ.append(", end: ");
            LIZ.append(i2);
            LIZ.append(']');
            String LIZIZ = X1D.LIZIZ(LIZ);
            LIZIZ.toString();
            throw new IllegalArgumentException(LIZIZ);
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("start cannot be negative. [start: ");
        LIZ2.append(i);
        LIZ2.append(", end: ");
        LIZ2.append(i2);
        LIZ2.append(']');
        String LIZIZ2 = X1D.LIZIZ(LIZ2);
        LIZIZ2.toString();
        throw new IllegalArgumentException(LIZIZ2);
    }

    public static void LJ(String str, Throwable th) {
        if (th == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (!(th instanceof C37067Egh) && !(th instanceof s)) {
            return;
        }
        String stackTraceString = android.util.Log.getStackTraceString(th);
        C198517qh c198517qh = new C198517qh();
        c198517qh.LIZ.put("errorUrl", str);
        c198517qh.LIZ.put("errorDesc", stackTraceString);
        c198517qh.LIZ.put("errorResponse", "");
        JSONObject LJ = c198517qh.LJ();
        if (LJ == null) {
            LJ = new JSONObject();
        }
        try {
            if (!TextUtils.isEmpty("")) {
                LJ.put("service", "");
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJ("aweme_parse_error_log", LJ);
    }

    public static final void LJI(C13O c13o, C11P event) {
        o.LJIIIZ(c13o, "<this>");
        o.LJIIIZ(event, "event");
        if (u.LIZ(event)) {
            c13o.LIZJ = event.LIZJ;
            C61898ORa.LJJIFFI(c13o.LIZ, null);
        }
        long j = event.LJFF;
        List list = event.LJIIJ;
        if (list == null) {
            list = C61878OQg.INSTANCE;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            AnonymousClass119 anonymousClass119 = (AnonymousClass119) ListProtector.get(list, i);
            long LJFF = C10370av.LJFF(anonymousClass119.LIZIZ, j);
            j = anonymousClass119.LIZIZ;
            long LJI = C10370av.LJI(c13o.LIZJ, LJFF);
            c13o.LIZJ = LJI;
            long j2 = anonymousClass119.LIZ;
            int i2 = (c13o.LIZIZ + 1) % 20;
            c13o.LIZIZ = i2;
            c13o.LIZ[i2] = new C13K(LJI, j2);
        }
        long LJI2 = C10370av.LJI(c13o.LIZJ, C10370av.LJFF(event.LIZJ, j));
        c13o.LIZJ = LJI2;
        long j3 = event.LIZIZ;
        int i3 = (c13o.LIZIZ + 1) % 20;
        c13o.LIZIZ = i3;
        c13o.LIZ[i3] = new C13K(LJI2, j3);
    }

    public static void LJII(Object obj, StringBuilder sb) {
        int lastIndexOf;
        if (obj == null) {
            sb.append("null");
            return;
        }
        String LJLLJ = C16880lQ.LJLLJ(obj.getClass());
        if (LJLLJ.length() <= 0 && (lastIndexOf = (LJLLJ = obj.getClass().getName()).lastIndexOf(46)) > 0) {
            LJLLJ = LJLLJ.substring(lastIndexOf + 1);
        }
        sb.append(LJLLJ);
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(obj)));
    }

    public static final long LJIIJJI(int i, long j) {
        int i2 = (int) (j >> 32);
        int LJIIL = C78842Uww.LJIIL(i2, 0, i);
        int LJIIL2 = C78842Uww.LJIIL(C08350Ul.LIZJ(j), 0, i);
        if (LJIIL != i2 || LJIIL2 != C08350Ul.LIZJ(j)) {
            return LIZLLL(LJIIL, LJIIL2);
        }
        return j;
    }

    public static final void LJIIZILJ(ArrayList arrayList, InterfaceC88472Yns interfaceC88472Yns) {
        o.LJIIIZ(arrayList, "<this>");
        Iterator it = arrayList.iterator();
        while (it.hasNext() && !((Boolean) interfaceC88472Yns.invoke(it.next())).booleanValue()) {
        }
    }

    public static C30897CAr LJIJI(C60354NmQ c60354NmQ, Object obj) {
        c60354NmQ.getClass();
        return c60354NmQ.LIZ.remove(obj);
    }

    public static final String LJIJJ(Context context, String str) {
        try {
            if (C39477FeT.LIZLLL == null) {
                synchronized (C39477FeT.class) {
                    if (C39477FeT.LIZLLL == null) {
                        C39477FeT.LIZLLL = new C39477FeT(context);
                    }
                }
            }
            C39477FeT c39477FeT = C39477FeT.LIZLLL;
            if (c39477FeT != null) {
                return c39477FeT.LIZ(str);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final View LJJIIZ(int i, ViewGroup viewGroup) {
        o.LJIIIZ(viewGroup, "<this>");
        viewGroup.removeAllViews();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(viewGroup.getContext()), i, viewGroup, false);
        viewGroup.addView(LLLLIILL);
        o.LJII(LLLLIILL, "null cannot be cast to non-null type T of com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.base.ChatAssemUtilitiesKt.inflateContent");
        return LLLLIILL;
    }

    public static final boolean LJJIJIIJI(IX7 ix7, IX4 prepareData) {
        String str;
        o.LJIIIZ(prepareData, "prepareData");
        if (ix7 == null || ix7.LJIIIZ || ix7.LJIIIIZZ) {
            return false;
        }
        String str2 = null;
        if (IZ8.LJJIL().getSourceEqualAccuracy() && ((ix7 == null || ix7.LIZ == null) && prepareData.LJIIIZ == null)) {
            if (ix7 == null) {
                str = null;
            } else {
                str = ix7.LIZIZ;
            }
            if (o.LJ(str, prepareData.LJJIIJ)) {
                return true;
            }
        }
        if (ix7 != null) {
            str2 = ix7.LIZ;
        }
        return TextUtils.equals(str2, prepareData.LJIIIZ);
    }

    public static final C37971eL LJJJI(List list, List list2) {
        float f;
        float f2;
        float LIZ;
        ArrayList arrayList = (ArrayList) list;
        if (arrayList.size() == ((ArrayList) list2).size()) {
            if (!arrayList.isEmpty()) {
                int size = 2 >= arrayList.size() ? arrayList.size() - 1 : 2;
                ArrayList arrayList2 = new ArrayList(3);
                int i = 0;
                while (true) {
                    f = 0.0f;
                    if (i >= 3) {
                        break;
                    }
                    arrayList2.add(Float.valueOf(0.0f));
                    i++;
                }
                int size2 = arrayList.size();
                int i2 = size + 1;
                C48292IxM c48292IxM = new C48292IxM(i2, size2);
                int i3 = 0;
                while (true) {
                    f2 = 1.0f;
                    if (i3 >= size2) {
                        break;
                    }
                    c48292IxM.LJI(1.0f, 0, i3);
                    for (int i4 = 1; i4 < i2; i4++) {
                        c48292IxM.LJI(((Number) ListProtector.get(list, i3)).floatValue() * c48292IxM.LIZIZ(i4 - 1, i3), i4, i3);
                    }
                    i3++;
                }
                C48292IxM c48292IxM2 = new C48292IxM(i2, size2);
                C48292IxM c48292IxM3 = new C48292IxM(i2, i2);
                for (int i5 = 0; i5 < i2; i5++) {
                    for (int i6 = 0; i6 < size2; i6++) {
                        c48292IxM2.LJI(c48292IxM.LIZIZ(i5, i6), i5, i6);
                    }
                    for (int i7 = 0; i7 < i5; i7++) {
                        float LIZ2 = c48292IxM2.LIZLLL(i5).LIZ(c48292IxM2.LIZLLL(i7));
                        for (int i8 = 0; i8 < size2; i8++) {
                            c48292IxM2.LJI(c48292IxM2.LIZIZ(i5, i8) - (c48292IxM2.LIZIZ(i7, i8) * LIZ2), i5, i8);
                        }
                    }
                    C13L LIZLLL = c48292IxM2.LIZLLL(i5);
                    float sqrt = (float) Math.sqrt(LIZLLL.LIZ(LIZLLL));
                    if (sqrt >= 1.0E-6d) {
                        float f3 = 1.0f / sqrt;
                        for (int i9 = 0; i9 < size2; i9++) {
                            c48292IxM2.LJI(c48292IxM2.LIZIZ(i5, i9) * f3, i5, i9);
                        }
                        for (int i10 = 0; i10 < i2; i10++) {
                            if (i10 < i5) {
                                LIZ = 0.0f;
                            } else {
                                LIZ = c48292IxM2.LIZLLL(i5).LIZ(c48292IxM.LIZLLL(i10));
                            }
                            c48292IxM3.LJI(LIZ, i5, i10);
                        }
                    } else {
                        throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
                    }
                }
                C13L c13l = new C13L(size2);
                for (int i11 = 0; i11 < size2; i11++) {
                    c13l.LIZIZ[i11] = Float.valueOf(((Number) ListProtector.get(list2, i11)).floatValue() * 1.0f);
                }
                int i12 = i2 - 1;
                for (int i13 = i12; -1 < i13; i13--) {
                    ListProtector.set(arrayList2, i13, Float.valueOf(c48292IxM2.LIZLLL(i13).LIZ(c13l)));
                    int i14 = i13 + 1;
                    if (i14 <= i12) {
                        int i15 = i12;
                        while (true) {
                            ListProtector.set(arrayList2, i13, Float.valueOf(((Number) ListProtector.get(arrayList2, i13)).floatValue() - (((Number) ListProtector.get(arrayList2, i15)).floatValue() * c48292IxM3.LIZIZ(i13, i15))));
                            if (i15 != i14) {
                                i15--;
                            }
                        }
                    }
                    ListProtector.set(arrayList2, i13, Float.valueOf(((Number) ListProtector.get(arrayList2, i13)).floatValue() / c48292IxM3.LIZIZ(i13, i13)));
                }
                float f4 = 0.0f;
                for (int i16 = 0; i16 < size2; i16++) {
                    f4 += ((Number) ListProtector.get(list2, i16)).floatValue();
                }
                float f5 = f4 / size2;
                float f6 = 0.0f;
                for (int i17 = 0; i17 < size2; i17++) {
                    float floatValue = ((Number) ListProtector.get(list2, i17)).floatValue() - ((Number) ListProtector.get(arrayList2, 0)).floatValue();
                    float f7 = 1.0f;
                    for (int i18 = 1; i18 < i2; i18++) {
                        f7 *= ((Number) ListProtector.get(list, i17)).floatValue();
                        floatValue -= ((Number) ListProtector.get(arrayList2, i18)).floatValue() * f7;
                    }
                    f6 += floatValue * 1.0f * floatValue;
                    float floatValue2 = ((Number) ListProtector.get(list2, i17)).floatValue() - f5;
                    f += floatValue2 * 1.0f * floatValue2;
                }
                if (f > 1.0E-6f) {
                    f2 = 1.0f - (f6 / f);
                }
                return new C37971eL(arrayList2, f2);
            }
            throw new IllegalArgumentException("At least one point must be provided");
        }
        throw new IllegalArgumentException("x and y must be the same length");
    }

    public static final String LJJJIL(CreativeInfo creativeInfo, boolean z) {
        String str;
        boolean z2;
        String LJJIIZ = C60903NvH.LJIIJJI().LJJIJL().getPathAdapter().LJJIIZ(creativeInfo);
        boolean z3 = false;
        C44687HgJ.LJFF(LJJIIZ, false);
        if (z) {
            str = "av_ic_water_mark_9_16.png";
        } else {
            str = "av_ic_water_mark_16_9.png";
        }
        Application application = C44172HVg.LIZ;
        File file = new File(LJJIIZ);
        if (file.exists() || file.mkdirs()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(file.getAbsoluteFile());
            LIZ.append("/");
            LIZ.append(str);
            File file2 = new File(X1D.LIZIZ(LIZ));
            if (file2.exists()) {
                return file2.getAbsolutePath();
            }
            AssetManager assets = application.getAssets();
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                try {
                    InputStream open = assets.open(str);
                    byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
                    while (true) {
                        try {
                            try {
                                int read = open.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            } catch (Exception e) {
                                C16880lQ.LLLLIIL(e);
                                C1DH.LJII(open);
                                C1DH.LJII(fileOutputStream);
                                z2 = false;
                            }
                        } catch (Throwable th) {
                            C1DH.LJII(open);
                            C1DH.LJII(fileOutputStream);
                            throw th;
                        }
                    }
                    fileOutputStream.flush();
                    C1DH.LJII(open);
                    C1DH.LJII(fileOutputStream);
                    z2 = true;
                    fileOutputStream.close();
                    z3 = z2;
                } finally {
                }
            } catch (IOException e2) {
                C16880lQ.LLLLIIL(e2);
            }
            if (z3) {
                return file2.getAbsolutePath();
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Type inference failed for: r2v1, types: [X.B8D, O] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJJJZI(com.bytedance.android.livesdkapi.session.EnterRoomConfig r2, int r3) {
        /*
            java.lang.String r0 = "config"
            kotlin.jvm.internal.o.LJIIIZ(r2, r0)
            if (r3 != 0) goto L3d
            boolean r0 = LJJIJ(r2)
            if (r0 != 0) goto L3d
            X.BKc r1 = X.C28594BKc.LIZJ()
            boolean r0 = r1.LIZ
            if (r0 == 0) goto L19
            X.BKd r0 = r1.LIZIZ
            if (r0 != 0) goto L3a
        L19:
            r3 = -1
        L1a:
            r0 = 0
        L1b:
            X.B8D r2 = new X.B8D
            r2.<init>(r3, r0)
            com.bytedance.ies.sdk.datachannel.DataChannelGlobal r1 = com.bytedance.ies.sdk.datachannel.DataChannelGlobal.LJLJJI
            java.lang.Class<X.Baf> r0 = X.C29049Baf.class
            java.lang.Object r0 = r1.mv0(r0)
            X.B6s r0 = (X.C28246B6s) r0
            if (r0 != 0) goto L37
        L2c:
            java.lang.Class<X.Bal> r0 = X.C29055Bal.class
            X.Cps r0 = r1.gv0(r0)
            X.Cpp r0 = (X.C32537Cpp) r0
            r0.LIZ = r2
            return
        L37:
            r0.LJI = r2
            goto L2c
        L3a:
            int r3 = r0.LJ
            goto L1a
        L3d:
            if (r3 == 0) goto L1a
            boolean r0 = LJJIJ(r2)
            if (r0 == 0) goto L46
            goto L1a
        L46:
            r0 = 1
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C17N.LJJJJZI(com.bytedance.android.livesdkapi.session.EnterRoomConfig, int):void");
    }

    public static final boolean LJIILLIIL(char c, char c2, boolean z) {
        if (c == c2) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c);
        char upperCase2 = Character.toUpperCase(c2);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static Class LJJIIJ(Object obj, Class cls, int i) {
        ParameterizedType parameterizedType;
        if (i < 0 || !cls.isInstance(obj)) {
            return null;
        }
        try {
            Type[] genericInterfaces = obj.getClass().getGenericInterfaces();
            int length = genericInterfaces.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    Type type = genericInterfaces[i2];
                    if ((type instanceof ParameterizedType) && ((ParameterizedType) type).getRawType() == cls) {
                        parameterizedType = (ParameterizedType) type;
                        break;
                    }
                    i2++;
                } else {
                    parameterizedType = null;
                    break;
                }
            }
            if (parameterizedType == null) {
                Type genericSuperclass = obj.getClass().getGenericSuperclass();
                if ((genericSuperclass instanceof ParameterizedType) && ((ParameterizedType) genericSuperclass).getRawType() == cls) {
                    parameterizedType = (ParameterizedType) genericSuperclass;
                }
            }
        } catch (Throwable unused) {
        }
        if (parameterizedType == null) {
            return null;
        }
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        if (i < actualTypeArguments.length) {
            return (Class) actualTypeArguments[i];
        }
        return null;
    }

    public static void LJJIL(InterfaceC116954iR interfaceC116954iR, AtomicInteger atomicInteger, C73568Su4 c73568Su4) {
        if (atomicInteger.getAndIncrement() == 0) {
            Throwable terminate = c73568Su4.terminate();
            if (terminate != null) {
                interfaceC116954iR.onError(terminate);
            } else {
                interfaceC116954iR.onComplete();
            }
        }
    }

    public static void LJJJJ(Bundle bundle, String str, List list) {
        UrlModel cover;
        ImageInfo imageInfo;
        UrlModel labelThumb;
        o.LJIIIZ(bundle, "<this>");
        int i = 0;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (aweme.getAwemeType() == 2) {
                List<ImageInfo> imageInfos = aweme.getImageInfos();
                if (imageInfos != null && (imageInfo = (ImageInfo) ORZ.LJLLLL(imageInfos)) != null && (labelThumb = imageInfo.getLabelThumb()) != null) {
                    arrayList.add(labelThumb);
                }
            } else {
                Video video = aweme.getVideo();
                if (video != null && (cover = video.getCover()) != null) {
                    arrayList.add(cover);
                }
            }
            i++;
            if (i >= 3) {
                break;
            }
        }
        if (arrayList.size() < 3) {
            return;
        }
        bundle.putString(str, JsonParseUtils.LIZLLL(arrayList));
    }

    public static final void LJJJJZ(SmartImageView smartImageView, float[] fArr, Integer num) {
        o.LJIIIZ(smartImageView, "<this>");
        if (!smartImageView.hasHierarchy()) {
            smartImageView.setHierarchy(new C79077V1t(smartImageView.getResources()).LIZ());
        }
        V92 hierarchy = smartImageView.getHierarchy();
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        V8L v8l = new V8L();
        v8l.LJ(f, f2, f3, f4);
        hierarchy.LJIL(v8l);
        if (num != null) {
            V92 hierarchy2 = smartImageView.getHierarchy();
            V8L v8l2 = smartImageView.getHierarchy().LIZJ;
            if (v8l2 != null) {
                v8l2.LIZ = V8K.BITMAP_ONLY;
                v8l2.LJI(num.intValue());
            } else {
                v8l2 = null;
            }
            hierarchy2.LJIL(v8l2);
        }
    }

    public static final boolean LJIIIZ(InterfaceC62486Ofi interfaceC62486Ofi, Context context, Aweme aweme, String eventType) {
        o.LJIIIZ(interfaceC62486Ofi, "<this>");
        o.LJIIIZ(context, "context");
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(eventType, "eventType");
        if (C63081OpJ.LJJLIIIJLJLI(aweme)) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", eventType);
            c188727au.LJIIIZ("group_id", aweme.getAid());
            c188727au.LJIIIZ("author_id", aweme.getAuthorUid());
            FMX.LJIIL("dou_promote_layer_show", c188727au.LIZ);
            C5S1 c5s1 = new C5S1(context);
            c5s1.LIZJ(R.string.b96);
            c5s1.LJ();
            return false;
        }
        return true;
    }

    public static void LJJIZ(InterfaceC116954iR interfaceC116954iR, Throwable th, AtomicInteger atomicInteger, C73568Su4 c73568Su4) {
        if (c73568Su4.addThrowable(th)) {
            if (atomicInteger.getAndIncrement() == 0) {
                interfaceC116954iR.onError(c73568Su4.terminate());
                return;
            }
            return;
        }
        C73548Stk.LIZIZ(th);
    }

    public static void LJJJ(InterfaceC116954iR interfaceC116954iR, Object obj, AtomicInteger atomicInteger, C73568Su4 c73568Su4) {
        if (atomicInteger.get() == 0 && atomicInteger.compareAndSet(0, 1)) {
            interfaceC116954iR.onNext(obj);
            if (atomicInteger.decrementAndGet() != 0) {
                Throwable terminate = c73568Su4.terminate();
                if (terminate != null) {
                    interfaceC116954iR.onError(terminate);
                } else {
                    interfaceC116954iR.onComplete();
                }
            }
        }
    }

    public static InterfaceC07790Sh LJJJLIIL(InterfaceC07790Sh shadow, float f, InterfaceC11790dD interfaceC11790dD, long j, long j2, int i) {
        boolean z;
        long j3 = j2;
        InterfaceC11790dD shape = interfaceC11790dD;
        long j4 = j;
        if ((i & 2) != 0) {
            shape = C11710d5.LIZ;
        }
        if ((i & 4) != 0 && Float.compare(f, 0) > 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 8) != 0) {
            j4 = C12010dZ.LIZ;
        }
        if ((i & 16) != 0) {
            j3 = C12010dZ.LIZ;
        }
        o.LJIIIZ(shadow, "$this$shadow");
        o.LJIIIZ(shape, "shape");
        if (Float.compare(f, 0) > 0 || z) {
            return g1.LIZ(shadow, C78847Ux1.LJJIIZ(InterfaceC07790Sh.LJJJI, new C50561ye(f, shape, z, j4, j3)));
        }
        return shadow;
    }
}
