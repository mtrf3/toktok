package X;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.services.HybridABInfoService;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.contentlanguage.api.LanguageApi;
import com.ss.android.ugc.aweme.services.RetrofitService;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.AXh, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class ViewOnClickListenerC26389AXh extends DialogC26391AXj implements View.OnClickListener, InterfaceC74242TBu {
    public C74240TBs LJLIL;
    public final String LJLILLLLZI;
    public final C26384AXc LJLJI;
    public final LanguageApi LJLJJI;
    public final ArrayList<String> LJLJJL;
    public long LJLJJLL;

    public final void LJFF() {
        if (this.LJLJJLL > 0) {
            long currentTimeMillis = System.currentTimeMillis() - this.LJLJJLL;
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
            c188727au.LJ(currentTimeMillis, "duration");
            c188727au.LIZLLL(this.LJLJJL.size(), "icon_load");
            Integer LIZIZ = HybridABInfoService.LIZJ().LIZIZ();
            if (LIZIZ != null) {
                c188727au.LIZLLL(LIZIZ.intValue(), "is_ab_backend_resp_received");
            }
            FMX.LJIIL("popup_duration", c188727au.LIZ);
            this.LJLJJLL = 0L;
        }
    }

    public final void LJ() {
        ArrayList<String> arrayList;
        float f;
        TextView textView = (TextView) findViewById(R.id.axo);
        C74240TBs c74240TBs = this.LJLIL;
        if (c74240TBs != null) {
            arrayList = c74240TBs.LJLJJI;
        } else {
            arrayList = null;
        }
        textView.setEnabled(!C79004UzY.LJJIFFI(arrayList));
        View findViewById = findViewById(R.id.axo);
        if (findViewById(R.id.axo).isEnabled()) {
            f = 1.0f;
        } else {
            f = 0.5f;
        }
        findViewById.setAlpha(f);
    }

    @Override // X.DialogC26391AXj
    public final void customerWidthAndHeight() {
        super.customerWidthAndHeight();
        this.mWidth = (int) KL2.LIZJ(getContext(), 280.0f);
        this.mHeight = (int) (KL2.LJIIIZ(getContext()) * 0.67d);
    }

    @Override // X.DialogC26391AXj, android.app.Dialog
    public final void onStart() {
        super.onStart();
        this.LJLJJLL = System.currentTimeMillis();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        super.onStop();
        LJFF();
    }

    @Override // X.InterfaceC74242TBu
    public final void LIZJ(String str) {
        LJ();
    }

    @Override // X.InterfaceC74242TBu
    public final void LIZLLL(String str) {
        if (!TextUtils.isEmpty(str) && !ORZ.LJLJJI(str, this.LJLJJL)) {
            ArrayList<String> arrayList = this.LJLJJL;
            o.LJI(str);
            arrayList.add(str);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ArrayList<String> arrayList;
        Integer num = null;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        }
        if (num == null) {
            return;
        }
        if (num.intValue() == R.id.avl) {
            C188727au c188727au = new C188727au();
            c188727au.LJIIIZ("enter_from", this.LJLILLLLZI);
            c188727au.LJIIIZ("language_type", "cancel");
            FMX.LJIIL("choose_content_language_popup", c188727au.LIZ);
            dismiss();
            return;
        }
        if (num.intValue() != R.id.axo) {
            return;
        }
        C74240TBs c74240TBs = this.LJLIL;
        if (c74240TBs == null || (arrayList = c74240TBs.LJLJJI) == null || C79004UzY.LJJIFFI(arrayList)) {
            C188727au c188727au2 = new C188727au();
            c188727au2.LJIIIZ("enter_from", this.LJLILLLLZI);
            c188727au2.LJIIIZ("language_type", "ok");
            c188727au2.LJIIIZ("click_type", "null");
            FMX.LJIIL("click_content_language_popup", c188727au2.LIZ);
            return;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = arrayList.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            sb.append(it.next());
            if (i != arrayList.size() - 1) {
                sb.append(",");
            }
            i = i2;
        }
        if (RBW.LJLLI.LJI()) {
            AbstractC73672Svk<BaseResponse> contentLanguage = this.LJLJJI.setContentLanguage("content_language", sb.toString(), 1);
            if (contentLanguage != null) {
                contentLanguage.LJJL(T16.LIZ()).LJJJ(C73969T1h.LIZIZ()).LIZ(new InterfaceC116954iR<BaseResponse>() { // from class: X.34A
                    @Override // X.InterfaceC116954iR
                    public final void onComplete() {
                    }

                    @Override // X.InterfaceC116954iR
                    public final void onError(Throwable e) {
                        o.LJIIIZ(e, "e");
                    }

                    @Override // X.InterfaceC116954iR
                    public final void onSubscribe(InterfaceC92693kP d) {
                        o.LJIIIZ(d, "d");
                    }

                    @Override // X.InterfaceC116954iR
                    public final void onNext(BaseResponse t) {
                        o.LJIIIZ(t, "t");
                    }
                });
            }
        } else {
            C26384AXc c26384AXc = this.LJLJI;
            String sb2 = sb.toString();
            o.LJIIIIZZ(sb2, "languageCode.toString()");
            c26384AXc.LIZJ(sb2);
        }
        C188727au c188727au3 = new C188727au();
        c188727au3.LJIIIZ("enter_from", this.LJLILLLLZI);
        c188727au3.LJIIIZ("language_type", sb.toString());
        FMX.LJIIL("choose_content_language_popup", c188727au3.LIZ);
        dismiss();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewOnClickListenerC26389AXh(Context context, String enterFrom) {
        super(context, R.style.a_2, 0, 0);
        o.LJIIIZ(context, "context");
        o.LJIIIZ(enterFrom, "enterFrom");
        this.LJLILLLLZI = enterFrom;
        this.LJLJI = new C26384AXc();
        this.LJLJJI = (LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin(false).createNewRetrofit(com.ss.android.ugc.aweme.app.api.Api.LIZ).create(LanguageApi.class);
        this.LJLJJL = new ArrayList<>();
        setContentView(R.layout.am8);
        setCanceledOnTouchOutside(false);
        setOnShowListener(new DialogInterfaceOnShowListenerC26390AXi(this));
        ((TextView) findViewById(R.id.title)).setText(C26392AXk.LIZ().getTitle());
        ((TextView) findViewById(R.id.desc)).setText(C26392AXk.LIZ().getText());
        C16880lQ.LJJJJI((TuxTextView) findViewById(R.id.axo), this);
        LJ();
        C16880lQ.LJJJ((TuxIconView) findViewById(R.id.avl), this);
        this.LJLIL = new C74240TBs(enterFrom, this);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.isn);
        getContext();
        recyclerView.setLayoutManager(new GridLayoutManager(2));
        ((RecyclerView) findViewById(R.id.isn)).setAdapter(this.LJLIL);
        ((RecyclerView) findViewById(R.id.isn)).LJII(new AbstractC030309z() { // from class: X.4YU
            @Override // X.AbstractC030309z
            public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.GridLayoutManager.LayoutParams");
                if (((C1BU) layoutParams).LJLIL % 2 != 0) {
                    outRect.left = C17N.LJIILL(4.0d);
                } else {
                    outRect.right = C17N.LJIILL(4.0d);
                }
                outRect.bottom = C17N.LJIILL(8.0d);
            }
        }, -1);
    }
}
