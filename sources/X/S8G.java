package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.bytedance.assem.arch.core.UIAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.TemplateFieldProduct;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class S8G extends AbstractC65781Prl implements InterfaceC88471Ynr<UIAssem, TemplateFieldProduct, C76800UCe> {
    public static final S8G INSTANCE = new S8G();

    public S8G() {
        super(2);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(UIAssem selectSubscribe, TemplateFieldProduct templateFieldProduct) {
        View view;
        String str;
        View view2;
        View view3;
        int intValue;
        View tvProductNo;
        String valueOf;
        View view4;
        View view5;
        o.LJIIIZ(selectSubscribe, "$this$selectSubscribe");
        View view6 = null;
        SY4 fi = ((S8H) C8VC.LIZIZ(selectSubscribe, C65352Pkq.LIZ(S8H.class), null)).fi();
        if (templateFieldProduct != null && C78857UxB.LJJJIL(templateFieldProduct.productImage)) {
            View containerView = selectSubscribe.getContainerView();
            if (containerView != null) {
                view = containerView.findViewById(R.id.lxx);
            } else {
                view = null;
            }
            TextView textView = (TextView) view;
            String LJFF = C86V.LJFF(R.string.ui);
            if (LJFF != null) {
                str = ujb.o.LJJJJZ(LJFF, "{%d}", "1", false);
            } else {
                str = null;
            }
            textView.setText(str);
            View containerView2 = selectSubscribe.getContainerView();
            if (containerView2 != null) {
                view2 = containerView2.findViewById(R.id.lxw);
            } else {
                view2 = null;
            }
            ((TextView) view2).setText(C86V.LJFF(R.string.j2));
            Context context = selectSubscribe.getContainerView().getContext();
            o.LJIIIIZZ(context, "containerView.context");
            Integer LJI = C79045V0n.LJI(R.attr.gx, context);
            if (LJI != null) {
                int intValue2 = LJI.intValue();
                View containerView3 = selectSubscribe.getContainerView();
                if (containerView3 != null) {
                    view5 = containerView3.findViewById(R.id.lxx);
                } else {
                    view5 = null;
                }
                ((TextView) view5).setTextColor(intValue2);
            }
            if (C78857UxB.LJJJIL(templateFieldProduct.productOriginImage)) {
                W5F LJIIIIZZ = W5U.LJIIIIZZ(templateFieldProduct.productOriginImage);
                View containerView4 = selectSubscribe.getContainerView();
                if (containerView4 != null) {
                    view4 = containerView4.findViewById(R.id.ewn);
                } else {
                    view4 = null;
                }
                LJIIIIZZ.LJJIIJ = (SmartImageView) view4;
                LJIIIIZZ.LJJJIL = templateFieldProduct.productImage;
                C16880lQ.LLJJJ(LJIIIIZZ);
            } else {
                W5F LJIIIIZZ2 = W5U.LJIIIIZZ(templateFieldProduct.productImage);
                View containerView5 = selectSubscribe.getContainerView();
                if (containerView5 != null) {
                    view3 = containerView5.findViewById(R.id.ewn);
                } else {
                    view3 = null;
                }
                LJIIIIZZ2.LJJIIJ = (SmartImageView) view3;
                C16880lQ.LLJJJ(LJIIIIZZ2);
            }
            fi.setEnabled(true);
            try {
                String str2 = templateFieldProduct.productIndex;
                if (str2 != null) {
                    Integer valueOf2 = Integer.valueOf(CastIntegerProtector.parseInt(str2));
                    if (valueOf2 != null && (intValue = valueOf2.intValue()) > 0) {
                        View containerView6 = selectSubscribe.getContainerView();
                        if (containerView6 != null) {
                            tvProductNo = containerView6.findViewById(R.id.lxb);
                        } else {
                            tvProductNo = null;
                        }
                        o.LJIIIIZZ(tvProductNo, "tvProductNo");
                        OUP.LJJLIIIJ(tvProductNo);
                        View containerView7 = selectSubscribe.getContainerView();
                        if (containerView7 != null) {
                            view6 = containerView7.findViewById(R.id.lxb);
                        }
                        TextView textView2 = (TextView) view6;
                        if (intValue < 10) {
                            valueOf = C169696lJ.LIZIZ('0', intValue);
                        } else {
                            valueOf = String.valueOf(intValue);
                        }
                        textView2.setText(valueOf);
                        return;
                    }
                    return;
                }
                return;
            } catch (Throwable unused) {
                return;
            }
        }
        fi.setEnabled(false);
    }

    @Override // X.InterfaceC88471Ynr
    public /* bridge */ /* synthetic */ C76800UCe invoke(UIAssem uIAssem, TemplateFieldProduct templateFieldProduct) {
        invoke2(uIAssem, templateFieldProduct);
        return C76800UCe.LIZ;
    }
}
