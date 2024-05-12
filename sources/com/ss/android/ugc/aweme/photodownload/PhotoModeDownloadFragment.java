package com.ss.android.ugc.aweme.photodownload;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C16880lQ;
import X.C29S;
import X.C3C5;
import X.C42241Ghx;
import X.C43170Gww;
import X.C44896Hjg;
import X.C62387Oe7;
import X.C71897SJp;
import X.C76800UCe;
import X.C79045V0n;
import X.C90903hW;
import X.LTT;
import X.SY4;
import Y.ACListenerS27S0100000_7;
import Y.ACListenerS42S0200000_7;
import Y.AObserverS75S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.keva.Keva;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageInfo;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.zhiliaoapp.musically.R;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class PhotoModeDownloadFragment extends Fragment {
    public static final /* synthetic */ int LJLL = 0;
    public final Aweme LJLIL;
    public final C62387Oe7 LJLILLLLZI;
    public final String LJLJI;
    public final String LJLJJI;
    public final C43170Gww LJLJJL;
    public final String LJLJJLL;
    public PhotoSelectionViewModel LJLJL;
    public AObserverS75S0100000_7 LJLJLJ;
    public final Map<Integer, View> LJLJLLL = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLJLLL;
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

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        AObserverS75S0100000_7 aObserverS75S0100000_7;
        super.onDestroy();
        PhotoSelectionViewModel photoSelectionViewModel = this.LJLJL;
        if (photoSelectionViewModel != null && (aObserverS75S0100000_7 = this.LJLJLJ) != null) {
            photoSelectionViewModel.gv0().removeObserver(aObserverS75S0100000_7);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        ((LinkedHashMap) this.LJLJLLL).clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        View view;
        super.onActivityCreated(bundle);
        View view2 = getView();
        Object obj = null;
        if (view2 != null) {
            obj = view2.getParent();
        }
        if ((obj instanceof View) && (view = (View) obj) != null) {
            view.setBackgroundColor(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.LJLJLJ = new AObserverS75S0100000_7(this, 14);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        List<PhotoModeImageUrlModel> imageList;
        PhotoModeImageInfo photoModeImageInfo;
        List<PhotoModeImageUrlModel> imageList2;
        AObserverS75S0100000_7 aObserverS75S0100000_7;
        List<PhotoModeImageUrlModel> imageList3;
        o.LJIIIZ(view, "view");
        super.onViewCreated(view, bundle);
        PhotoModeImageInfo photoModeImageInfo2 = this.LJLIL.getPhotoModeImageInfo();
        int i = 0;
        if (photoModeImageInfo2 != null && (imageList = photoModeImageInfo2.getImageList()) != null && imageList.size() > 0) {
            ActivityC45651qj mo49getActivity = mo49getActivity();
            if (mo49getActivity != null) {
                PhotoSelectionViewModel photoSelectionViewModel = (PhotoSelectionViewModel) ViewModelProviders.of(mo49getActivity).get(PhotoSelectionViewModel.class);
                this.LJLJL = photoSelectionViewModel;
                if (photoSelectionViewModel != null) {
                    photoSelectionViewModel.gv0().setValue(new HashSet());
                } else {
                    o.LJIJI("photoSelectionViewModel");
                    throw null;
                }
            }
            ActivityC45651qj mo49getActivity2 = mo49getActivity();
            if (mo49getActivity2 != null) {
                LTT.LIZJ(mo49getActivity2);
            }
            TextView textView = (TextView) _$_findCachedViewById(R.id.gm5);
            textView.setText(textView.getContext().getResources().getText(R.string.tr9));
            Context context = textView.getContext();
            o.LJIIIIZZ(context, "context");
            Integer LJI = C79045V0n.LJI(this.LJLILLLLZI.LJII, context);
            if (LJI != null) {
                textView.setTextColor(LJI.intValue());
            }
            textView.setAlpha(this.LJLILLLLZI.LJIIIIZZ);
            textView.setVisibility(0);
            C16880lQ.LJJJ((TuxIconView) _$_findCachedViewById(R.id.cfw), new ACListenerS27S0100000_7(this, 105));
            RecyclerView recyclerView = (RecyclerView) _$_findCachedViewById(R.id.hok);
            mo49getActivity();
            recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
            Aweme aweme = this.LJLIL;
            PhotoSelectionViewModel photoSelectionViewModel2 = this.LJLJL;
            if (photoSelectionViewModel2 != null) {
                C42241Ghx c42241Ghx = new C42241Ghx(aweme, photoSelectionViewModel2);
                ((RecyclerView) _$_findCachedViewById(R.id.hok)).setAdapter(c42241Ghx);
                if (Keva.getRepo("download_photo_selection_keva").getBoolean("is_default_select_all", false)) {
                    ((C71897SJp) _$_findCachedViewById(R.id.jkz)).setChecked(true);
                    PhotoSelectionViewModel photoSelectionViewModel3 = this.LJLJL;
                    if (photoSelectionViewModel3 != null) {
                        PhotoModeImageInfo photoModeImageInfo3 = this.LJLIL.getPhotoModeImageInfo();
                        if (photoModeImageInfo3 != null && (imageList3 = photoModeImageInfo3.getImageList()) != null) {
                            i = imageList3.size();
                        }
                        photoSelectionViewModel3.hv0(i);
                    } else {
                        o.LJIJI("photoSelectionViewModel");
                        throw null;
                    }
                } else {
                    int i2 = C44896Hjg.LJIJ;
                    if (i2 >= 0 && (photoModeImageInfo = this.LJLIL.getPhotoModeImageInfo()) != null && (imageList2 = photoModeImageInfo.getImageList()) != null && i2 < imageList2.size()) {
                        PhotoSelectionViewModel photoSelectionViewModel4 = this.LJLJL;
                        if (photoSelectionViewModel4 != null) {
                            photoSelectionViewModel4.iv0(i2);
                        } else {
                            o.LJIJI("photoSelectionViewModel");
                            throw null;
                        }
                    }
                }
                C16880lQ.LJJJJI((TuxTextView) _$_findCachedViewById(R.id.jl0), new ACListenerS42S0200000_7(this, c42241Ghx, 30));
                C16880lQ.LJJJI((C71897SJp) _$_findCachedViewById(R.id.jkz), new ACListenerS42S0200000_7(this, c42241Ghx, 31));
                C16880lQ.LJJIZ((SY4) _$_findCachedViewById(R.id.jau), new ACListenerS27S0100000_7(this, 106));
                ActivityC45651qj mo49getActivity3 = mo49getActivity();
                if (mo49getActivity3 != null && (aObserverS75S0100000_7 = this.LJLJLJ) != null) {
                    PhotoSelectionViewModel photoSelectionViewModel5 = this.LJLJL;
                    if (photoSelectionViewModel5 != null) {
                        photoSelectionViewModel5.gv0().observe(mo49getActivity3, aObserverS75S0100000_7);
                        return;
                    } else {
                        o.LJIJI("photoSelectionViewModel");
                        throw null;
                    }
                }
                return;
            }
            o.LJIJI("photoSelectionViewModel");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        o.LJIIIZ(inflater, "inflater");
        View LLLLIILL = C16880lQ.LLLLIILL(inflater, R.layout.c1p, viewGroup, false);
        C29S c29s = null;
        if (!(LLLLIILL instanceof View)) {
            LLLLIILL = null;
        }
        if (LLLLIILL != null) {
            try {
                ViewTreeLifecycleOwner.set(LLLLIILL, getViewLifecycleOwner());
                ViewTreeViewModelStoreOwner.set(LLLLIILL, this);
                C10A.LIZIZ(LLLLIILL, this);
                ActivityC45651qj mo49getActivity = mo49getActivity();
                if (mo49getActivity instanceof C29S) {
                    c29s = (C29S) mo49getActivity;
                }
                C90903hW.LIZ(c29s);
            } catch (Throwable th) {
                C3C5.m7constructorimpl(C141335gf.LIZ(th));
            }
        }
        C3C5.m7constructorimpl(C76800UCe.LIZ);
        return LLLLIILL;
    }

    public PhotoModeDownloadFragment(Aweme aweme, C62387Oe7 c62387Oe7, String str, String str2, C43170Gww c43170Gww, String str3) {
        this.LJLIL = aweme;
        this.LJLILLLLZI = c62387Oe7;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = c43170Gww;
        this.LJLJJLL = str3;
    }
}
