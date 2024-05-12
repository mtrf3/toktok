package X;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.message.linker.listchangemessage.LinkListUser;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.creative.CreativeInfo;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.initializer.AVServiceProxyImpl;
import com.ss.android.ugc.aweme.music.model.MusicDetail;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.library.LibraryMaterialInfoSv;
import com.ss.android.ugc.aweme.shortvideo.model.AVETParameter;
import com.ss.android.ugc.aweme.shortvideo.ui.TimeSpeedModelExtension;
import com.zhiliaoapp.musically.R;
import defpackage.i0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.UGr, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76917UGr implements InterfaceC57325Mef, InterfaceC153055zZ {
    public static boolean LJLIL;

    public static final InterfaceC44316HaK LJIJ() {
        AVServiceProxyImpl.createIAVServiceProxybyMonsterPlugin(false).getStoryService();
        if (C43119Gw7.LIZ() || C41669GWz.LIZ()) {
            return new C45980I2u();
        }
        return new C45981I2v();
    }

    @Override // X.InterfaceC153055zZ
    public Object a() {
        return new C40648FxM();
    }

    public static final TZX LJJ() {
        if (TV3.LIZJ()) {
            InterfaceC31805Ce1 interfaceC31805Ce1 = (InterfaceC31805Ce1) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
            if (interfaceC31805Ce1 != null) {
                return interfaceC31805Ce1.LIZ();
            }
        } else if (C74789TWv.LIZIZ()) {
            InterfaceC74853TZh interfaceC74853TZh = (InterfaceC74853TZh) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_MODERATOR_USER_MANAGER");
            if (interfaceC74853TZh != null) {
                return interfaceC74853TZh.LIZ();
            }
        } else {
            TQ8 tq8 = (TQ8) C75559Tl5.LIZIZ.LIZIZ("MULTI_GUEST_V3_GUEST_USER_MANAGER");
            if (tq8 != null) {
                return tq8.LIZ();
            }
        }
        return null;
    }

    public static void LJ(boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void LJIILL(boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException();
        }
    }

    public static final void LJIILLIIL(T5T t5t) {
        o.LJIIIZ(t5t, "<this>");
        if (t5t.isFocused()) {
            t5t.clearFocus();
        }
    }

    public static final void LJIJJ(T5T t5t) {
        C188807b2 c188807b2 = new InputFilter() { // from class: X.7b2
            @Override // android.text.InputFilter
            public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                return ujb.o.LJJJJZ(charSequence.toString(), "\n", "", false);
            }
        };
        InputFilter[] oldFilters = t5t.getFilters();
        o.LJIIIIZZ(oldFilters, "oldFilters");
        t5t.setFilters((InputFilter[]) C61898ORa.LJJII(c188807b2, oldFilters));
    }

    public static void LJIJJLI(String str) {
        InterfaceC65419Plv interfaceC65419Plv = C65415Plr.LJ;
        C16880lQ.LLLZ("%s %s", new Object[]{"ConfItem", str});
        interfaceC65419Plv.LJI();
    }

    public static final String LJJI(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        LibraryMaterialInfoSv libraryMaterialInfoSv = (LibraryMaterialInfoSv) timeSpeedModelExtension.getFromRecordExtras("extra_key_library_material");
        if (libraryMaterialInfoSv != null) {
            return libraryMaterialInfoSv.getId();
        }
        return null;
    }

    public static final String LJJII(InterfaceC45930I0w interfaceC45930I0w) {
        if (interfaceC45930I0w == null) {
            return "";
        }
        if (TextUtils.isEmpty(interfaceC45930I0w.getUniqueId())) {
            return interfaceC45930I0w.getShortId();
        }
        return interfaceC45930I0w.getUniqueId();
    }

    public static final int LJJIII(TZX tzx) {
        o.LJIIIZ(tzx, "<this>");
        return tzx.LIZ().size() - 1;
    }

    public static final boolean LJJIJ(P1U p1u) {
        o.LJIIIZ(p1u, "<this>");
        if (p1u.LJIIIZ && !p1u.LJIIIIZZ) {
            return true;
        }
        return false;
    }

    public static final String LJJIJIIJI(LibraryMaterialInfoSv libraryMaterialInfoSv) {
        Integer materialProvider;
        if (libraryMaterialInfoSv != null && (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) != null) {
            if (materialProvider.intValue() == 1) {
                return "giphy";
            }
            if (materialProvider.intValue() == 2) {
                return "toptiktok";
            }
            if (materialProvider.intValue() == 3) {
                return "gallery";
            }
        }
        return "unknown";
    }

    public static final boolean LJJJI(TimeSpeedModelExtension timeSpeedModelExtension) {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        Integer materialType;
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        if (timeSpeedModelExtension.getRecordExtras().isEmpty() || timeSpeedModelExtension.getFromRecordExtras("extra_key_library_material") == null || (libraryMaterialInfoSv = (LibraryMaterialInfoSv) timeSpeedModelExtension.getFromRecordExtras("extra_key_library_material")) == null || (materialType = libraryMaterialInfoSv.getMaterialType()) == null || materialType.intValue() != 3) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJIL(TimeSpeedModelExtension timeSpeedModelExtension) {
        LibraryMaterialInfoSv libraryMaterialInfoSv;
        Integer materialProvider;
        Integer materialType;
        if (timeSpeedModelExtension.getRecordExtras().isEmpty() || (libraryMaterialInfoSv = (LibraryMaterialInfoSv) timeSpeedModelExtension.getFromRecordExtras("extra_key_library_material")) == null || (materialProvider = libraryMaterialInfoSv.getMaterialProvider()) == null || materialProvider.intValue() != 3 || (materialType = libraryMaterialInfoSv.getMaterialType()) == null || materialType.intValue() != 1) {
            return false;
        }
        return true;
    }

    public static final boolean LJJJJ(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        if (!timeSpeedModelExtension.getRecordExtras().isEmpty() && timeSpeedModelExtension.getFromRecordExtras("extra_key_library_material") != null) {
            return true;
        }
        return false;
    }

    public static final boolean LJJJJI(TZX tzx) {
        o.LJIIIZ(tzx, "<this>");
        Iterator it = tzx.LIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            User user = ((LinkListUser) next).user;
            if (user != null && user.getId() == C025908h.LIZ()) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean LJJJJJ(TimeSpeedModelExtension timeSpeedModelExtension) {
        o.LJIIIZ(timeSpeedModelExtension, "<this>");
        return !LJJJJ(timeSpeedModelExtension);
    }

    public static final boolean LJJJJJL(IMUser iMUser) {
        o.LJIIIZ(iMUser, "<this>");
        C97353rv LJII = C96963rI.LJII();
        String uid = iMUser.getUid();
        LJII.getClass();
        return C97353rv.LJ(uid);
    }

    @Override // X.InterfaceC57325Mef
    public MusicDetail LJI(Object obj) {
        C57329Mej a = (C57329Mej) obj;
        o.LJIIIZ(a, "a");
        return a.LIZ;
    }

    @Override // X.InterfaceC57325Mef
    public Object LJIILIIL(Object obj) {
        MusicDetail b = (MusicDetail) obj;
        o.LJIIIZ(b, "b");
        return new C57329Mej(b);
    }

    public static void LIZJ(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void LJFF(int i, int i2) {
        String LJIL;
        if (i < 0 || i >= i2) {
            if (i >= 0) {
                if (i2 >= 0) {
                    LJIL = LJIL("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
                } else {
                    throw new IllegalArgumentException(KMP.LJ("negative size: ", i2));
                }
            } else {
                LJIL = LJIL("%s (%s) must not be negative", "index", Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(LJIL);
        }
    }

    public static void LJII(Object obj, Object obj2) {
        if (obj != null) {
        } else {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void LJIIIIZZ(int i, int i2) {
        if (i >= 0 && i <= i2) {
        } else {
            throw new IndexOutOfBoundsException(LIZ(i, i2, "index"));
        }
    }

    public static void LJIIL(Object obj, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static final C82219WOp LJIIZILJ(C82622Wbi diContainer, WMH parent) {
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(diContainer, "diContainer");
        AVETParameter LIZLLL = ((ShortVideoContext) diContainer.LJ(ShortVideoContext.class, null)).LIZLLL();
        o.LJIIIIZZ(LIZLLL, "diContainer.get(ShortVid…class.java).avetParameter");
        return new C82219WOp(parent, diContainer, new WSY(LIZLLL), new C55457Lpd(), DIH.LJLIL, C82696Wcu.LJLIL);
    }

    public static final SpannableString LJIJI(C252709vu c252709vu, String str) {
        int i;
        SpannableString spannableString = new SpannableString(i0.LJFF("  ", str));
        Context context = c252709vu.getContext();
        o.LJIIIIZZ(context, "context");
        SY9 sy9 = new SY9(context, R.raw.icon_shield_tick);
        int textSize = (int) ((TextView) c252709vu.findViewById(R.id.gx4)).getTextSize();
        sy9.setBounds(0, 0, textSize, textSize);
        Context context2 = c252709vu.getContext();
        o.LJIIIIZZ(context2, "context");
        Integer LJI = C79045V0n.LJI(R.attr.e9, context2);
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = -16711936;
        }
        sy9.LJ(i);
        spannableString.setSpan(new ImageSpan(sy9), 0, 1, 17);
        return spannableString;
    }

    public static String LJIL(String str, Object... objArr) {
        int indexOf;
        StringBuilder sb = new StringBuilder((objArr.length * 16) + str.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (indexOf = str.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(objArr[i]);
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final LinkListUser LJJIIJ(TZX tzx, long j) {
        Object obj;
        Iterator it = tzx.LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                User user = ((LinkListUser) obj).user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkListUser) obj;
    }

    public static final LinkPlayerInfo LJJIIJZLJL(TZX tzx, User user) {
        Object obj = null;
        if (user == null) {
            return null;
        }
        Iterator it = tzx.LIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((LinkPlayerInfo) next).mUser.getId() == user.getId()) {
                obj = next;
                break;
            }
        }
        return (LinkPlayerInfo) obj;
    }

    public static final LinkPlayerInfo LJJIIZ(TZX tzx, long j) {
        Object obj;
        Iterator it = tzx.LIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LinkPlayerInfo) obj).mUser.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkPlayerInfo) obj;
    }

    public static long LJJIIZI(Intent intent, String str) {
        Object LLJJIII;
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null || (LLJJIII = C16880lQ.LLJJIII(LLJJIJI, str)) == null) {
            return -1L;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastLongProtector.parseLong((String) LLJJIII);
            } catch (NumberFormatException unused) {
                return -1L;
            }
        }
        try {
            return ((Long) LLJJIII).longValue();
        } catch (ClassCastException unused2) {
            return -1L;
        }
    }

    public static final LinkPlayerInfo LJJIJIIJIL(TZX tzx, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Object obj = null;
        if (TextUtils.isEmpty(linkMicId)) {
            return null;
        }
        Iterator it = tzx.LIZIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (TextUtils.equals(((LinkPlayerInfo) next).mInteractIdStr, linkMicId)) {
                obj = next;
                break;
            }
        }
        return (LinkPlayerInfo) obj;
    }

    public static final LinkListUser LJJIJIL(TZX tzx, String linkMicId) {
        o.LJIIIZ(linkMicId, "linkMicId");
        Object obj = null;
        if (TextUtils.isEmpty(linkMicId)) {
            return null;
        }
        Iterator it = tzx.LIZIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (TextUtils.equals(((LinkListUser) next).linkMicId, linkMicId)) {
                obj = next;
                break;
            }
        }
        return (LinkListUser) obj;
    }

    public static final LinkPlayerInfo LJJIJL(TZX tzx, long j) {
        Object obj;
        o.LJIIIZ(tzx, "<this>");
        Iterator it = tzx.LIZIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((LinkPlayerInfo) obj).mUser.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkPlayerInfo) obj;
    }

    public static final LinkPlayerInfo LJJIJLIJ(TZX tzx, String str) {
        Object obj;
        Iterator it = tzx.LIZIZ().iterator();
        while (true) {
            obj = null;
            String str2 = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            User user = ((LinkPlayerInfo) next).mUser;
            if (user != null) {
                str2 = user.getIdStr();
            }
            if (TextUtils.equals(str, str2)) {
                obj = next;
                break;
            }
        }
        return (LinkPlayerInfo) obj;
    }

    public static final LinkListUser LJJIL(TZX tzx, long j) {
        Object obj;
        Iterator it = tzx.LIZIZ().iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                User user = ((LinkListUser) obj).user;
                if (user != null && user.getId() == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (LinkListUser) obj;
    }

    public static final Long LJJIZ(TZX tzx, String linkMicId) {
        User user;
        o.LJIIIZ(linkMicId, "linkMicId");
        LinkPlayerInfo LJJIJIIJIL = LJJIJIIJIL(tzx, linkMicId);
        if (LJJIJIIJIL != null && (user = LJJIJIIJIL.mUser) != null) {
            return Long.valueOf(user.getId());
        }
        return null;
    }

    public static final long LJJJ(TZX tzx, String linkMicId) {
        Object obj;
        User user;
        o.LJIIIZ(linkMicId, "linkMicId");
        if (!TextUtils.isEmpty(linkMicId)) {
            Iterator it = tzx.LIZIZ().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (TextUtils.equals(((LinkPlayerInfo) obj).mInteractIdStr, linkMicId)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            LinkPlayerInfo linkPlayerInfo = (LinkPlayerInfo) obj;
            if (linkPlayerInfo != null && (user = linkPlayerInfo.mUser) != null) {
                return user.getId();
            }
        }
        return 0L;
    }

    public static final boolean LJJJJIZL(TZX tzx, String interactId) {
        o.LJIIIZ(interactId, "interactId");
        Iterator it = tzx.LIZ().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (TextUtils.equals(interactId, ((LinkPlayerInfo) next).mInteractIdStr)) {
                if (next != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void LJJJJL(TZX tzx, long j) {
        o.LJIIIZ(tzx, "<this>");
        Iterator it = tzx.LIZIZ().iterator();
        while (it.hasNext()) {
            if (((LinkPlayerInfo) it.next()).mUser.getId() == j) {
                it.remove();
            }
        }
    }

    public static final void LJJJJLI(TuxTextView tuxTextView, String str) {
        if (str == null || ujb.o.LJJJJJL(str)) {
            str = "--";
        }
        tuxTextView.setText(str);
    }

    public static String LIZ(int i, int i2, String str) {
        if (i < 0) {
            return LJIL("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return LJIL("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(KMP.LJ("negative size: ", i2));
    }

    public static void LIZLLL(String str, boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalArgumentException(LJIL(str, obj));
        }
    }

    public static void LJIIIZ(int i, int i2, int i3) {
        String LIZ;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i >= 0 && i <= i3) {
                if (i2 < 0 || i2 > i3) {
                    LIZ = LIZ(i2, i3, "end index");
                } else {
                    LIZ = LJIL("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
                }
            } else {
                LIZ = LIZ(i, i3, "start index");
            }
            throw new IndexOutOfBoundsException(LIZ);
        }
    }

    public static void LJIIJ(int i, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(LJIL(str, Integer.valueOf(i)));
        }
    }

    public static void LJIIJJI(long j, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalStateException(LJIL(str, Long.valueOf(j)));
        }
    }

    public static void LJIILJJIL(String str, boolean z, Object obj) {
        if (z) {
        } else {
            throw new IllegalStateException(LJIL(str, obj));
        }
    }

    public static int LJJIFFI(int i, String str, Intent intent) {
        Bundle LLJJIJI = C16880lQ.LLJJIJI(intent);
        if (LLJJIJI == null) {
            return i;
        }
        Object LLJJIII = C16880lQ.LLJJIII(LLJJIJI, str);
        if (LLJJIII == null) {
            return i;
        }
        if (LLJJIII instanceof String) {
            try {
                return CastIntegerProtector.parseInt((String) LLJJIII);
            } catch (NumberFormatException unused) {
                return i;
            }
        }
        try {
            return ((Integer) LLJJIII).intValue();
        } catch (ClassCastException unused2) {
            return i;
        }
    }

    public static void LIZIZ(Object obj, Object obj2, String str, boolean z) {
        if (z) {
        } else {
            throw new IllegalArgumentException(LJIL(str, obj, obj2));
        }
    }

    public static final String[] LJJJJLL(CreativeInfo creativeInfo, int i, int i2, String text, String str) {
        o.LJIIIZ(creativeInfo, "creativeInfo");
        o.LJIIIZ(text, "text");
        String LIZ = C41326GJu.LIZ(creativeInfo);
        ArrayList arrayList = new ArrayList();
        File file = new File(LIZ);
        if (file.exists() && file.isDirectory()) {
            long length = file.length();
            for (long j = 0; j < length; j++) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str);
                LIZ2.append(j);
                LIZ2.append(".png");
                File file2 = new File(LIZ, X1D.LIZIZ(LIZ2));
                if (file2.exists()) {
                    String path = file2.getPath();
                    o.LJIIIIZZ(path, "bitmapFile.path");
                    arrayList.add(path);
                }
            }
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        if (strArr.length == 0) {
            ArrayList arrayList2 = new ArrayList();
            H72 h72 = new H72();
            if (i > 0 && i2 > 0 && !o.LJ("", text)) {
                Resources resources = C44172HVg.LIZ.getResources();
                o.LJIIIIZZ(resources, "application.getResources()");
                float f = i;
                float f2 = f / 375.0f;
                TextPaint textPaint = new TextPaint(1);
                textPaint.setAntiAlias(true);
                textPaint.setTextSize(14.0f * f2);
                textPaint.setTypeface(C8HI.LIZJ().LIZLLL("regular"));
                textPaint.setStyle(Paint.Style.FILL);
                textPaint.setColor(resources.getColor(R.color.be));
                Paint.FontMetrics fontMetrics = textPaint.getFontMetrics();
                o.LJIIIIZZ(fontMetrics, "textPaint.getFontMetrics()");
                float f3 = 2;
                int i3 = (int) ((fontMetrics.bottom - fontMetrics.top) * f3);
                if (f - textPaint.measureText(text) < 24 * f2 * f3) {
                    i3 = (int) (i3 * 1.5f);
                }
                h72.LIZ = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
                Bitmap bitmap = h72.LIZ;
                o.LJI(bitmap);
                Canvas canvas = new Canvas(bitmap);
                canvas.drawColor(0);
                StaticLayout staticLayout = new StaticLayout(text, textPaint, (int) (f - (48 * f2)), Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
                canvas.save();
                canvas.translate((i / 2) - (staticLayout.getWidth() / 2), 0.0f);
                staticLayout.draw(canvas);
                canvas.restore();
            }
            arrayList2.add(h72);
            return HN0.LIZIZ((H72[]) arrayList2.toArray(new H72[0]), C41326GJu.LIZ(creativeInfo), str);
        }
        return strArr;
    }
}
