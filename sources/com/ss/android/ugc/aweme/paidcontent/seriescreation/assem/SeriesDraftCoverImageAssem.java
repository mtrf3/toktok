package com.ss.android.ugc.aweme.paidcontent.seriescreation.assem;

import X.C214298b3;
import X.C221108m2;
import X.C249089q4;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C65776Prg;
import X.C78926UyI;
import X.C9BD;
import android.view.View;
import com.bytedance.assem.arch.view.UISlotAssem;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.paidcontent.seriescreation.viewmodel.SeriesDraftViewModel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AqS154S0100000_4;

/* loaded from: classes5.dex */
public final class SeriesDraftCoverImageAssem extends UISlotAssem {
    public TuxIconView LJLJLLL;
    public SmartImageView LJLL;
    public final C214298b3 LJLLI;
    public final C62822Ol8 LJLLILLLL;
    public final Map<Integer, View> LJLLJ = new LinkedHashMap();

    public final View _$_findCachedViewById(int i) {
        View findViewById;
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.LJLLJ;
        View view = (View) linkedHashMap.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View containerView = getContainerView();
        if (containerView == null || (findViewById = containerView.findViewById(i)) == null) {
            return null;
        }
        linkedHashMap.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.bytedance.assem.arch.view.UISlotAssem
    public final int v3() {
        return R.layout.aj_;
    }

    public SeriesDraftCoverImageAssem() {
        C9BD c9bd = C9BD.LIZ;
        C65776Prg LIZ = C65352Pkq.LIZ(SeriesDraftViewModel.class);
        this.LJLLI = C78926UyI.LJ(this, LIZ, c9bd, new AqS154S0100000_4(LIZ, 610), C249089q4.INSTANCE, null);
        this.LJLLILLLL = C221108m2.LIZIZ(new AqS154S0100000_4(this, 609));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00a4, code lost:
    
        if (r2 != null) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.assem.arch.core.UIAssem
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onViewCreated(android.view.View r12) {
        /*
            r11 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.o.LJIIIZ(r12, r0)
            r5 = r11
            super.onViewCreated(r12)
            X.Ol8 r0 = r5.LJLLILLLL
            java.lang.Object r4 = r0.getValue()
            X.9pB r4 = (X.InterfaceC248539pB) r4
            X.1qj r3 = X.C212428Vi.LIZ(r5)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1 = 0
            r0 = -1
            r4.initHeadUploadHelper(r3, r1, r0, r2)
            boolean r0 = X.C7VX.LIZ()
            if (r0 == 0) goto L41
            r0 = 2131365066(0x7f0a0cca, float:1.8349987E38)
            android.view.View r1 = r5._$_findCachedViewById(r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 42
            r1.setTuxFont(r0)
            r0 = 2131365065(0x7f0a0cc9, float:1.8349985E38)
            android.view.View r1 = r5._$_findCachedViewById(r0)
            com.bytedance.tux.input.TuxTextView r1 = (com.bytedance.tux.input.TuxTextView) r1
            r0 = 51
            r1.setTuxFont(r0)
        L41:
            android.view.View r1 = r5.getContainerView()
            r0 = 2131368577(0x7f0a1a81, float:1.8357108E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.tux.icon.TuxIconView r0 = (com.bytedance.tux.icon.TuxIconView) r0
            r5.LJLJLLL = r0
            android.view.View r1 = r5.getContainerView()
            r0 = 2131380035(0x7f0a4743, float:1.8380348E38)
            android.view.View r0 = r1.findViewById(r0)
            com.bytedance.lighten.loader.SmartImageView r0 = (com.bytedance.lighten.loader.SmartImageView) r0
            r5.LJLL = r0
            boolean r0 = X.C7VX.LIZ()
            if (r0 == 0) goto La2
            r0 = 2131373115(0x7f0a2c3b, float:1.8366312E38)
            android.view.View r2 = r5._$_findCachedViewById(r0)
            X.Sdn r2 = (X.C72559Sdn) r2
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            float r0 = X.C32151Nz.LJIIZILJ(r0)
            int r0 = X.O6R.LJJIIZ(r0)
            r2.setRadius(r0)
        L7e:
            Y.ACListenerS24S0100000_4 r1 = new Y.ACListenerS24S0100000_4
            r0 = 114(0x72, float:1.6E-43)
            r1.<init>(r5, r0)
            X.C16880lQ.LJIIJ(r1, r2)
        L88:
            X.8b3 r0 = r5.LJLLI
            java.lang.Object r6 = r0.getValue()
            com.bytedance.assem.arch.viewModel.AssemViewModel r6 = (com.bytedance.assem.arch.viewModel.AssemViewModel) r6
            X.9pv r7 = new X.TBT() { // from class: X.9pv
                static {
                    /*
                        X.9pv r0 = new X.9pv
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:X.9pv) X.9pv.LJLIL X.9pv
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C248999pv.<clinit>():void");
                }

                {
                    /*
                        r4 = this;
                        java.lang.Class<X.9pK> r3 = X.C248629pK.class
                        java.lang.String r2 = "getCoverImageUri()Lcom/ss/android/ugc/aweme/paidcontent/seriescreation/viewmodel/UploadedSeriesCoverImage;"
                        r1 = 0
                        java.lang.String r0 = "coverImageUri"
                        r4.<init>(r3, r0, r2, r1)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C248999pv.<init>():void");
                }

                @Override // X.TBT, X.TBZ, X.TBW
                public final java.lang.Object get(java.lang.Object r2) {
                    /*
                        r1 = this;
                        X.9pK r2 = (X.C248629pK) r2
                        X.9pD r0 = r2.LJLJL
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C248999pv.get(java.lang.Object):java.lang.Object");
                }
            }
            X.MCa r8 = X.C213688a4.LIZLLL()
            kotlin.jvm.internal.AqS186S0100000_4 r9 = new kotlin.jvm.internal.AqS186S0100000_4
            r0 = 161(0xa1, float:2.26E-43)
            r9.<init>(r5, r0)
            r10 = 4
            X.C8YN.LJII(r5, r6, r7, r8, r9, r10)
            return
        La2:
            com.bytedance.tux.icon.TuxIconView r2 = r5.LJLJLLL
            if (r2 == 0) goto L88
            goto L7e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.paidcontent.seriescreation.assem.SeriesDraftCoverImageAssem.onViewCreated(android.view.View):void");
    }
}
