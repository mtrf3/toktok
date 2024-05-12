package X;

import Y.ACListenerS22S0101000_3;
import Y.ACallableS56S0300000_7;
import Y.AObjectS47S0101000_2;
import Y.AObjectS52S0101000_7;
import Y.AObjectS87S0300000_7;
import Y.ARunnableS10S0201000_7;
import Y.ARunnableS11S0101000_7;
import Y.IDuS78S0200000_7;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bddatefmt.BDDateFormat;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.core.preloader.ImagePreloadExperiment;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.services.IAVSettingServiceImpl;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.ChoosePhotoPreviewPageConfig;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.MyMediaModel;
import com.ss.android.ugc.aweme.shortvideo.util.performance.OpenAlbumPanelPerformanceMonitor;
import com.zhiliaoapp.musically.R;
import defpackage.e1;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Queue;
import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.HtO, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C45498HtO extends AbstractC029409q<RecyclerView.ViewHolder> implements InterfaceC45721Hwz, InterfaceC45718Hww {
    public int LJLIL = 12;
    public int LJLILLLLZI;
    public int LJLJI;
    public String LJLJJI;
    public final Context LJLJJL;
    public final List<MyMediaModel> LJLJJLL;
    public final Size LJLJL;
    public final int LJLJLJ;
    public int LJLJLLL;
    public InterfaceC45596Huy LJLL;
    public InterfaceC45510Hta LJLLI;
    public boolean LJLLILLLL;
    public boolean LJLLJ;
    public final int LJLLL;
    public HMO LJLLLL;
    public final HashSet<String> LJLLLLLL;
    public int LJLZ;
    public RecyclerView LJZ;
    public List<MyMediaModel> LJZI;
    public int LJZL;
    public int LL;
    public int LLD;
    public C45519Htj LLF;
    public boolean LLFF;
    public final HashSet<RecyclerView.ViewHolder> LLFFF;
    public final HashSet<C45507HtX> LLFII;
    public final boolean LLFZ;
    public boolean LLI;
    public boolean LLIFFJFJJ;
    public final HO6 LLII;
    public HO4 LLIIII;
    public List<InterfaceC45547HuB> LLIIIILZ;
    public final java.util.Map<Integer, Integer> LLIIIJ;
    public int LLIIIL;
    public boolean LLIIIZ;
    public final Queue<String> LLIIJI;

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        return i;
    }

    @Override // X.InterfaceC45718Hww
    public final void LJJ() {
        if (!this.LLIFFJFJJ) {
            return;
        }
        this.LLIFFJFJJ = false;
        Iterator<C45507HtX> it = this.LLFII.iterator();
        while (it.hasNext()) {
            C45507HtX next = it.next();
            it.remove();
            W4R w4r = next.LJLZ;
            if (w4r != null) {
                next.LJLIL.setController(w4r);
            }
        }
    }

    @Override // X.InterfaceC45718Hww
    public final void LJJLI() {
        if (this.LLIFFJFJJ) {
            return;
        }
        this.LLIFFJFJJ = true;
    }

    public final void LJLLLLLL() {
        if (!this.LJLLLLLL.isEmpty() && this.LLF.LJFF.stickerMultiPhotosMode) {
            Iterator it = new LinkedHashSet(this.LJLLLLLL).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                int i = 0;
                while (true) {
                    if (i < this.LJZI.size()) {
                        MyMediaModel myMediaModel = (MyMediaModel) ListProtector.get(this.LJZI, i);
                        if (str.equals(myMediaModel.fileLocalUriPath)) {
                            LLIIIZ(myMediaModel, -1, true);
                            this.LJLLLLLL.remove(myMediaModel.fileLocalUriPath);
                            break;
                        }
                        i++;
                    }
                }
            }
        }
    }

    public final int LLD() {
        if (this.LJLJLLL == -1) {
            this.LJLJLLL = Math.min(getItemCount() - 1, ((this.LJZ.getHeight() / this.LJLJL.getHeight()) * this.LJLJLJ) - 1);
        }
        return this.LJLJLLL;
    }

    public final void LLFZ() {
        int i = -1;
        for (MyMediaModel myMediaModel : this.LJZI) {
            i++;
            Iterator<MyMediaModel> it = this.LJLJJLL.iterator();
            while (it.hasNext()) {
                if (myMediaModel.fileLocalUriPath.equals(it.next().fileLocalUriPath)) {
                    if (this.LJLLLLLL.isEmpty()) {
                        notifyItemChanged(this.LLIIIL + i, new Object());
                    } else {
                        notifyItemChanged(this.LLIIIL + i);
                    }
                }
            }
        }
    }

    public final void LLIIIJ() {
        C15070iV<Integer, Integer> LIZ = C8DQ.LIZ(this.LJZ);
        int intValue = LIZ.LIZ.intValue();
        notifyItemRangeChanged(intValue, (LIZ.LIZIZ.intValue() - intValue) + 1, new Object());
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJZI.size() + this.LLIIIL;
    }

    public final boolean LL() {
        if (HOA.LIZ() && this.LLF.LJFF.enablePreviewClipAdjust) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC45721Hwz
    public final CharSequence LJLJJL(int i) {
        if (i < 0 || i >= this.LJZI.size()) {
            return "";
        }
        long j = ((MediaModel) ListProtector.get(this.LJZI, i)).date * 1000;
        Locale locale = IAVSettingServiceImpl.createIAVSettingServicebyMonsterPlugin(false).getCountryLocale();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        Calendar calendar2 = Calendar.getInstance();
        if (Math.abs(System.currentTimeMillis() - j) / 86400000 < 2) {
            if (calendar.get(6) == calendar2.get(6)) {
                BDDateFormat bDDateFormat = new BDDateFormat("tdy");
                o.LJIIIIZZ(locale, "locale");
                return bDDateFormat.LIZIZ(j, locale);
            }
            BDDateFormat bDDateFormat2 = new BDDateFormat("ytd");
            o.LJIIIIZZ(locale, "locale");
            return bDDateFormat2.LIZIZ(j, locale);
        }
        if (calendar.get(1) == calendar2.get(1) && calendar.get(2) == calendar2.get(2) && calendar.get(8) == calendar2.get(8)) {
            BDDateFormat bDDateFormat3 = new BDDateFormat("dddd");
            o.LJIIIIZZ(locale, "locale");
            return bDDateFormat3.LIZIZ(j, locale);
        }
        if (calendar.get(1) == calendar2.get(1)) {
            BDDateFormat bDDateFormat4 = new BDDateFormat("LL-Y");
            o.LJIIIIZZ(locale, "locale");
            return bDDateFormat4.LIZIZ(j, locale);
        }
        BDDateFormat bDDateFormat5 = new BDDateFormat("ll");
        o.LJIIIIZZ(locale, "locale");
        return bDDateFormat5.LIZIZ(j, locale);
    }

    public final boolean LLFF(C45507HtX c45507HtX) {
        boolean LIZIZ = this.LJLLI.LIZIZ();
        if (this.LJZL == 26) {
            if (this.LJLLI.LJIILJJIL() || (c45507HtX.LJLLILLLL.LJI() && this.LJLLI.LJ())) {
                return true;
            }
            return false;
        }
        return LIZIZ;
    }

    public final void LLIFFJFJJ(List<MyMediaModel> list) {
        if (LL()) {
            for (MyMediaModel myMediaModel : list) {
                if (myMediaModel.LJI()) {
                    Iterator<MyMediaModel> it = this.LJZI.iterator();
                    int i = 0;
                    while (true) {
                        if (it.hasNext()) {
                            MyMediaModel next = it.next();
                            if (myMediaModel.LJI() && Objects.equals(myMediaModel.id, next.id)) {
                                next.startTime = myMediaModel.startTime;
                                next.endTime = myMediaModel.endTime;
                                notifyItemChanged(i + this.LLIIIL);
                                break;
                            }
                            i++;
                        }
                    }
                }
            }
        }
    }

    public final void LLII(MyMediaModel myMediaModel) {
        if (LL()) {
            int i = 0;
            for (MyMediaModel myMediaModel2 : this.LJZI) {
                if (myMediaModel.LJI() && Objects.equals(myMediaModel.id, myMediaModel2.id)) {
                    myMediaModel2.startTime = myMediaModel.startTime;
                    myMediaModel2.endTime = myMediaModel.endTime;
                    notifyItemChanged(i + this.LLIIIL);
                    return;
                }
                i++;
            }
        }
    }

    public final void LLIIIL(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && layoutParams.width != this.LJLJL.getWidth() && layoutParams.height != this.LJLJL.getHeight()) {
            layoutParams.width = this.LJLJL.getWidth();
            layoutParams.height = this.LJLJL.getHeight();
        }
    }

    public final void LLIIJI(boolean z) {
        Iterator<MyMediaModel> it = this.LJLJJLL.iterator();
        while (it.hasNext()) {
            it.next().selectIndex = -1;
        }
        Iterator<MyMediaModel> it2 = this.LJZI.iterator();
        while (it2.hasNext()) {
            it2.next().selectIndex = -1;
        }
        this.LJLLILLLL = z;
        if (!C32151Nz.LJJIIJZLJL(this.LJLJJLL)) {
            this.LJLJJLL.clear();
            InterfaceC45510Hta interfaceC45510Hta = this.LJLLI;
            if (interfaceC45510Hta != null) {
                interfaceC45510Hta.LJIILL(this.LJLJJLL, null, null);
            }
        }
        if (C45609HvB.LIZ() && this.LJZ != null) {
            LLIIIJ();
        } else {
            notifyDataSetChanged();
        }
    }

    public final void LLIIJLIL(List<MyMediaModel> list) {
        AbstractC73672Svk LJIIJ = AbstractC73672Svk.LJIIJ(new IDuS78S0200000_7(list, this, 2));
        if (this.LJZI.size() != 0) {
            LJIIJ = LJIIJ.LJJL(T16.LIZIZ).LJJJ(C73969T1h.LIZIZ());
        }
        LJIIJ.LJJJJZI(new C59661NbF(2, this, list));
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < this.LLIIIL && this.LLIIIILZ != null) {
            int i2 = ImagePreloadExperiment.PRIORITY_DEFAULT + i;
            ((HashMap) this.LLIIIJ).put(Integer.valueOf(i2), Integer.valueOf(((InterfaceC45547HuB) ListProtector.get(this.LLIIIILZ, i)).layoutRes()));
            ((InterfaceC45547HuB) ListProtector.get(this.LLIIIILZ, i)).setAlbumActivity(C45804HyK.LJIJJ(this.LJLJJL));
            return i2;
        }
        return 1001;
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        C45507HtX c45507HtX;
        InterfaceC92693kP interfaceC92693kP;
        if (this.LLFZ) {
            this.LLFFF.remove(viewHolder);
        }
        if ((viewHolder instanceof C45507HtX) && (interfaceC92693kP = (c45507HtX = (C45507HtX) viewHolder).LJZ) != null && !interfaceC92693kP.isDisposed()) {
            c45507HtX.LJLLI = "";
            c45507HtX.LJZ = null;
            interfaceC92693kP.dispose();
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        if (InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup() == 2) {
            this.LLFII.remove(viewHolder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void setData(List<MyMediaModel> list) {
        this.LJZI.clear();
        for (int i = 0; i < list.size(); i++) {
            ((MyMediaModel) ListProtector.get(list, i)).originIndex = i;
            this.LJZI.add(ListProtector.get(list, i));
        }
        if (!list.isEmpty()) {
            this.LLIIIZ = true;
        }
        LJLLLLLL();
        notifyDataSetChanged();
    }

    public static void LJZ(C45507HtX c45507HtX, MyMediaModel myMediaModel) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(myMediaModel.fileLocalUriPath);
        LIZ.append("_editor");
        android.net.Uri LJIIIIZZ = C44694HgQ.LJIIIIZZ(X1D.LIZIZ(LIZ));
        if (!W5U.LIZJ().LJII(LJIIIIZZ) && (c45507HtX.LJLIL.getDrawable() instanceof BitmapDrawable)) {
            try {
                Bitmap bitmap = ((BitmapDrawable) c45507HtX.LJLIL.getDrawable()).getBitmap();
                if (bitmap != null && !bitmap.isRecycled()) {
                    W5U.LIZJ().LJIIIZ(bitmap.copy(Bitmap.Config.ARGB_8888, true), LJIIIIZZ);
                }
            } catch (OutOfMemoryError unused) {
                C78983UzD.LJIILL("album cache bitmap oom");
            }
        }
    }

    public static void LLFFF(MediaModel mediaModel, final boolean z) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(mediaModel);
        C43117Gw5 c43117Gw5 = C43117Gw5.LIZ;
        InterfaceC141565h2 interfaceC141565h2 = new InterfaceC141565h2() { // from class: X.HQ6
            @Override // X.InterfaceC141565h2
            public final void LIZ(boolean z2) {
                boolean z3 = z;
                C145995oB c145995oB = new C145995oB();
                c145995oB.LJ("is_4k_enable", C52243Ket.LIZ());
                c145995oB.LJ("is_4k_video", z2);
                c145995oB.LJ("is_success", z3);
                FMX.LJIIL("tool_performance_4k_video_select", c145995oB.LIZ);
            }
        };
        c43117Gw5.getClass();
        C43117Gw5.LIZ(arrayList, interfaceC141565h2);
    }

    public final void LJLZ(C45507HtX c45507HtX, int i) {
        boolean z;
        boolean z2;
        String str;
        MyMediaModel myMediaModel = c45507HtX.LJLLILLLL;
        if (myMediaModel == null) {
            return;
        }
        if (TextUtils.isEmpty(myMediaModel.mediaRatio)) {
            int i2 = myMediaModel.width;
            int i3 = myMediaModel.height;
            if (i2 > i3) {
                str = "horizontal";
            } else if (i2 < i3) {
                str = "vertical";
            } else {
                str = "square";
            }
            myMediaModel.mediaRatio = str;
        }
        C45470Hsw c45470Hsw = new C45470Hsw(this, c45507HtX, i);
        if (LL() && myMediaModel.LJI() && (myMediaModel.startTime > 0 || myMediaModel.endTime > 0)) {
            if (this.LLIIII == null) {
                this.LLIIII = new HO4(this.LJLJJL);
            }
            HO4 ho4 = this.LLIIII;
            Size size = this.LJLJL;
            C45534Hty c45534Hty = this.LLF.LJI;
            if (c45534Hty.LIZ && c45534Hty.LIZ() == EnumC45531Htv.NINE_TO_SIXTEEN) {
                z2 = true;
            } else {
                z2 = false;
            }
            ho4.LIZ(c45507HtX, size, myMediaModel, c45470Hsw, z2);
            return;
        }
        HO6 ho6 = this.LLII;
        Size size2 = this.LJLJL;
        C45534Hty c45534Hty2 = this.LLF.LJI;
        if (c45534Hty2.LIZ && c45534Hty2.LIZ() == EnumC45531Htv.NINE_TO_SIXTEEN) {
            z = true;
        } else {
            z = false;
        }
        ho6.LIZ(c45507HtX, size2, myMediaModel, c45470Hsw, z);
    }

    public final void LJZI(MyMediaModel myMediaModel, C45538Hu2 c45538Hu2) {
        if (!C42117Gfx.LIZ()) {
            double d = myMediaModel.width;
            double d2 = myMediaModel.height;
            if (d > d2 * 2.4d || d2 > d * 2.4d) {
                C41995Gdz.LIZ(0, 1);
                C5S1 c5s1 = new C5S1(this.LJLJJL);
                c5s1.LIZJ(R.string.r4n);
                c5s1.LJ();
                C6BK c6bk = new C6BK();
                c6bk.LIZ.put("errorCode", -9);
                c6bk.LIZ.put("errorMsg", "");
                C43882HKc.LIZLLL(1, "aweme_movie_import_error_rate", c6bk.LJ(), true);
                return;
            }
        }
        C60903NvH.LJIIJJI().LJIIZILJ().updateMediaTypeCache(myMediaModel.fileLocalUriPath);
        C60903NvH.LJIIJJI().LJIIZILJ().cacheImageSize(myMediaModel.fileLocalUriPath);
        C60903NvH.LJIIJJI().LJIIZILJ().cacheImageColor(myMediaModel.fileLocalUriPath, this.LJLJL.getWidth());
        c45538Hu2.LIZLLL.LLIIIZ(c45538Hu2.LIZ, c45538Hu2.LIZIZ, c45538Hu2.LIZJ);
    }

    public final void LJZL(MyMediaModel myMediaModel, C45538Hu2 c45538Hu2) {
        boolean z;
        if (this.LJLLLL == null) {
            HMO hmo = new HMO(this.LJLJJL);
            this.LJLLLL = hmo;
            hmo.LIZLLL = "enter_from_multi";
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        HMO hmo2 = this.LJLLLL;
        boolean LJ = C42117Gfx.LJ();
        long j = this.LL;
        if (this.LJZL != 0) {
            z = true;
        } else {
            z = false;
        }
        hmo2.LIZ(myMediaModel, LJ, 1000L, j, z, false, new AObjectS87S0300000_7(myMediaModel, c45538Hu2, this, 0), new AObjectS87S0300000_7(myMediaModel, c45538Hu2, this, 1));
    }

    public final void LLIIIILZ(C45507HtX c45507HtX, MyMediaModel myMediaModel) {
        int i;
        if (myMediaModel.LJI() && this.LJLLJ) {
            int i2 = (int) myMediaModel.duration;
            if (LL() && (i = myMediaModel.endTime) > 0) {
                i2 = i - myMediaModel.startTime;
            }
            c45507HtX.LJLJJLL.post(new ARunnableS10S0201000_7(Math.round((i2 * 1.0f) / 1000.0f), this, c45507HtX, 3));
        }
    }

    public final void LLIIL(int i, MyMediaModel myMediaModel) {
        boolean z;
        C41865Gbt.LIZJ(new AObjectS47S0101000_2(i, myMediaModel, 1));
        if (LL() && myMediaModel.LJI() && myMediaModel.startTime > 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = myMediaModel.selectIndex;
        myMediaModel.selectIndex = -1;
        int i3 = -1;
        for (int i4 = 0; i4 < ((ArrayList) this.LJLJJLL).size(); i4++) {
            MyMediaModel myMediaModel2 = (MyMediaModel) ListProtector.get(this.LJLJJLL, i4);
            if (TextUtils.equals(myMediaModel2.LJII(), myMediaModel.LJII())) {
                i3 = i4;
            }
            int i5 = myMediaModel2.selectIndex;
            if (i5 > i2) {
                myMediaModel2.selectIndex = i5 - 1;
            }
        }
        if (i3 >= 0) {
            ListProtector.remove(this.LJLJJLL, i3);
        }
        if (i != -1) {
            if (((ArrayList) this.LJLJJLL).size() + 1 == this.LJLIL) {
                if (C45609HvB.LIZ()) {
                    LLIIIJ();
                } else {
                    notifyDataSetChanged();
                }
                if (z) {
                    notifyItemChanged(i);
                } else {
                    notifyItemChanged(i, new Object());
                }
            } else {
                if (i >= 0) {
                    if (z) {
                        notifyItemChanged(i);
                    } else {
                        notifyItemChanged(i, new Object());
                    }
                }
                Iterator it = ((ArrayList) this.LJLJJLL).iterator();
                while (it.hasNext()) {
                    MyMediaModel myMediaModel3 = (MyMediaModel) it.next();
                    if (z) {
                        notifyItemChanged(myMediaModel3.originIndex);
                    } else {
                        notifyItemChanged(myMediaModel3.originIndex, new Object());
                    }
                }
            }
        } else {
            notifyItemChanged(myMediaModel.originIndex);
            LLFZ();
        }
        InterfaceC45510Hta interfaceC45510Hta = this.LJLLI;
        if (interfaceC45510Hta != null) {
            interfaceC45510Hta.LJIILL(this.LJLJJLL, EnumC44979Hl1.THUMBNAIL, myMediaModel);
            this.LJLLI.LIZJ(myMediaModel, false);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        LLIIII((C45507HtX) viewHolder, i, false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:1|(2:5|(8:7|8|(1:10)|11|12|(3:17|18|(2:20|(1:22)))|14|15))|28|(1:30)|31|(2:40|(1:44))(1:35)|36|(1:39)|38|8|(0)|11|12|(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x01c7, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x01c8, code lost:
    
        X.C78946Uyc.LIZIZ(r0);
        X.C36922EeM.LIZ(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // X.AbstractC029409q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(android.view.ViewGroup r8, int r9) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C45498HtO.onCreateViewHolder(android.view.ViewGroup, int):androidx.recyclerview.widget.RecyclerView$ViewHolder");
    }

    public final void LLF(final MyMediaModel myMediaModel, final int i, final boolean z) {
        if (myMediaModel.selectIndex >= 0 && !this.LLF.LIZIZ) {
            AnonymousClass632.LIZIZ(this.LJLJJL);
            LLIIL(i, myMediaModel);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MvImageChooseAdapter handleMediaSelected select originIndex ");
        LIZ.append(myMediaModel.originIndex);
        LIZ.append(" selectIndex ");
        LIZ.append(myMediaModel.selectIndex);
        H78.LJI(X1D.LIZIZ(LIZ));
        C45508HtY.LIZ(myMediaModel.fileLocalUriPath, false, new InterfaceC88472Yns() { // from class: X.HtU
            /* JADX WARN: Code restructure failed: missing block: B:68:0x00e0, code lost:
            
                if (r1 != false) goto L18;
             */
            /* JADX WARN: Removed duplicated region for block: B:40:0x01a5  */
            /* JADX WARN: Removed duplicated region for block: B:44:0x01b9  */
            /* JADX WARN: Removed duplicated region for block: B:48:0x01cc  */
            @Override // X.InterfaceC88472Yns
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r13) {
                /*
                    Method dump skipped, instructions count: 475
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C45504HtU.invoke(java.lang.Object):java.lang.Object");
            }
        });
    }

    public final void LLFII(int i, String str, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("duration", (int) j);
            C6BK c6bk = new C6BK();
            c6bk.LIZ.put("status", String.valueOf(i));
            c6bk.LIZ.put("scene_name", "select");
            c6bk.LIZ.put("type", str);
            C43882HKc.LIZ.LJIILIIL("aweme_video_import_duration", jSONObject, c6bk.LJ());
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LLIIII(C45507HtX c45507HtX, int i, boolean z) {
        int i2;
        boolean z2;
        float f;
        int i3;
        C60903NvH.LJIIJJI().LJJIIJ();
        float f2 = 1.0f;
        if (i < this.LLIIIL && this.LLIIIZ) {
            LLIIIL(c45507HtX.itemView);
            InterfaceC45510Hta interfaceC45510Hta = this.LJLLI;
            if (interfaceC45510Hta != null && interfaceC45510Hta.LIZIZ()) {
                c45507HtX.itemView.setAlpha(0.5f);
            } else {
                c45507HtX.itemView.setAlpha(1.0f);
            }
            C16880lQ.LJIIJ(new C45506HtW(this, i), c45507HtX.itemView);
            return;
        }
        LLIIIL(c45507HtX.LJLIL);
        LLIIIL(c45507HtX.LJLL);
        MyMediaModel myMediaModel = (MyMediaModel) ListProtector.get(this.LJZI, i - this.LLIIIL);
        myMediaModel.originIndex = i;
        c45507HtX.LJLLILLLL = myMediaModel;
        c45507HtX.LJLLLL = i;
        FrameLayout frameLayout = c45507HtX.LJLJLLL;
        if (this.LJLLILLLL) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        frameLayout.setVisibility(i2);
        if (!this.LLF.LIZIZ ? c45507HtX.LJLLILLLL.selectIndex >= 0 : c45507HtX.LJLLILLLL.copiedCount > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((C45695HwZ.LIZ() || z2) && c45507HtX.LJLLILLLL.selectIndex < 0) {
            Iterator it = ((ArrayList) this.LJLJJLL).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                MyMediaModel myMediaModel2 = (MyMediaModel) it.next();
                if (C38354F3m.LIZJ(c45507HtX.LJLLILLLL.id, myMediaModel2.id)) {
                    c45507HtX.LJLLILLLL.selectIndex = myMediaModel2.selectIndex;
                    break;
                }
            }
        }
        float f3 = 0.0f;
        if (z2) {
            int i4 = c45507HtX.LJLLILLLL.selectIndex;
            int i5 = c45507HtX.LJLILLLLZI;
            if (i5 != 0) {
                if (i5 != 1) {
                    if (i5 == 2) {
                        c45507HtX.LJLJI.setVisibility(8);
                        c45507HtX.LJLJJL.setVisibility(0);
                    }
                } else {
                    c45507HtX.LJLJI.setVisibility(8);
                    c45507HtX.LJLJJI.setVisibility(0);
                    c45507HtX.LJLLL.setVisibility(0);
                }
            } else {
                c45507HtX.LJLJI.setText(String.valueOf(i4));
                c45507HtX.LJLJI.setBackgroundResource(R.drawable.tv);
            }
            if (!this.LLF.LJFF.isUgcTemplate) {
                f3 = 1.0f;
            }
            f = 1.1f;
            i3 = 0;
        } else {
            int i6 = c45507HtX.LJLILLLLZI;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 == 2) {
                        c45507HtX.LJLJI.setBackgroundResource(R.drawable.a3e);
                        c45507HtX.LJLJI.setVisibility(0);
                        c45507HtX.LJLJJL.setVisibility(8);
                    }
                } else {
                    c45507HtX.LJLJI.setVisibility(8);
                    c45507HtX.LJLJJI.setVisibility(0);
                    c45507HtX.LJLLL.setVisibility(8);
                }
            } else {
                if (InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup() == 0 || !c45507HtX.LJLJI.getText().toString().equals("")) {
                    c45507HtX.LJLJI.setText("");
                }
                c45507HtX.LJLJI.setBackgroundResource(R.drawable.tu);
            }
            if (LLFF(c45507HtX)) {
                f2 = 0.34f;
            } else {
                f2 = 1.0f;
            }
            f = 1.0f;
            i3 = 4;
        }
        C60903NvH.LJIIJJI().LJJIIJ();
        if (c45507HtX.LJLIL.getAlpha() != f2) {
            c45507HtX.LJLIL.setAlpha(f2);
        }
        ChoosePhotoPreviewPageConfig choosePhotoPreviewPageConfig = this.LLF.LJFF;
        if (choosePhotoPreviewPageConfig.isUgcTemplate || choosePhotoPreviewPageConfig.isAIGCAvatar) {
            c45507HtX.LJLJI.setAlpha(f2);
            c45507HtX.LJLJJI.setAlpha(f2);
            c45507HtX.LJLJJL.setAlpha(f2);
        }
        if (c45507HtX.LJLIL.getScaleX() != f) {
            if (z) {
                c45507HtX.LJLIL.animate().scaleY(f).scaleX(f).setDuration(300L).start();
                if (i3 == 4) {
                    C09K.LIZ(c45507HtX.LJLL, f3, 300L).withEndAction(new ARunnableS11S0101000_7(i3, c45507HtX, 9)).start();
                } else {
                    c45507HtX.LJLL.setVisibility(i3);
                    c45507HtX.LJLL.animate().alpha(f3).setDuration(300L).start();
                }
            } else {
                c45507HtX.LJLIL.setScaleX(f);
                c45507HtX.LJLIL.setScaleY(f);
                c45507HtX.LJLL.setVisibility(i3);
            }
        }
        if (this.LJZL == 26 && c45507HtX.LJLLILLLL.LJI()) {
            long j = c45507HtX.LJLLILLLL.duration;
            if ((j > this.LL || j < this.LLD) && c45507HtX.LJLIL.getAlpha() != 0.5f) {
                c45507HtX.LJLIL.setAlpha(0.5f);
            }
        }
        View view = c45507HtX.LJLLJ;
        if (view != null) {
            view.setVisibility(8);
        }
        if (!this.LLF.LJFF.stickerMultiPhotosMode && this.LJLLLLLL.contains(myMediaModel.fileLocalUriPath)) {
            if (c45507HtX.LJLJLJ.getParent() != null) {
                c45507HtX.LJLJLJ.inflate();
                View findViewById = c45507HtX.itemView.findViewById(R.id.jmr);
                c45507HtX.LJLLJ = findViewById;
                findViewById.findViewById(R.id.jmn).setVisibility(8);
            }
            c45507HtX.LJLLJ.setVisibility(0);
        }
        if (!z) {
            if (LL() && myMediaModel.LJI() && (myMediaModel.startTime > 0 || myMediaModel.endTime > 0)) {
                C164066cE c164066cE = c45507HtX.LJLIL;
                if (c164066cE.LJLJLJ) {
                    c164066cE.setBackground(null);
                }
                LJLZ(c45507HtX, i);
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("file://");
                LIZ.append(myMediaModel.fileLocalUriPath);
                String LIZIZ = X1D.LIZIZ(LIZ);
                if (!TextUtils.equals(c45507HtX.LJLLI, LIZIZ)) {
                    C164066cE c164066cE2 = c45507HtX.LJLIL;
                    if (c164066cE2.LJLJLJ) {
                        c164066cE2.setBackground(null);
                    }
                    c45507HtX.LJLLI = LIZIZ;
                    LJLZ(c45507HtX, i);
                }
            }
        }
        C16880lQ.LJIIJ(new C45505HtV(this, i, myMediaModel, c45507HtX, new boolean[]{false}), c45507HtX.itemView);
        C16880lQ.LJIILJJIL(c45507HtX.LJLJLLL, new C45509HtZ(this, i, myMediaModel, c45507HtX));
        C16880lQ.LJIJI(c45507HtX.LJLJI, new ACListenerS22S0101000_3(4, c45507HtX, 6));
        C16880lQ.LJIIJ(new ACListenerS22S0101000_3(3, c45507HtX, 10), c45507HtX.LJLJJI);
        if (myMediaModel.LJI() && myMediaModel.duration == 0) {
            C10K.LIZJ(new ACallableS56S0300000_7(c45507HtX, this, myMediaModel, 7));
        }
        if (myMediaModel.LJI() && this.LJLLJ) {
            LLIIIILZ(c45507HtX, myMediaModel);
            c45507HtX.LJLJJLL.setVisibility(0);
            c45507HtX.LJLJL.setVisibility(0);
        } else {
            c45507HtX.LJLJJLL.setVisibility(8);
            c45507HtX.LJLJL.setVisibility(8);
        }
        if (i == 0 && this.LLFF) {
            G8G.LIZ.step(OpenAlbumPanelPerformanceMonitor.INSTANCE, "onBindFirst");
        } else {
            if (i != LLD() || !this.LLFF) {
                return;
            }
            G8G.LIZ.step(OpenAlbumPanelPerformanceMonitor.INSTANCE, "bindAll");
        }
    }

    public final void LLIIIZ(MyMediaModel myMediaModel, int i, boolean z) {
        EnumC44979Hl1 enumC44979Hl1;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("MvImageChooseAdapter notifyMediaClick select originIndex ");
        LIZ.append(myMediaModel.originIndex);
        LIZ.append(" selectIndex ");
        LIZ.append(myMediaModel.selectIndex);
        H78.LJI(X1D.LIZIZ(LIZ));
        AnonymousClass632.LIZIZ(this.LJLJJL);
        if (z) {
            enumC44979Hl1 = EnumC44979Hl1.THUMBNAIL;
        } else {
            enumC44979Hl1 = EnumC44979Hl1.PREVIEW;
        }
        if (((ArrayList) this.LJLJJLL).size() == this.LJLIL) {
            notifyDataSetChanged();
            InterfaceC45510Hta interfaceC45510Hta = this.LJLLI;
            if (interfaceC45510Hta != null) {
                this.LJLZ = interfaceC45510Hta.LIZJ(myMediaModel, true);
                this.LJLLI.LJIILL(this.LJLJJLL, enumC44979Hl1, myMediaModel);
                return;
            }
            return;
        }
        if (((ArrayList) this.LJLJJLL).contains(myMediaModel) && !this.LLF.LIZIZ) {
            return;
        }
        if (((ArrayList) this.LJLJJLL).contains(myMediaModel)) {
            myMediaModel = myMediaModel.LJIIIIZZ();
        }
        ((ArrayList) this.LJLJJLL).add(myMediaModel);
        InterfaceC45510Hta interfaceC45510Hta2 = this.LJLLI;
        if (interfaceC45510Hta2 != null) {
            this.LJLZ = interfaceC45510Hta2.LIZJ(myMediaModel, true);
            this.LJLLI.LJIILL(this.LJLJJLL, enumC44979Hl1, myMediaModel);
        }
        myMediaModel.selectIndex = this.LJLZ;
        if (((ArrayList) this.LJLJJLL).size() == this.LJLIL || this.LJLLI.LJ()) {
            if (C45609HvB.LIZ()) {
                LLIIIJ();
                return;
            } else {
                notifyDataSetChanged();
                return;
            }
        }
        if (i != -1 && i < this.LJZI.size() && TextUtils.equals(((MediaModel) ListProtector.get(this.LJZI, i)).fileLocalUriPath, myMediaModel.fileLocalUriPath)) {
            notifyItemChanged(i + this.LLIIIL, new Object());
        } else {
            LLFZ();
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i, List<Object> list) {
        LLIIII((C45507HtX) viewHolder, i, !list.isEmpty());
    }

    public C45498HtO(Context context, int i, double d, int i2, boolean z) {
        HO6 hoj;
        C43117Gw5.LIZ.getClass();
        this.LJLILLLLZI = C43117Gw5.LJII();
        this.LJLJI = C43117Gw5.LJII();
        this.LJLJJLL = new ArrayList();
        this.LJLJLLL = -1;
        this.LJLLILLLL = true;
        this.LJLLLLLL = new LinkedHashSet();
        this.LJLZ = 1;
        this.LJZI = new ArrayList();
        this.LJZL = -1;
        this.LL = -1;
        this.LLD = 1000;
        this.LLF = new C45519Htj();
        this.LLFFF = new HashSet<>(48);
        HashSet<C45507HtX> hashSet = new HashSet<>(48);
        this.LLFII = hashSet;
        this.LLFZ = e1.LIZ(31744, "creative_tools_release_img_request", true, false);
        this.LLIIIJ = new HashMap();
        this.LLIIIZ = false;
        this.LLIIJI = new LinkedList();
        this.LJLJJL = context;
        this.LJLJLJ = i;
        this.LLFF = z;
        context.getResources().getDimensionPixelOffset(R.dimen.z8);
        int LJIIJJI = (KL2.LJIIJJI(context) - ((i - 1) * ((int) KL2.LIZJ(context, 1.5f)))) / i;
        this.LJLJJI = context.getString(R.string.cq_);
        this.LJLLL = i2;
        this.LJLJL = new Size(LJIIJJI, (int) (LJIIJJI * d));
        if (C45609HvB.LIZ()) {
            hoj = new HO8(context);
        } else if (InterfaceC44948HkW.LJI.getOpenAlbumOptiGroup() != 0) {
            hoj = new HOI(hashSet, new AObjectS52S0101000_7(0, this, 15));
        } else {
            hoj = new HOJ();
        }
        this.LLII = hoj;
    }
}
