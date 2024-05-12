package com.ss.android.ugc.aweme.services;

import X.AbstractC65781Prl;
import X.C16880lQ;
import X.C17N;
import X.C76800UCe;
import X.InterfaceC65784Pro;
import X.InterfaceC88472Yns;
import X.MG6;
import X.ORZ;
import X.SY4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public final class NetworkStandardUIServiceImpl$largePanelStatusView$1$1 extends AbstractC65781Prl implements InterfaceC88472Yns<LinearLayout, C76800UCe> {
    public final /* synthetic */ String $buttonDesc;
    public final /* synthetic */ String $diagnosisBtnDesc;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> $diagnosisFunc;
    public final /* synthetic */ Runnable $retryFunc;
    public final /* synthetic */ String $scene;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkStandardUIServiceImpl$largePanelStatusView$1$1(String str, String str2, String str3, Runnable runnable, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        super(1);
        this.$buttonDesc = str;
        this.$scene = str2;
        this.$diagnosisBtnDesc = str3;
        this.$retryFunc = runnable;
        this.$diagnosisFunc = interfaceC65784Pro;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(LinearLayout it) {
        o.LJIIIZ(it, "it");
        Context context = it.getContext();
        o.LJIIIIZZ(context, "it.context");
        SY4 sy4 = new SY4(context, null, 6, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(C17N.LJIILL(240.0d), C17N.LJIILL(48.0d));
        marginLayoutParams.bottomMargin = C17N.LJIILL(8.0d);
        sy4.setLayoutParams(marginLayoutParams);
        sy4.setText(this.$buttonDesc);
        sy4.setButtonSize(3);
        sy4.LJJJ(16.0f);
        if (ORZ.LJLJJI(this.$scene, MG6.LIZLLL)) {
            sy4.setButtonVariant(1);
        }
        final Runnable runnable = this.$retryFunc;
        C16880lQ.LJJIZ(sy4, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$largePanelStatusView$1$1.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Runnable runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
        });
        Context context2 = it.getContext();
        o.LJIIIIZZ(context2, "it.context");
        SY4 sy42 = new SY4(context2, null, 6, 0);
        sy42.setLayoutParams(new ViewGroup.LayoutParams(C17N.LJIILL(240.0d), C17N.LJIILL(48.0d)));
        sy42.setText(this.$diagnosisBtnDesc);
        sy42.setButtonVariant(1);
        sy42.LJJJ(16.0f);
        sy42.setBackgroundColor(0);
        final InterfaceC65784Pro<C76800UCe> interfaceC65784Pro = this.$diagnosisFunc;
        C16880lQ.LJJIZ(sy42, new View.OnClickListener() { // from class: com.ss.android.ugc.aweme.services.NetworkStandardUIServiceImpl$largePanelStatusView$1$1.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                InterfaceC65784Pro<C76800UCe> interfaceC65784Pro2 = interfaceC65784Pro;
                if (interfaceC65784Pro2 != null) {
                    interfaceC65784Pro2.invoke();
                }
            }
        });
        it.addView(sy4);
        it.addView(sy42);
    }

    @Override // X.InterfaceC88472Yns
    public /* bridge */ /* synthetic */ C76800UCe invoke(LinearLayout linearLayout) {
        invoke2(linearLayout);
        return C76800UCe.LIZ;
    }
}
