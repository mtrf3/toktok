package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.RecReasonEntry;
import com.ss.android.ugc.aweme.feed.model.RecReasonsStruct;
import com.ss.android.ugc.aweme.share.base.model.BaseSharePackage;
import com.ss.android.ugc.aweme.share.improve.action.whythisvid.WhyThisVideoModel;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.AqS99S0300000_10;
import kotlin.jvm.internal.o;

/* renamed from: X.Oob, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C63037Oob implements InterfaceC62486Ofi {
    public final Aweme LJLIL;
    public final ActivityC45651qj LJLILLLLZI;
    public final String LJLJI;

    @Override // X.InterfaceC62486Ofi
    public final void LJ() {
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJFF() {
        return R.raw.icon_2pt_question_mark_circle_ltr;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJIIJJI() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJIJ() {
        return R.raw.icon_question_mark_circle_fill_ltr;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJI() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String LJJIFFI() {
        return "";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LJJII() {
        return R.string.tx5;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJIII(Context context, BaseSharePackage baseSharePackage) {
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean LJJIIJZLJL() {
        return false;
    }

    @Override // X.InterfaceC62486Ofi
    public final boolean enable() {
        return true;
    }

    @Override // X.InterfaceC62486Ofi
    public final String key() {
        return "why_this_video";
    }

    @Override // X.InterfaceC62486Ofi
    public final int LIZ() {
        return C62485Ofh.LIZIZ();
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC41317GJl LJIILIIL() {
        return EnumC41317GJl.ShareButton;
    }

    @Override // X.InterfaceC62486Ofi
    public final EnumC26273ASv LJIILLIIL() {
        return EnumC26273ASv.NORMAL;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIIZ(TextView textView) {
        C62485Ofh.LJ(this, textView);
    }

    @Override // X.InterfaceC62486Ofi
    public final void onClick(View view) {
        o.LJIIIZ(view, "view");
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZIZ(C62477OfZ c62477OfZ, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZ(this, c62477OfZ, baseSharePackage);
    }

    @Override // X.InterfaceC62486Ofi
    public final void LIZLLL(Context context, BaseSharePackage sharePackage) {
        RelativeLayout.LayoutParams layoutParams;
        o.LJIIIZ(context, "context");
        o.LJIIIZ(sharePackage, "sharePackage");
        RecReasonsStruct recReasonsStruct = this.LJLIL.getRecReasonsStruct();
        if (recReasonsStruct != null) {
            C63038Ooc.LIZ.getClass();
            WhyThisVideoModel whyThisVideoModel = (WhyThisVideoModel) C63038Ooc.LIZIZ.getValue();
            if (whyThisVideoModel != null) {
                String title = whyThisVideoModel.title;
                String body = whyThisVideoModel.body;
                String subBody = whyThisVideoModel.subBody;
                String buttonText = whyThisVideoModel.buttonText;
                String bizType = whyThisVideoModel.bizType;
                o.LJIIIZ(title, "title");
                o.LJIIIZ(body, "body");
                o.LJIIIZ(subBody, "subBody");
                o.LJIIIZ(buttonText, "buttonText");
                o.LJIIIZ(bizType, "bizType");
                WhyThisVideoModel whyThisVideoModel2 = new WhyThisVideoModel(title, body, subBody, buttonText, bizType);
                String title2 = recReasonsStruct.getTitle();
                if (title2 == null || title2.length() == 0) {
                    recReasonsStruct.setTitle(whyThisVideoModel2.title);
                }
                String buttonText2 = recReasonsStruct.getButtonText();
                if (buttonText2 == null || buttonText2.length() == 0) {
                    recReasonsStruct.setButtonText(whyThisVideoModel2.buttonText);
                }
                String bizType2 = recReasonsStruct.getBizType();
                if (bizType2 == null || bizType2.length() == 0) {
                    recReasonsStruct.setBizType(whyThisVideoModel2.bizType);
                }
                if (recReasonsStruct.getBody() == null) {
                    recReasonsStruct.setBody(whyThisVideoModel2.body);
                }
                if (recReasonsStruct.getSubBody() == null) {
                    recReasonsStruct.setSubBody(whyThisVideoModel2.subBody);
                }
            }
            OSZ[] oszArr = new OSZ[5];
            oszArr[0] = new OSZ("enter_from", "homepage_hot");
            String aid = this.LJLIL.getAid();
            String str = "";
            if (aid == null) {
                aid = "";
            }
            oszArr[1] = new OSZ("group_id", aid);
            oszArr[2] = new OSZ("author_id", this.LJLIL.getAuthorUid());
            oszArr[3] = new OSZ("panel_source", this.LJLJI);
            oszArr[4] = new OSZ("info", recReasonsStruct.getBizType());
            FMX.LJIIL("click_why_this_video", C113554cx.LJJL(oszArr));
            ActivityC45651qj activityC45651qj = this.LJLILLLLZI;
            FragmentManager supportFragmentManager = activityC45651qj.getSupportFragmentManager();
            o.LJIIIIZZ(supportFragmentManager, "activity.supportFragmentManager");
            AqS157S0200000_10 aqS157S0200000_10 = new AqS157S0200000_10(this, recReasonsStruct, 33);
            C26224AQy c26224AQy = new C26224AQy();
            String title3 = recReasonsStruct.getTitle();
            if (title3 == null) {
                title3 = activityC45651qj.getString(R.string.tx7);
                o.LJIIIIZZ(title3, "ctx.getString(this)");
            }
            c26224AQy.LJ = title3;
            ArrayList arrayList = new ArrayList();
            if (C78685UuP.LJJJZ(recReasonsStruct.getBody())) {
                String body2 = recReasonsStruct.getBody();
                if (body2 == null) {
                    body2 = "";
                }
                arrayList.add(new C26220AQu(body2, false));
            }
            if (C78685UuP.LJJJZ(recReasonsStruct.getSubBody())) {
                String subBody2 = recReasonsStruct.getSubBody();
                if (subBody2 == null) {
                    subBody2 = "";
                }
                arrayList.add(new C26220AQu(subBody2, false));
            }
            List<RecReasonEntry> reasons = recReasonsStruct.getReasons();
            ArrayList arrayList2 = new ArrayList();
            for (RecReasonEntry recReasonEntry : reasons) {
                if (C78685UuP.LJJJZ(recReasonEntry.getDesc())) {
                    arrayList2.add(recReasonEntry);
                }
            }
            ArrayList arrayList3 = new ArrayList(C32I.LJJL(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(new C26220AQu(((RecReasonEntry) it.next()).getDesc(), true));
            }
            arrayList.addAll(arrayList3);
            c26224AQy.LIZJ(ORZ.LLJI(arrayList));
            if (C78685UuP.LJJJZ(recReasonsStruct.getUrl()) && C78685UuP.LJJJZ(recReasonsStruct.getUrlText())) {
                RelativeLayout relativeLayout = new RelativeLayout(activityC45651qj);
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.topMargin = C7MY.LIZIZ(20);
                relativeLayout.setLayoutParams(marginLayoutParams);
                TuxTextView tuxTextView = new TuxTextView(activityC45651qj, null, 6, 0);
                tuxTextView.setMovementMethod(AnonymousClass898.LIZ);
                C72062SPy c72062SPy = new C72062SPy();
                String urlText = recReasonsStruct.getUrlText();
                if (urlText != null) {
                    str = urlText;
                }
                c72062SPy.LIZIZ = str;
                c72062SPy.LIZ = true;
                c72062SPy.LIZIZ(42);
                c72062SPy.LJ(2);
                c72062SPy.LJFF = new AqS99S0300000_10(activityC45651qj, recReasonsStruct, aqS157S0200000_10, 9);
                tuxTextView.setText(c72062SPy.LIZ(activityC45651qj));
                ViewGroup.LayoutParams layoutParams2 = tuxTextView.getLayoutParams();
                if (!(layoutParams2 instanceof RelativeLayout.LayoutParams) || (layoutParams = (RelativeLayout.LayoutParams) layoutParams2) == null) {
                    layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                }
                layoutParams.addRule(13);
                tuxTextView.setLayoutParams(layoutParams);
                relativeLayout.addView(tuxTextView);
                c26224AQy.LJIIJJI = relativeLayout;
            }
            c26224AQy.LJIILIIL = true;
            String buttonText3 = recReasonsStruct.getButtonText();
            ARA ara = ARA.LJLIL;
            c26224AQy.LJII = buttonText3;
            c26224AQy.LJIIIZ = ara;
            ASL LIZ = c26224AQy.LIZ();
            LIZ.LJI(0);
            LIZ.LIZ.show(supportFragmentManager, "why_this_video");
        }
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJJ(Context context, BaseSharePackage baseSharePackage) {
        C62485Ofh.LIZJ(context, baseSharePackage, this);
    }

    public C63037Oob(ActivityC45651qj activityC45651qj, String panelSource, Aweme aweme) {
        o.LJIIIZ(aweme, "aweme");
        o.LJIIIZ(panelSource, "panelSource");
        this.LJLIL = aweme;
        this.LJLILLLLZI = activityC45651qj;
        this.LJLJI = panelSource;
    }

    @Override // X.InterfaceC62486Ofi
    public final void LJIIZILJ(ImageView imageView, View view, int i) {
        C62485Ofh.LIZLLL(imageView, view);
    }
}
