package X;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.g1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.qna.services.QnaService;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoSegmentRecordData;
import com.ss.android.ugc.aweme.shortvideo.edit.multiedit.data.MultiEditVideoStatusRecordData;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.UzT, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C78999UzT implements F22, InterfaceC58234MtK, InterfaceC69003R6h, InterfaceC79002UzW, InterfaceC78692UuW {
    public static Context LJLIL;

    @Override // X.InterfaceC58234MtK
    public void LIZIZ() {
    }

    @Override // X.InterfaceC69003R6h
    public void LIZJ() {
    }

    @Override // X.F22
    public String getName() {
        return "viewDisappeared";
    }

    @Override // X.F22
    public /* bridge */ /* synthetic */ Object getParams() {
        return null;
    }

    public static final ArrayList LJIIJ(String str) {
        if (str == null || str.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : s.LJLJJL(str, new String[]{","}, 0, 6)) {
            if (!arrayList.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static String LJIILJJIL(Iterable iterable) {
        if (iterable == null) {
            return null;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            T2R.LJIILJJIL("individual scopes cannot be null or empty", !TextUtils.isEmpty(str));
            linkedHashSet.add(str);
        }
        if (linkedHashSet.isEmpty()) {
            return null;
        }
        return TextUtils.join(" ", linkedHashSet);
    }

    public static final OSZ LJIILL(Context context) {
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 125.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 109.0f);
        Float valueOf = Float.valueOf(8.0f);
        Float valueOf2 = Float.valueOf(16.0f);
        return LJIIJJI(context, 93.0f, 93.0f, LIZIZ, LIZIZ2, valueOf2, valueOf, valueOf2, valueOf);
    }

    public static final OSZ LJIILLIIL(Context context) {
        int LIZIZ = (int) C74275TDb.LIZIZ(context, 86.0f);
        int LIZIZ2 = (int) C74275TDb.LIZIZ(context, 86.0f);
        Float valueOf = Float.valueOf(3.0f);
        return LJIIJJI(context, 80.0f, 80.0f, LIZIZ, LIZIZ2, valueOf, valueOf, valueOf, valueOf);
    }

    public static final boolean LJIIZILJ(VideoItemParams videoItemParams) {
        if (QnaService.LIZ().enablePublicQna() && QnaService.LIZ().isQnaAugmentationFYPBannerEnabled() && videoItemParams.getAweme().isQnaResponseAweme() && videoItemParams.mPageType == 0) {
            return true;
        }
        return false;
    }

    public static String LJIJ(String str) {
        int i;
        if (str == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String LJJII = LJJII(str);
        int length = LJJII.length();
        int i2 = 0;
        while (i2 < length) {
            char charAt = LJJII.charAt(i2);
            if (charAt == '*') {
                sb.append("%2A");
            } else if (charAt == '+') {
                sb.append("%20");
            } else if (charAt == '%' && (i = i2 + 2) < length && LJJII.charAt(i2 + 1) == '7' && LJJII.charAt(i) == 'E') {
                sb.append('~');
                i2 = i;
            } else {
                sb.append(charAt);
            }
            i2++;
        }
        return sb.toString();
    }

    public static final C43068GvI LJIJI(MultiEditVideoStatusRecordData multiEditVideoStatusRecordData) {
        C43068GvI c43068GvI = new C43068GvI(C60272Yd.LJLIL);
        MultiEditVideoRecordData multiEditVideoRecordData = multiEditVideoStatusRecordData.curMultiEditVideoRecordData;
        if (multiEditVideoRecordData != null) {
            c43068GvI.addAll(LJIJJ(multiEditVideoRecordData));
        }
        MultiEditVideoRecordData multiEditVideoRecordData2 = multiEditVideoStatusRecordData.originMultiEditRecordData;
        if (multiEditVideoRecordData2 != null) {
            c43068GvI.addAll(LJIJJ(multiEditVideoRecordData2));
        }
        MultiEditVideoRecordData multiEditVideoRecordData3 = multiEditVideoStatusRecordData.singleRestoreMultiEditRecordData;
        if (multiEditVideoRecordData3 != null) {
            c43068GvI.addAll(LJIJJ(multiEditVideoRecordData3));
        }
        MultiEditVideoRecordData multiEditVideoRecordData4 = multiEditVideoStatusRecordData.restoreMultiEditVideoRecordData;
        if (multiEditVideoRecordData4 != null) {
            c43068GvI.addAll(LJIJJ(multiEditVideoRecordData4));
        }
        return c43068GvI;
    }

    public static final java.util.Set LJIJJ(MultiEditVideoRecordData multiEditVideoRecordData) {
        String str;
        HashSet hashSet = new HashSet();
        List<MultiEditVideoSegmentRecordData> list = multiEditVideoRecordData.segmentDataList;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (MultiEditVideoSegmentRecordData multiEditVideoSegmentRecordData : list) {
                String str2 = multiEditVideoSegmentRecordData.videoPath;
                if (str2 != null && str2.length() != 0) {
                    arrayList.add(multiEditVideoSegmentRecordData);
                }
            }
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((MultiEditVideoSegmentRecordData) it.next()).videoPath);
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                StringBuilder LIZ = X1D.LIZ();
                String parent = new File(str3).getParent();
                if (parent != null) {
                    str = C78966Uyw.LJIJJLI(parent);
                } else {
                    str = null;
                }
                LIZ.append(str);
                LIZ.append("data.txt");
                hashSet.add(X1D.LIZIZ(LIZ));
            }
        }
        return hashSet;
    }

    public static void LJIL(Class cls) {
        String name = cls.getName();
        C73548Stk.LIZIZ(new C73392SrE(UPJ.LIZIZ("It is not allowed to subscribe with a(n) ", name, " multiple times. Please create a fresh instance of ", name, " and subscribe that to the target source instead.")));
    }

    public static String LJJIFFI(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public static String LJJII(String str) {
        if (str == null) {
            return "";
        }
        try {
            return URLEncoder.encode(str, "UTF8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    @Override // X.InterfaceC79002UzW
    public WUW LIZLLL(C79001UzV c79001UzV) {
        return new C82380WUu(c79001UzV.LIZIZ, c79001UzV.LIZ, c79001UzV.LIZJ, c79001UzV.LIZLLL, c79001UzV.LJ, c79001UzV.LJFF, c79001UzV.LJI, c79001UzV.LJII, c79001UzV.LJIIIIZZ, c79001UzV.LJIIIZ, c79001UzV.LJIIJ, c79001UzV.LJIIJJI, c79001UzV.LJIIL, c79001UzV.LJIILIIL, c79001UzV.LJIILJJIL, c79001UzV.LJIILL, c79001UzV.LJIILLIIL);
    }

    public static final void LJFF(InterfaceC92693kP receiver, C73318Sq2 compositeDisposable) {
        o.LJIIJ(receiver, "$receiver");
        o.LJIIJ(compositeDisposable, "compositeDisposable");
        compositeDisposable.LIZ(receiver);
    }

    public static final void LJIIIZ(RecyclerView recyclerView, InterfaceC88472Yns block) {
        o.LJIIIZ(block, "block");
        if (recyclerView == null) {
            return;
        }
        Rect rect = new Rect();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            int LJJJJIZL = RecyclerView.LJJJJIZL(childAt);
            if (LJJJJIZL != -1) {
                boolean localVisibleRect = childAt.getLocalVisibleRect(rect);
                int width = rect.width() * rect.height();
                int height = childAt.getHeight() * childAt.getWidth();
                if (localVisibleRect && width >= height * 0.3f && linkedHashSet.add(Integer.valueOf(LJJJJIZL))) {
                    block.invoke(childAt);
                }
            }
        }
    }

    public static TreeMap LJIILIIL(String str, boolean z) {
        TreeMap treeMap = new TreeMap();
        if (str == null) {
            return treeMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=");
            if (split.length == 2) {
                if (z) {
                    treeMap.put(LJJIFFI(split[0]), LJJIFFI(split[1]));
                } else {
                    treeMap.put(split[0], split[1]);
                }
            } else if (!TextUtils.isEmpty(split[0])) {
                if (z) {
                    treeMap.put(LJJIFFI(split[0]), "");
                } else {
                    treeMap.put(split[0], "");
                }
            }
        }
        return treeMap;
    }

    public static final long LJJI(float f, long j) {
        return C78897Uxp.LJI(Math.max(0.0f, C10340as.LIZIZ(j) - f), Math.max(0.0f, C10340as.LIZJ(j) - f));
    }

    @Override // X.InterfaceC78692UuW
    public Fragment LIZ(ActivityC45651qj activityC45651qj, View view) {
        o.LJIIIZ(view, "view");
        View findViewById = activityC45651qj.findViewById(R.id.content);
        if (findViewById == null) {
            return null;
        }
        FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
        o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
        return LJIIL(supportFragmentManager, view, findViewById);
    }

    @Override // X.InterfaceC58234MtK
    public void LJ(String str, HashMap hashMap) {
        GXR.LIZ(str, hashMap);
    }

    public static final InterfaceC07790Sh LJI(InterfaceC07790Sh interfaceC07790Sh, C0SX border, InterfaceC11790dD shape) {
        o.LJIIIZ(interfaceC07790Sh, "<this>");
        o.LJIIIZ(border, "border");
        o.LJIIIZ(shape, "shape");
        return LJII(border.LIZ, interfaceC07790Sh, border.LIZIZ, shape);
    }

    public static boolean LJIIIIZZ(View view, View view2, View view3) {
        if (o.LJ(view2, view)) {
            return true;
        }
        if (o.LJ(view2, view3)) {
            return false;
        }
        Object parent = view2.getParent();
        if (!(parent instanceof View)) {
            return false;
        }
        return LJIIIIZZ(view, (View) parent, view3);
    }

    public static Fragment LJIIL(FragmentManager fragmentManager, View view, View view2) {
        Object LIZ;
        try {
            LIZ = fragmentManager.LJJJJLI();
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = null;
        }
        List list = (List) LIZ;
        if (list != null) {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                for (Fragment fragment : ORZ.LLIILII(list)) {
                    View view3 = fragment.getView();
                    if (view3 != null) {
                        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                        o.LJIIIIZZ(childFragmentManager, "fragment.childFragmentManager");
                        Fragment LJIIL = LJIIL(childFragmentManager, view, view3);
                        if (LJIIL != null) {
                            return LJIIL;
                        }
                        if (LJIIIIZZ(view3, view, view2)) {
                            return fragment;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final C43068GvI LJIJJLI(Object obj, Class cls, Class cls2) {
        C43068GvI c43068GvI = new C43068GvI(C60302Yg.LJLIL);
        try {
            C42083GfP.LIZ(cls, cls2).LIZIZ(obj, new GPW(c43068GvI));
        } catch (Exception unused) {
        }
        return c43068GvI;
    }

    public static void LJJ(AtomicReference atomicReference, InterfaceC92693kP interfaceC92693kP, Class cls) {
        C73320Sq4.LIZ(interfaceC92693kP, "next is null");
        while (!atomicReference.compareAndSet(null, interfaceC92693kP)) {
            if (atomicReference.get() != null) {
                interfaceC92693kP.dispose();
                if (atomicReference.get() == EnumC73418Sre.DISPOSED) {
                    return;
                }
                LJIL(cls);
                return;
            }
        }
    }

    public static final InterfaceC07790Sh LJII(float f, InterfaceC07790Sh border, AbstractC11740d8 brush, InterfaceC11790dD shape) {
        o.LJIIIZ(border, "$this$border");
        o.LJIIIZ(brush, "brush");
        o.LJIIIZ(shape, "shape");
        return C07770Sf.LIZ(border, g1.LIZ, new C49131wL(f, brush, shape));
    }

    public static final OSZ LJIIJJI(Context context, float f, float f2, int i, int i2, Float f3, Float f4, Float f5, Float f6) {
        C74461TKf c74461TKf = new C74461TKf(context);
        c74461TKf.LIZLLL = (int) C74275TDb.LIZIZ(context, f);
        c74461TKf.LJ = (int) C74275TDb.LIZIZ(context, f2);
        c74461TKf.LJIIIIZZ = false;
        c74461TKf.LJIJ = false;
        c74461TKf.LJII = com.zhiliaoapp.musically.R.drawable.blc;
        View LIZIZ = c74461TKf.LIZIZ();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        LIZIZ.setLayoutParams(layoutParams);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(i, i2));
        AqS170S0100000_4 aqS170S0100000_4 = new AqS170S0100000_4(context, 859);
        frameLayout.setPadding(((Number) aqS170S0100000_4.invoke(f3)).intValue(), ((Number) aqS170S0100000_4.invoke(f4)).intValue(), ((Number) aqS170S0100000_4.invoke(f5)).intValue(), ((Number) aqS170S0100000_4.invoke(f6)).intValue());
        frameLayout.addView(LIZIZ);
        return new OSZ(frameLayout, LIZIZ);
    }
}
