package com.ss.android.ugc.aweme.live.livehostimpl.edit;

import X.ActivityC45651qj;
import X.B83;
import X.B9K;
import X.BFO;
import X.BZI;
import X.C16880lQ;
import X.C28507BGt;
import X.C28787BRn;
import X.C29374Bfu;
import X.C2A7;
import X.C32I;
import X.C56K;
import X.C61712OJw;
import X.C61713OJx;
import X.C61878OQg;
import X.C6D9;
import X.C6IQ;
import X.C76882UFi;
import X.C76891UFr;
import X.C76892UFs;
import X.C76893UFt;
import X.C76896UFw;
import X.C78897Uxp;
import X.C79045V0n;
import X.C81091Vs7;
import X.C81184Vtc;
import X.DialogC31813Ce9;
import X.EnumC76899UFz;
import X.InterfaceC32901Qw;
import X.ORZ;
import X.UG0;
import X.UGS;
import X.UGW;
import X.V10;
import X.W5F;
import X.W5U;
import Y.ACListenerS33S0100000_13;
import Y.ACListenerS47S0200000_13;
import Y.ARunnableS49S0100000_13;
import Y.IDCListenerS259S0100000_13;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.design.view.icon.LiveIconView;
import com.bytedance.android.livesdk.LiveDialogFragment;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.base.SafeHandler;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AqS175S0200000_13;
import kotlin.jvm.internal.o;
import v82.IDdS504S0100000_13;

/* loaded from: classes14.dex */
public final class SpotlightImageListPreviewDialogFragment extends LiveDialogFragment implements InterfaceC32901Qw {
    public C76882UFi LJLJI;
    public Bitmap LJLJJI;
    public Bitmap LJLJJL;
    public Bitmap LJLJJLL;
    public int LJLJLJ;
    public Rect LJLL;
    public List<Matrix> LJLLI;
    public int LJLLILLLL;
    public int LJLLJ;
    public int LJLLL;
    public int LJLLLL;
    public long LJLLLLLL;
    public DialogC31813Ce9 LJLZ;
    public boolean LJZ;
    public final Matrix LJZI;
    public int LJZL;
    public final Map<Integer, View> LL = new LinkedHashMap();
    public List<Bitmap> LJLIL = new ArrayList();
    public List<Bitmap> LJLILLLLZI = new ArrayList();
    public String LJLJL = "";
    public EnumC76899UFz LJLJLLL = EnumC76899UFz.OTHER;

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final void _$_clearFindViewByIdCache() {
        ((LinkedHashMap) this.LL).clear();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LL;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null || (findViewById = view2.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, X.InterfaceC12810er
    public final /* synthetic */ int getThemeOverlay(Context context) {
        return V10.LIZ();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public SpotlightImageListPreviewDialogFragment() {
        new Rect(0, 0, 0, 0);
        this.LJZI = new Matrix();
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment
    public final C28507BGt createParams() {
        C28507BGt c28507BGt = new C28507BGt(R.layout.brb);
        c28507BGt.LIZJ = R.style.aaq;
        c28507BGt.LJIIL = new ColorDrawable(0);
        c28507BGt.LJII = 80;
        c28507BGt.LJIIJ = -1;
        return c28507BGt;
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        String str;
        Map<String, Object> map;
        super.onDestroy();
        int i = C76896UFw.LIZIZ[this.LJLJLLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    str = "others";
                } else {
                    str = "back";
                }
            } else {
                str = "delete";
            }
        } else {
            str = "done";
        }
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_leave");
        LIZ.LJIJJ(Long.valueOf(SystemClock.elapsedRealtime() - this.LJLLLLLL), "duration");
        LIZ.LJIJJ(str, "leave_type");
        C76882UFi c76882UFi = this.LJLJI;
        if (c76882UFi != null && (map = c76882UFi.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
    }

    public final void Al(Bitmap bitmap) {
        this.LJLJJI = bitmap;
        this.LJLJJL = bitmap;
        UGW ugw = (UGW) _$_findCachedViewById(R.id.kxn);
        if (ugw != null) {
            ugw.setIntercepter(new C76892UFs(this));
        }
        AppCompatImageView appCompatImageView = (AppCompatImageView) _$_findCachedViewById(R.id.f12);
        if (appCompatImageView != null) {
            appCompatImageView.setImageBitmap(this.LJLJJI);
        }
        float f = (this.LJLLLL / 2.0f) - ((this.LJLLJ / 2) + this.LJLLILLLL);
        C56K c56k = new C56K();
        if (bitmap != null && this.LJLLJ > 0) {
            int min = Math.min(bitmap.getWidth(), bitmap.getHeight());
            int max = Math.max(bitmap.getWidth(), bitmap.getHeight());
            if (min > 0) {
                c56k.element = (((max * this.LJLLJ) / min) - this.LJLLL) / 2.0f;
            }
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity == null) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) _$_findCachedViewById(R.id.j4q);
        if (relativeLayout != null) {
            C16880lQ.LJIJ(relativeLayout, new ACListenerS47S0200000_13(this, mo49getActivity, 7));
        }
        C81091Vs7 c81091Vs7 = (C81091Vs7) _$_findCachedViewById(R.id.f12);
        if (c81091Vs7 != null) {
            c81091Vs7.setFirstReadyListener(new C76891UFr(this, bitmap, f, c56k));
        }
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, com.bytedance.android.live.design.resource.theme.LiveThemeAwareDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        LayoutInflater onGetLayoutInflater = super.onGetLayoutInflater(bundle);
        mo49getActivity();
        o.LJIIIIZZ(onGetLayoutInflater, "getLayoutInflater(\n     …      activity,\n        )");
        return onGetLayoutInflater;
    }

    public final Bitmap wl(Bitmap bitmap) {
        Bitmap bitmap2 = this.LJLJJL;
        if (bitmap != null) {
            Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
            new Canvas(createBitmap).drawBitmap(bitmap, new Matrix(), null);
            return createBitmap;
        }
        return bitmap2;
    }

    public final void xl(BZI bzi) {
        bzi.LJFF(String.valueOf(((C29374Bfu) B83.LIZ().LIZIZ()).getCurrentUserId()));
    }

    @Override // com.bytedance.android.livesdk.LiveDialogFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        List<Bitmap> list;
        List<Bitmap> arrayList;
        List<Bitmap> list2;
        UG0 ug0;
        List<Bitmap> list3;
        List<Uri> list4;
        Uri uri;
        List<String> list5;
        String str;
        Window window;
        Map<String, Object> map;
        List<Bitmap> list6;
        Bitmap bitmap;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        Integer LJI = C79045V0n.LJI(R.attr.cr, new ContextThemeWrapper(getContext(), R.style.ux));
        if (LJI != null) {
            i = LJI.intValue();
        } else {
            i = 0;
        }
        _$_findCachedViewById(R.id.krc).setBackgroundColor(i);
        _$_findCachedViewById(R.id.aot).setBackgroundColor(i);
        C76882UFi c76882UFi = this.LJLJI;
        if (c76882UFi == null || (list = c76882UFi.LJI) == null) {
            list = C61878OQg.INSTANCE;
        }
        this.LJLILLLLZI = list;
        this.LJLLI = new ArrayList(list.size());
        C76882UFi c76882UFi2 = this.LJLJI;
        Bitmap bitmap2 = null;
        if (c76882UFi2 != null && (list6 = c76882UFi2.LJI) != null) {
            ArrayList arrayList2 = new ArrayList(C32I.LJJL(list6, 10));
            for (Bitmap bitmap3 : list6) {
                if (bitmap3 != null) {
                    bitmap = bitmap3.copy(bitmap3.getConfig(), true);
                } else {
                    bitmap = null;
                }
                arrayList2.add(bitmap);
            }
            arrayList = ORZ.LLJILJILJ(arrayList2);
        } else {
            arrayList = new ArrayList<>();
        }
        this.LJLIL = arrayList;
        this.LJLLLLLL = SystemClock.elapsedRealtime();
        BZI LIZ = C28787BRn.LIZ("livesdk_sub_emote_edit_page_show");
        C76882UFi c76882UFi3 = this.LJLJI;
        if (c76882UFi3 != null && (map = c76882UFi3.LJ) != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                LIZ.LJIJJ(entry.getValue().toString(), entry.getKey());
            }
        }
        LIZ.LJJIIJZLJL();
        C61713OJx LIZ2 = C61712OJw.LIZ(this);
        LIZ2.LIZIZ.LJIIL();
        LIZ2.LIZJ();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.getDecorView().setFitsSystemWindows(false);
            window.setSoftInputMode(48);
            window.getDecorView().setSystemUiVisibility(1024);
        }
        ActivityC45651qj mo49getActivity = mo49getActivity();
        if (mo49getActivity != null) {
            new Rect(0, 0, C81184Vtc.LJ(mo49getActivity), C81184Vtc.LIZLLL(mo49getActivity));
            new SafeHandler(mo49getActivity);
            C78897Uxp.LJIILIIL(mo49getActivity, (ViewGroup) _$_findCachedViewById(R.id.cor));
        }
        if (getContext() != null) {
            this.LJLLILLLL = (int) B9K.LIZ(getContext(), 93.0f);
            this.LJLLJ = C81184Vtc.LJ(getContext());
            this.LJLLL = C81184Vtc.LJ(getContext());
            this.LJLLLL = C81184Vtc.LIZLLL(getContext());
            ((C6D9) _$_findCachedViewById(R.id.kg_)).LJ();
            UGS ugs = (UGS) _$_findCachedViewById(R.id.i24);
            ugs.LJLJJL = 0;
            ugs.LJLJJLL = 0.54545456f;
            ugs.LJLJJI = 0;
            ugs.LJLLJ = B9K.LIZ(ugs.getContext(), 8.0f);
            ugs.postDelayed(new ARunnableS49S0100000_13(this, 16), 5000L);
            ugs.addOnLayoutChangeListener(new IDCListenerS259S0100000_13(this, 1));
            ((C81091Vs7) _$_findCachedViewById(R.id.f12)).setEnableDoubleTap(false);
            C16880lQ.LJJII((LiveIconView) _$_findCachedViewById(R.id.auv), new ACListenerS33S0100000_13(this, 10));
            C16880lQ.LJJIII((C2A7) _$_findCachedViewById(R.id.avw), new ACListenerS33S0100000_13(this, 12));
            ((C6IQ) _$_findCachedViewById(R.id.l5b)).setTextStickerUpdateListener(new C76893UFt(this));
        }
        C76882UFi c76882UFi4 = this.LJLJI;
        if (c76882UFi4 != null && (ug0 = c76882UFi4.LIZLLL) != null) {
            int i2 = C76896UFw.LIZ[ug0.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        C76882UFi c76882UFi5 = this.LJLJI;
                        if (c76882UFi5 != null && (list5 = c76882UFi5.LJIIIIZZ) != null && (str = (String) ListProtector.get(list5, 0)) != null) {
                            W5F LJIIIIZZ = W5U.LJIIIIZZ(str);
                            LJIIIIZZ.getClass();
                            LJIIIIZZ.LIZJ = mo49getActivity();
                            LJIIIIZZ.LJIIIZ(new IDdS504S0100000_13(this, 3));
                        }
                    }
                } else {
                    C76882UFi c76882UFi6 = this.LJLJI;
                    if (c76882UFi6 != null && (list4 = c76882UFi6.LJII) != null && (uri = (Uri) ListProtector.get(list4, 0)) != null) {
                        W5F LJFF = W5U.LJFF(uri);
                        LJFF.LIZJ = mo49getActivity();
                        LJFF.LJIIIZ(new IDdS504S0100000_13(this, 2));
                    }
                }
            } else {
                C76882UFi c76882UFi7 = this.LJLJI;
                if (c76882UFi7 != null && (list3 = c76882UFi7.LJI) != null) {
                    bitmap2 = (Bitmap) ListProtector.get(list3, 0);
                }
                Al(bitmap2);
            }
            ARunnableS49S0100000_13 aRunnableS49S0100000_13 = new ARunnableS49S0100000_13(this, 15);
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.krc);
            recyclerView.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            Context context = recyclerView.getContext();
            o.LJIIIIZZ(context, "context");
            recyclerView.setAdapter(new BFO(context, this.LJLIL, new AqS175S0200000_13(this, aRunnableS49S0100000_13, 0)));
        }
        C76882UFi c76882UFi8 = this.LJLJI;
        if (c76882UFi8 != null && (list2 = c76882UFi8.LJI) != null) {
            bitmap2 = (Bitmap) ListProtector.get(list2, 0);
        }
        Al(bitmap2);
        ARunnableS49S0100000_13 aRunnableS49S0100000_132 = new ARunnableS49S0100000_13(this, 15);
        RecyclerView recyclerView2 = (RecyclerView) _$_findCachedViewById(R.id.krc);
        recyclerView2.getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        Context context2 = recyclerView2.getContext();
        o.LJIIIIZZ(context2, "context");
        recyclerView2.setAdapter(new BFO(context2, this.LJLIL, new AqS175S0200000_13(this, aRunnableS49S0100000_132, 0)));
    }

    public final Bitmap vl(C81091Vs7 c81091Vs7, Bitmap bitmap) {
        if (bitmap == null) {
            return bitmap;
        }
        RectF LIZJ = c81091Vs7.LIZJ(null);
        if (this.LJLL == null) {
            return bitmap;
        }
        float width = bitmap.getWidth() / LIZJ.width();
        float height = bitmap.getHeight() / LIZJ.height();
        int i = (int) ((r6.left - LIZJ.left) * width);
        int i2 = 0;
        if (i < 0) {
            i = 0;
        }
        int i3 = (int) ((r6.top - LIZJ.top) * height);
        if (i3 >= 0) {
            i2 = i3;
        }
        int width2 = (int) (r6.width() * width);
        int width3 = bitmap.getWidth() - i;
        if (width2 > width3) {
            width2 = width3;
        }
        int height2 = (int) (r6.height() * height);
        int height3 = bitmap.getHeight() - i2;
        if (height2 > height3) {
            height2 = height3;
        }
        try {
            return Bitmap.createBitmap(bitmap, i, i2, width2, height2);
        } catch (Exception unused) {
            return bitmap;
        }
    }
}
