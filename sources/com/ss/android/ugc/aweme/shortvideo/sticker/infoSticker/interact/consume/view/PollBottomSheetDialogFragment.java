package com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.view;

import X.ActivityC45651qj;
import X.C10A;
import X.C141335gf;
import X.C141415gn;
import X.C16880lQ;
import X.C245649kW;
import X.C29S;
import X.C3C5;
import X.C67981Qm9;
import X.C74198TAc;
import X.C76800UCe;
import X.C77123UOp;
import X.C78496UrM;
import X.C80261Vej;
import X.C90903hW;
import X.DialogInterfaceOnShowListenerC74196TAa;
import X.InterfaceC74204TAi;
import X.InterfaceC86436Xw8;
import X.SGT;
import X.VW7;
import Y.ACListenerS27S0100000_7;
import Y.ARunnableS43S0100000_7;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialogFragment;
import com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment;
import com.ss.android.ugc.aweme.sticker.data.PollStruct;
import com.zhiliaoapp.musically.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class PollBottomSheetDialogFragment extends ViewPagerBottomSheetDialogFragment {
    public static final /* synthetic */ int LJLL = 0;
    public View LJLIL;
    public C80261Vej LJLILLLLZI;
    public VW7 LJLJI;
    public SGT LJLJJI;
    public TextView LJLJJL;
    public ImageView LJLJJLL;
    public PollStruct LJLJL;
    public C74198TAc LJLJLJ;
    public InterfaceC74204TAi LJLJLLL;

    public PollBottomSheetDialogFragment() {
        new LinkedHashMap();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        super.onCreate(bundle);
        setStyle(0, R.style.a8r);
        Bundle arguments = getArguments();
        if (arguments != null) {
            serializable = arguments.getSerializable("key_poll");
        } else {
            serializable = null;
        }
        this.LJLJL = (PollStruct) serializable;
    }

    @Override // com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.dialog.ViewPagerBottomSheetDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.appcompat.app.AppCompatDialogFragment, androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnShowListener(new DialogInterfaceOnShowListenerC74196TAa(this));
        return onCreateDialog;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialog) {
        C245649kW c245649kW;
        InterfaceC86436Xw8 interfaceC86436Xw8;
        o.LJIIIZ(dialog, "dialog");
        super.onDismiss(dialog);
        C74198TAc c74198TAc = this.LJLJLJ;
        if (c74198TAc != null && (c245649kW = c74198TAc.LIZ.LJLJJI) != null && (interfaceC86436Xw8 = c245649kW.LJIILL) != null) {
            interfaceC86436Xw8.LIZLLL();
        }
    }

    @Override // androidx.fragment.app.DialogFragment
    public final void show(FragmentManager manager, String str) {
        o.LJIIIZ(manager, "manager");
        try {
            super.show(manager, str);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        long j;
        List<PollStruct.OptionsBean> options;
        PollStruct.OptionsBean optionsBean;
        List<PollStruct.OptionsBean> options2;
        PollStruct.OptionsBean optionsBean2;
        View LIZIZ = C78496UrM.LIZIZ(layoutInflater, "inflater", layoutInflater, R.layout.dt7, viewGroup, false, "inflater.inflate(R.layou…dialog, container, false)");
        this.LJLIL = LIZIZ;
        this.LJLILLLLZI = (C80261Vej) LIZIZ.findViewById(R.id.kzb);
        View view = this.LJLIL;
        C29S c29s = null;
        if (view != null) {
            this.LJLJI = (VW7) view.findViewById(R.id.ncx);
            View view2 = this.LJLIL;
            if (view2 != null) {
                this.LJLJJL = (TextView) view2.findViewById(R.id.title);
                View view3 = this.LJLIL;
                if (view3 != null) {
                    this.LJLJJLL = (ImageView) view3.findViewById(R.id.f0h);
                    FragmentManager childFragmentManager = getChildFragmentManager();
                    o.LJIIIIZZ(childFragmentManager, "childFragmentManager");
                    SGT sgt = new SGT(childFragmentManager);
                    this.LJLJJI = sgt;
                    List<Fragment> list = sgt.LJLJJLL;
                    PollStruct pollStruct = this.LJLJL;
                    Bundle LIZ = C141415gn.LIZ("key_state", 0);
                    if (pollStruct != null) {
                        LIZ.putSerializable("key_poll", pollStruct);
                    }
                    PollDetailFragment pollDetailFragment = new PollDetailFragment();
                    pollDetailFragment.setArguments(LIZ);
                    ((ArrayList) list).add(pollDetailFragment);
                    SGT sgt2 = this.LJLJJI;
                    o.LJI(sgt2);
                    List<Fragment> list2 = sgt2.LJLJJLL;
                    PollStruct pollStruct2 = this.LJLJL;
                    Bundle LIZ2 = C141415gn.LIZ("key_state", 1);
                    if (pollStruct2 != null) {
                        LIZ2.putSerializable("key_poll", pollStruct2);
                    }
                    PollDetailFragment pollDetailFragment2 = new PollDetailFragment();
                    pollDetailFragment2.setArguments(LIZ2);
                    ((ArrayList) list2).add(pollDetailFragment2);
                    SGT sgt3 = this.LJLJJI;
                    o.LJI(sgt3);
                    Object obj = ListProtector.get(sgt3.LJLJJLL, 0);
                    o.LJII(obj, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
                    ((PollDetailFragment) obj).LJLJLJ = this.LJLJLLL;
                    SGT sgt4 = this.LJLJJI;
                    o.LJI(sgt4);
                    Object obj2 = ListProtector.get(sgt4.LJLJJLL, 1);
                    o.LJII(obj2, "null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.fragment.PollDetailFragment");
                    ((PollDetailFragment) obj2).LJLJLJ = this.LJLJLLL;
                    VW7 vw7 = this.LJLJI;
                    if (vw7 != null) {
                        vw7.setPagingEnable(false);
                    }
                    VW7 vw72 = this.LJLJI;
                    if (vw72 != null) {
                        vw72.setAdapter(this.LJLJJI);
                    }
                    C80261Vej c80261Vej = this.LJLILLLLZI;
                    if (c80261Vej != null) {
                        c80261Vej.post(new ARunnableS43S0100000_7(this, 44));
                    }
                    PollStruct pollStruct3 = this.LJLJL;
                    long j2 = 0;
                    if (pollStruct3 != null && (options2 = pollStruct3.getOptions()) != null && (optionsBean2 = (PollStruct.OptionsBean) ListProtector.get(options2, 0)) != null) {
                        j = optionsBean2.getPollCount();
                    } else {
                        j = 0;
                    }
                    PollStruct pollStruct4 = this.LJLJL;
                    if (pollStruct4 != null && (options = pollStruct4.getOptions()) != null && (optionsBean = (PollStruct.OptionsBean) ListProtector.get(options, 1)) != null) {
                        j2 = optionsBean.getPollCount();
                    }
                    String LJJIIJ = C77123UOp.LJJIIJ(j + j2);
                    TextView textView = this.LJLJJL;
                    if (textView != null) {
                        String string = getResources().getString(R.string.tt8);
                        o.LJIIIIZZ(string, "resources.getString(R.string.vote_total)");
                        C67981Qm9.LIZIZ(new Object[]{LJJIIJ}, 1, string, "format(format, *args)", textView);
                    }
                    ImageView imageView = this.LJLJJLL;
                    if (imageView != null) {
                        C16880lQ.LJIILLIIL(imageView, new ACListenerS27S0100000_7(this, 49));
                    }
                    View view4 = this.LJLIL;
                    if (view4 != null) {
                        try {
                            ViewTreeLifecycleOwner.set(view4, getViewLifecycleOwner());
                            ViewTreeViewModelStoreOwner.set(view4, this);
                            C10A.LIZIZ(view4, this);
                            ActivityC45651qj mo49getActivity = mo49getActivity();
                            if (mo49getActivity instanceof C29S) {
                                c29s = (C29S) mo49getActivity;
                            }
                            C90903hW.LIZ(c29s);
                            C3C5.m7constructorimpl(C76800UCe.LIZ);
                        } catch (Throwable th) {
                            C3C5.m7constructorimpl(C141335gf.LIZ(th));
                        }
                        return view4;
                    }
                    o.LJIJI("rootView");
                    throw null;
                }
                o.LJIJI("rootView");
                throw null;
            }
            o.LJIJI("rootView");
            throw null;
        }
        o.LJIJI("rootView");
        throw null;
    }
}
