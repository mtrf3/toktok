package X;

import Y.ACListenerS27S0100000_7;
import Y.ARunnableS11S0101000_7;
import Y.IDObjectS121S0200000_7;
import Y.IDTListenerS116S0100000_7;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.AnchorListManager;
import com.ss.android.ugc.aweme.commercialize.anchor.service.GetLeadsAnchorService;
import com.ss.android.ugc.aweme.ecommerce.anchor.service.ECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.shortvideo.model.AnchorPublishStruct;
import com.zhiliaoapp.musically.R;
import defpackage.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gsw, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class DialogC42922Gsw extends OOS {
    public static final /* synthetic */ int LJZI = 0;
    public final List<AnchorPublishStruct> LJLJLLL;
    public final LifecycleOwner LJLL;
    public View LJLLI;
    public RecyclerView LJLLILLLL;
    public View LJLLJ;
    public C26284ATg LJLLL;
    public EditText LJLLLL;
    public TuxIconView LJLLLLLL;
    public TuxTextView LJLZ;
    public HashMap<String, AnchorPublishStruct> LJZ;

    public final void LJJ() {
        Editable text;
        EditText editText = this.LJLLLL;
        if (editText != null && (text = editText.getText()) != null) {
            text.clear();
        }
        C26284ATg c26284ATg = this.LJLLL;
        if (c26284ATg != null) {
            c26284ATg.LJLLLLLL(this.LJLJLLL);
        }
        TuxIconView tuxIconView = this.LJLLLLLL;
        if (tuxIconView != null) {
            tuxIconView.setVisibility(8);
        }
        findViewById(R.id.h2f).setVisibility(8);
    }

    public final void LJJIFFI() {
        EditText editText = this.LJLLLL;
        if (editText != null) {
            editText.clearFocus();
            editText.setCursorVisible(false);
        }
        TuxTextView tuxTextView = this.LJLZ;
        if (tuxTextView != null) {
            tuxTextView.setVisibility(8);
        }
        LJJ();
        C9UE.LIZ(getContext(), this.LJLLJ);
    }

    public final void LJJII() {
        boolean z;
        for (AnchorPublishStruct anchorPublishStruct : this.LJLJLLL) {
            if (anchorPublishStruct.type == EnumC42934Gt8.GET_LEADS.getTYPE()) {
                int i = ((GetLeadsAnchorService) ServiceManager.get().getService(GetLeadsAnchorService.class)).LIZIZ;
                anchorPublishStruct.getLeadsAnchorState = i;
                if (i == 0) {
                    z = true;
                } else {
                    z = false;
                }
                anchorPublishStruct.enable = z;
            }
        }
        C26284ATg c26284ATg = this.LJLLL;
        if (c26284ATg != null) {
            c26284ATg.LJLLLLLL(this.LJLJLLL);
        }
    }

    @Override // X.C18Z, android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        C0A2 c0a2;
        Collection<AnchorPublishStruct> values;
        Collection values2;
        RecyclerView recyclerView = this.LJLLILLLL;
        String str = null;
        if (recyclerView != null) {
            c0a2 = recyclerView.getLayoutManager();
        } else {
            c0a2 = null;
        }
        o.LJII(c0a2, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        List<AnchorPublishStruct> subList = this.LJLJLLL.subList(0, ((LinearLayoutManager) c0a2).LLILLJJLI() + 1);
        ArrayList arrayList = new ArrayList();
        for (AnchorPublishStruct anchorPublishStruct : subList) {
            if (anchorPublishStruct.isNew) {
                arrayList.add(anchorPublishStruct);
            }
        }
        if (!arrayList.isEmpty()) {
            EnumC42929Gt3 enumC42929Gt3 = EnumC42929Gt3.TitleSeen;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnchorPublishStruct anchorPublishStruct2 = (AnchorPublishStruct) it.next();
                if (anchorPublishStruct2.isNew) {
                    arrayList2.add(new AnchorListManager.AnchorAddLinkImpression(enumC42929Gt3.getValue(), anchorPublishStruct2.type, anchorPublishStruct2.subtype));
                }
            }
            ((AnchorListManager.AnchorImpressionApi) AnchorListManager.LIZIZ.create(AnchorListManager.AnchorImpressionApi.class)).postAnchorImpressionReport(C27739Aud.LJI(arrayList2));
        }
        List<AnchorPublishStruct> list = this.LJLJLLL;
        C188727au c188727au = new C188727au();
        String curUserId = ((RBX) HG3.LJIILL()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c188727au.LJIIIZ("author_id", curUserId);
        java.util.Map LJI = AnchorListManager.LJI();
        if (LJI != null && (values2 = LJI.values()) != null) {
            str = ORZ.LLD(values2, ",", null, null, C42795Gqt.LJLIL, 30);
        }
        c188727au.LJIIIZ("origin_keys", str);
        if (list != null) {
            Iterator<AnchorPublishStruct> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    AnchorPublishStruct next = it2.next();
                    if (next.type == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || next.type == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || next.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                        break;
                    }
                } else {
                    java.util.Map LJI2 = AnchorListManager.LJI();
                    if (LJI2 != null && (values = LJI2.values()) != null) {
                        for (AnchorPublishStruct anchorPublishStruct3 : values) {
                            if (anchorPublishStruct3.type == EnumC42934Gt8.ANCHOR_SHOP_MIX.getTYPE() || anchorPublishStruct3.type == EnumC42934Gt8.ANCHOR_SHOP_WINDOW.getTYPE() || anchorPublishStruct3.type == EnumC42934Gt8.ANCHOR_SHOP_LINK.getTYPE()) {
                                IECommerceAnchorService LJJJJI = ECommerceAnchorService.LJJJJI();
                                java.util.Map<String, String> map = c188727au.LIZ;
                                o.LJIIIIZZ(map, "eventMapBuilder.builder()");
                                LJJJJI.LJJIIJZLJL(2001, C113554cx.LJJLIL(map));
                                break;
                            }
                        }
                    }
                }
            }
        }
        LJJIFFI();
        LJJ();
        super.dismiss();
    }

    @Override // android.app.Dialog
    public final void show() {
        setOnShowListener(new DialogInterfaceOnShowListenerC42927Gt1(this));
        if (new C03880Dg(2).LIZJ(300000, "com/google/android/material/bottomsheet/BottomSheetDialog", "show", this, new Object[0], "void", new C65300Pk0(false, "()V", "1944536909738285537")).LIZ) {
            return;
        }
        super.show();
    }

    public static String LJJI(AnchorPublishStruct anchor) {
        o.LJIIIZ(anchor, "anchor");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(anchor.type);
        LIZ.append('(');
        return q.LIZIZ(LIZ, anchor.subtype, ')', LIZ);
    }

    /* JADX WARN: Type inference failed for: r0v25, types: [T, X.10H] */
    @Override // X.OOS, X.C18Z, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        int i;
        View findViewById;
        super.onCreate(bundle);
        setContentView(R.layout.bhz);
        this.LJLLI = findViewById(R.id.f0j);
        this.LJLLILLLL = (RecyclerView) findViewById(R.id.a3t);
        this.LJLLJ = findViewById(R.id.j71);
        this.LJLLLL = (EditText) findViewById(R.id.czx);
        this.LJLLLLLL = (TuxIconView) findViewById(R.id.avi);
        this.LJLZ = (TuxTextView) findViewById(R.id.lzm);
        EditText editText = this.LJLLLL;
        if (editText != null) {
            editText.setHint(C16880lQ.LLLLL(getContext()).getString(R.string.qbb));
        }
        if (this.LJLJLLL.size() < 6 && (findViewById = findViewById(R.id.a3x)) != null) {
            findViewById.setVisibility(8);
        }
        this.LJZ = new HashMap<>();
        for (AnchorPublishStruct anchorPublishStruct : this.LJLJLLL) {
            HashMap<String, AnchorPublishStruct> hashMap = this.LJZ;
            if (hashMap != null) {
                hashMap.put(LJJI(anchorPublishStruct), anchorPublishStruct);
            }
        }
        EditText editText2 = this.LJLLLL;
        if (editText2 != null) {
            editText2.setOnTouchListener(new IDTListenerS116S0100000_7(this, 8));
        }
        View view = this.LJLLJ;
        if (view != null) {
            view.setOnTouchListener(new IDTListenerS116S0100000_7(this, 9));
        }
        TuxIconView tuxIconView = this.LJLLLLLL;
        if (tuxIconView != null) {
            C16880lQ.LJJJ(tuxIconView, new ACListenerS27S0100000_7(this, 107));
        }
        TuxTextView tuxTextView = this.LJLZ;
        if (tuxTextView != null) {
            C16880lQ.LJJJJI(tuxTextView, new ACListenerS27S0100000_7(this, 108));
        }
        C68322mC c68322mC = new C68322mC();
        c68322mC.element = new C10H();
        EditText editText3 = this.LJLLLL;
        if (editText3 != null) {
            editText3.addTextChangedListener(new IDObjectS121S0200000_7(c68322mC, this, 2));
        }
        RecyclerView recyclerView = this.LJLLILLLL;
        if (recyclerView != null) {
            ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
            o.LJII(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            recyclerView.setLayoutParams(layoutParams);
        }
        int LJIIIZ = KL2.LJIIIZ(getContext());
        Context context = getContext();
        o.LJIIIIZZ(context, "context");
        int LJJJJLI = LJIIIZ - C63081OpJ.LJJJJLI(context);
        Window window = getWindow();
        if (window != null) {
            if (LJJJJLI == 0) {
                i = -1;
            } else {
                i = LJJJJLI;
            }
            window.setLayout(-1, i);
            window.setGravity(80);
            Window window2 = getWindow();
            o.LJI(window2);
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.gravity = 80;
            Window window3 = getWindow();
            o.LJI(window3);
            window3.setAttributes(attributes);
            setCanceledOnTouchOutside(true);
        }
        RecyclerView recyclerView2 = this.LJLLILLLL;
        if (recyclerView2 != null) {
            recyclerView2.post(new ARunnableS11S0101000_7(LJJJJLI, this, 14));
        }
        RecyclerView recyclerView3 = this.LJLLILLLL;
        if (recyclerView3 != null) {
            getContext();
            recyclerView3.setLayoutManager(new LinearLayoutManager());
        }
        C26284ATg c26284ATg = new C26284ATg(this.LJLL, this.LJLJLLL);
        this.LJLLL = c26284ATg;
        RecyclerView recyclerView4 = this.LJLLILLLL;
        if (recyclerView4 != null) {
            recyclerView4.setAdapter(c26284ATg);
        }
        View view2 = this.LJLLI;
        if (view2 != null) {
            C16880lQ.LJIIJ(new ACListenerS27S0100000_7(this, 109), view2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogC42922Gsw(Context context, LifecycleOwner lifecycleOwner, List anchorList) {
        super(context, R.style.a6t);
        o.LJIIIZ(anchorList, "anchorList");
        this.LJLJLLL = anchorList;
        this.LJLL = lifecycleOwner;
    }
}
