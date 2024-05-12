package X;

import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.SizeChartTemplateItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateField;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldText;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.SizeChartTemplateEditViewModel;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S9I extends AbstractC65781Prl implements InterfaceC88472Yns<C71633S9l, C71633S9l> {
    public final /* synthetic */ SizeChartTemplateItem LJLIL;
    public final /* synthetic */ SizeChartTemplateEditViewModel LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ String LJLJJI;
    public final /* synthetic */ String LJLJJL;
    public final /* synthetic */ String LJLJJLL;
    public final /* synthetic */ String LJLJL;
    public final /* synthetic */ String LJLJLJ;
    public final /* synthetic */ String LJLJLLL;
    public final /* synthetic */ String LJLL;
    public final /* synthetic */ String LJLLI;
    public final /* synthetic */ String LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S9I(SizeChartTemplateItem sizeChartTemplateItem, SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        super(1);
        this.LJLIL = sizeChartTemplateItem;
        this.LJLILLLLZI = sizeChartTemplateEditViewModel;
        this.LJLJI = str;
        this.LJLJJI = str2;
        this.LJLJJL = str3;
        this.LJLJJLL = str4;
        this.LJLJL = str5;
        this.LJLJLJ = str6;
        this.LJLJLLL = str7;
        this.LJLL = str8;
        this.LJLLI = str9;
        this.LJLLILLLL = str10;
    }

    @Override // X.InterfaceC88472Yns
    public final C71633S9l invoke(C71633S9l setState) {
        String str;
        TemplateFieldData templateFieldData;
        TemplateFieldText templateFieldText;
        o.LJIIIZ(setState, "$this$setState");
        TemplateField templateField = (TemplateField) ORZ.LJLLLLLL(0, this.LJLIL.LJJLJLI());
        if (templateField == null || (templateFieldData = templateField.fieldData) == null || (templateFieldText = templateFieldData.fieldText) == null || (str = templateFieldText.content) == null) {
            str = "";
        }
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel = this.LJLILLLLZI;
        String str2 = this.LJLJI;
        String str3 = this.LJLJJI;
        sizeChartTemplateEditViewModel.getClass();
        boolean gv0 = SizeChartTemplateEditViewModel.gv0(str2, str3);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel2 = this.LJLILLLLZI;
        String str4 = this.LJLJJL;
        String str5 = this.LJLJJLL;
        sizeChartTemplateEditViewModel2.getClass();
        boolean gv02 = SizeChartTemplateEditViewModel.gv0(str4, str5);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel3 = this.LJLILLLLZI;
        String str6 = this.LJLJL;
        String str7 = this.LJLJLJ;
        sizeChartTemplateEditViewModel3.getClass();
        boolean gv03 = SizeChartTemplateEditViewModel.gv0(str6, str7);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel4 = this.LJLILLLLZI;
        String str8 = this.LJLJLLL;
        String str9 = this.LJLL;
        sizeChartTemplateEditViewModel4.getClass();
        boolean gv04 = SizeChartTemplateEditViewModel.gv0(str8, str9);
        SizeChartTemplateEditViewModel sizeChartTemplateEditViewModel5 = this.LJLILLLLZI;
        String str10 = this.LJLLI;
        String str11 = this.LJLLILLLL;
        sizeChartTemplateEditViewModel5.getClass();
        return C71633S9l.L(str, this.LJLJI, this.LJLJJI, this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, gv0, gv02, gv03, gv04, SizeChartTemplateEditViewModel.gv0(str10, str11));
    }
}
