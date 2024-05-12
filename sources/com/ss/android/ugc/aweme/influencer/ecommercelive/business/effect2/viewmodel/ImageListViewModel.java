package com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel;

import X.A2G;
import X.C33Q;
import X.C35517Dwn;
import X.C35519Dwp;
import X.C71533S5p;
import X.C71562S6s;
import X.C78555UsJ;
import X.C86393XvR;
import X.C8HZ;
import X.InterfaceC07990Tb;
import X.InterfaceC67352kd;
import X.S5G;
import X.S5I;
import X.S65;
import X.S6F;
import X.S6S;
import X.X1D;
import X.XKQ;
import X.XKS;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ext_power_list.AssemListViewModel;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData;
import com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadConfigData;
import com.ss.android.ugc.aweme.live.LiveOuterService;
import com.ss.bduploader.BDImageXUploader;
import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class ImageListViewModel extends AssemListViewModel<S6F, ImageItem, Integer> {
    public static final /* synthetic */ int LJLJLLL = 0;
    public final C71533S5p LJLIL = new C71533S5p();
    public final C35519Dwp LJLILLLLZI = new C35519Dwp();
    public final InterfaceC07990Tb LJLJI;
    public final C71562S6s LJLJJI;
    public S5I LJLJJL;
    public final HashSet<String> LJLJJLL;
    public XKQ LJLJL;
    public long LJLJLJ;

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final C33Q defaultState() {
        return new S6F(0);
    }

    public ImageListViewModel() {
        InterfaceC07990Tb interfaceC07990Tb;
        C86393XvR LJJIJIL = LiveOuterService.LJJJLL().LJJIJIL();
        if (LJJIJIL != null) {
            interfaceC07990Tb = LJJIJIL.LJJIJIL();
        } else {
            interfaceC07990Tb = null;
        }
        this.LJLJI = interfaceC07990Tb;
        this.LJLJJI = new C71562S6s();
        this.LJLJJLL = new HashSet<>();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:13)(2:10|11))(3:23|24|(1:26))|14|(1:20)(2:18|19)))|28|6|7|(0)(0)|14|(2:16|20)(1:21)) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object hv0(X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.UploadConfigData> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.S69
            if (r0 == 0) goto L1f
            r5 = r7
            X.S69 r5 = (X.S69) r5
            int r2 = r5.LJLJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L1f
            int r2 = r2 - r1
            r5.LJLJI = r2
        L12:
            java.lang.Object r4 = r5.LJLIL
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r1 = r5.LJLJI
            r0 = 0
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            goto L41
        L1f:
            X.S69 r5 = new X.S69
            r5.<init>(r6, r7)
            goto L12
        L25:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2d:
            X.C141335gf.LIZJ(r4)
            X.S5p r1 = r6.LJLIL     // Catch: java.lang.Throwable -> L47
            X.S5q r1 = r1.LIZIZ     // Catch: java.lang.Throwable -> L47
            r5.LJLJI = r2     // Catch: java.lang.Throwable -> L47
            X.S5p r1 = r1.LJLIL     // Catch: java.lang.Throwable -> L47
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.repo.BillboardNetApi r1 = r1.LIZ     // Catch: java.lang.Throwable -> L47
            java.lang.Object r4 = r1.getUploadConfig(r5)     // Catch: java.lang.Throwable -> L47
            if (r4 != r3) goto L44
            return r3
        L41:
            X.C141335gf.LIZJ(r4)     // Catch: java.lang.Throwable -> L47
        L44:
            X.Pbt r4 = (X.C64797Pbt) r4     // Catch: java.lang.Throwable -> L47
            goto L48
        L47:
            r4 = r0
        L48:
            if (r4 == 0) goto L52
            T r1 = r4.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r1 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r1
            if (r1 == 0) goto L52
            T r0 = r1.data
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel.hv0(X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemSingleListViewModel
    public final void newState(C8HZ<ImageItem> newListState) {
        o.LJIIIZ(newListState, "newListState");
        setState(new AqS178S0100000_12(newListState, (C8HZ<ImageItem>) 224));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        if (r4 == null) goto L19;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    @Override // com.bytedance.ext_power_list.AssemListViewModel
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object onRefresh(X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.S66
            if (r0 == 0) goto L68
            r5 = r7
            X.S66 r5 = (X.S66) r5
            int r2 = r5.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.LJLJJI = r2
        L12:
            java.lang.Object r4 = r5.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r5.LJLJJI
            r2 = 1
            if (r0 == 0) goto L40
            if (r0 != r2) goto L9e
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel r2 = r5.LJLIL
            X.C141335gf.LIZJ(r4)
        L22:
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData r4 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData) r4
            if (r4 == 0) goto L2a
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem> r3 = r4.imageList
            if (r3 != 0) goto L2e
        L2a:
            X.OQg r3 = X.C61878OQg.INSTANCE
            if (r4 == 0) goto L34
        L2e:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L6e
        L34:
            X.S64 r0 = X.S64.LJLIL
            r2.setState(r0)
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        L40:
            X.C141335gf.LIZJ(r4)
            X.S5I r0 = r6.LJLJJL
            if (r0 == 0) goto L51
            X.S6S r0 = r0.Rj()
            if (r0 == 0) goto L51
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData r0 = r0.LJLILLLLZI
            if (r0 != 0) goto L58
        L51:
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        L58:
            java.lang.String r1 = r0.authorId
            r5.LJLIL = r6
            r5.LJLJJI = r2
            r0 = 0
            java.lang.Object r4 = r6.gv0(r1, r0, r5)
            if (r4 != r3) goto L66
            return r3
        L66:
            r2 = r6
            goto L22
        L68:
            X.S66 r5 = new X.S66
            r5.<init>(r6, r7)
            goto L12
        L6e:
            kotlin.jvm.internal.AqS178S0100000_12 r1 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 225(0xe1, float:3.15E-43)
            r1.<init>(r4, r0)
            r2.setState(r1)
            int r1 = r3.size()
            int r0 = r4.total
            if (r1 < r0) goto L8a
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r3)
        L89:
            return r0
        L8a:
            X.A2F r2 = X.A2G.LIZ
            int r0 = r3.size()
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r0)
            r2.getClass()
            r0 = 0
            X.A2V r0 = X.A2F.LIZLLL(r0, r1, r3)
            goto L89
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel.onRefresh(X.2kd):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object iv0(int r7, X.InterfaceC67352kd<? super X.A2G<java.lang.Integer>> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof X.S68
            if (r0 == 0) goto L5e
            r4 = r8
            X.S68 r4 = (X.S68) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L5e
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r3 = r4.LJLILLLLZI
            X.NAu r2 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 1
            if (r0 == 0) goto L2d
            if (r0 != r1) goto L9e
            int r5 = r4.LJLIL
            X.C141335gf.LIZJ(r3)
        L22:
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData r3 = (com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData) r3
            if (r3 != 0) goto L64
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        L2d:
            X.C141335gf.LIZJ(r3)
            java.util.List r0 = r6.listGetAll()
            if (r0 == 0) goto L4f
            int r5 = r0.size()
        L3a:
            X.S5I r0 = r6.LJLJJL
            if (r0 == 0) goto L48
            X.S6S r0 = r0.Rj()
            if (r0 == 0) goto L48
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.RootData r0 = r0.LJLILLLLZI
            if (r0 != 0) goto L51
        L48:
            X.A2F r0 = X.A2G.LIZ
            X.A2H r0 = X.A2F.LIZIZ(r0)
            return r0
        L4f:
            r5 = 0
            goto L3a
        L51:
            java.lang.String r0 = r0.authorId
            r4.LJLIL = r5
            r4.LJLJJI = r1
            java.lang.Object r3 = r6.gv0(r0, r5, r4)
            if (r3 != r2) goto L22
            return r2
        L5e:
            X.S68 r4 = new X.S68
            r4.<init>(r6, r8)
            goto L12
        L64:
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem> r2 = r3.imageList
            if (r2 != 0) goto L6a
            X.OQg r2 = X.C61878OQg.INSTANCE
        L6a:
            int r1 = r2.size()
            int r1 = r1 + r5
            int r0 = r3.total
            if (r1 < r0) goto L7d
            X.A2F r0 = X.A2G.LIZ
            r0.getClass()
            X.A2H r0 = X.A2F.LIZ(r2)
        L7c:
            return r0
        L7d:
            java.util.List<com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageItem> r4 = r3.imageList
            if (r4 != 0) goto L83
            X.OQg r4 = X.C61878OQg.INSTANCE
        L83:
            X.A2F r3 = X.A2G.LIZ
            int r0 = r5 + (-1)
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            int r1 = r4.size()
            int r1 = r1 + r5
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3.getClass()
            X.A2V r0 = X.A2F.LIZLLL(r2, r0, r4)
            goto L7c
        L9e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel.iv0(int, X.2kd):java.lang.Object");
    }

    @Override // com.bytedance.ext_power_list.AssemListViewModel
    public final /* bridge */ /* synthetic */ Object onLoadMore(Integer num, InterfaceC67352kd<? super A2G<Integer>> interfaceC67352kd) {
        return iv0(num.intValue(), interfaceC67352kd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object gv0(java.lang.String r7, int r8, X.InterfaceC67352kd<? super com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.model.ImageListData> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.S67
            if (r0 == 0) goto L21
            r4 = r9
            X.S67 r4 = (X.S67) r4
            int r2 = r4.LJLJJI
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r4.LJLJJI = r2
        L12:
            java.lang.Object r5 = r4.LJLILLLLZI
            X.NAu r3 = X.EnumC58928NAu.COROUTINE_SUSPENDED
            int r0 = r4.LJLJJI
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L2f
            if (r0 != r2) goto L27
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel r4 = r4.LJLIL
            goto L4e
        L21:
            X.S67 r4 = new X.S67
            r4.<init>(r6, r9)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C141335gf.LIZJ(r5)
            X.S6A r0 = X.S6A.LJLIL
            r6.setState(r0)
            X.S5p r0 = r6.LJLIL     // Catch: java.lang.Throwable -> L54
            X.S5q r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> L54
            r4.LJLIL = r6     // Catch: java.lang.Throwable -> L54
            r4.LJLJJI = r2     // Catch: java.lang.Throwable -> L54
            X.S5p r0 = r0.LJLIL     // Catch: java.lang.Throwable -> L54
            com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.repo.BillboardNetApi r2 = r0.LIZ     // Catch: java.lang.Throwable -> L54
            r0 = 8
            java.lang.Object r5 = r2.getBillboardImages(r7, r0, r8, r4)     // Catch: java.lang.Throwable -> L54
            if (r5 != r3) goto L4c
            return r3
        L4c:
            r4 = r6
            goto L51
        L4e:
            X.C141335gf.LIZJ(r5)     // Catch: java.lang.Throwable -> L55
        L51:
            X.Pbt r5 = (X.C64797Pbt) r5     // Catch: java.lang.Throwable -> L55
            goto L56
        L54:
            r4 = r6
        L55:
            r5 = r1
        L56:
            if (r5 == 0) goto L5e
            boolean r0 = r5.LIZIZ()
            if (r0 != 0) goto L7f
        L5e:
            X.3C1 r3 = new X.3C1
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.String r0 = "fetch image list failed"
            r2.<init>(r0)
            r3.<init>(r2)
        L6a:
            kotlin.jvm.internal.AqS178S0100000_12 r2 = new kotlin.jvm.internal.AqS178S0100000_12
            r0 = 223(0xdf, float:3.12E-43)
            r2.<init>(r3, r0)
            r4.setState(r2)
            if (r5 == 0) goto L7e
            T r0 = r5.LIZIZ
            com.ss.android.ugc.aweme.ecommerce.api.model.Response r0 = (com.ss.android.ugc.aweme.ecommerce.api.model.Response) r0
            if (r0 == 0) goto L7e
            T r1 = r0.data
        L7e:
            return r1
        L7f:
            X.2tb r3 = new X.2tb
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.<init>(r0)
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.influencer.ecommercelive.business.effect2.viewmodel.ImageListViewModel.gv0(java.lang.String, int, X.2kd):java.lang.Object");
    }

    public final Object lv0(String imageFilepath, UploadConfigData uploadConfigData, InterfaceC67352kd<? super C35517Dwn> interfaceC67352kd) {
        XKS xks = new XKS(1, C78555UsJ.LJJII(interfaceC67352kd));
        xks.LJIIL();
        C35519Dwp c35519Dwp = this.LJLILLLLZI;
        String uploadDomain = uploadConfigData.imagexHost;
        String accessKey = uploadConfigData.accessKey;
        String secretKey = uploadConfigData.secretKey;
        String sessionToken = uploadConfigData.sessionToken;
        String serviceId = uploadConfigData.serviceId;
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12(xks, 226);
        AqS178S0100000_12 aqS178S0100000_122 = new AqS178S0100000_12(xks, 227);
        c35519Dwp.getClass();
        o.LJIIIZ(imageFilepath, "imageFilepath");
        o.LJIIIZ(uploadDomain, "uploadDomain");
        o.LJIIIZ(accessKey, "accessKey");
        o.LJIIIZ(secretKey, "secretKey");
        o.LJIIIZ(sessionToken, "sessionToken");
        o.LJIIIZ(serviceId, "serviceId");
        BDImageXUploader bDImageXUploader = new BDImageXUploader();
        bDImageXUploader.setFilePath(1, new String[]{imageFilepath});
        bDImageXUploader.setUploadDomain(uploadDomain);
        bDImageXUploader.setTopAccessKey(accessKey);
        bDImageXUploader.setTopSecretKey(secretKey);
        bDImageXUploader.setTopSessionToken(sessionToken);
        bDImageXUploader.setServiceID(serviceId);
        bDImageXUploader.setSliceSize(524288);
        bDImageXUploader.setSocketNum(2);
        bDImageXUploader.setSliceRetryCount(3);
        bDImageXUploader.setFileRetryCount(3);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("eclive_billboard_upload_");
        LIZ.append(UUID.randomUUID());
        bDImageXUploader.setTraceId(X1D.LIZIZ(LIZ));
        bDImageXUploader.setOpenBoe(false);
        bDImageXUploader.setListener(new S65(aqS178S0100000_12, aqS178S0100000_122));
        bDImageXUploader.start();
        return xks.LJIIJJI();
    }

    public final void jv0(Integer num, String str, boolean z, boolean z2) {
        S6S Rj;
        String str2;
        String str3;
        String str4;
        S5I s5i = this.LJLJJL;
        if (s5i == null || (Rj = s5i.Rj()) == null) {
            return;
        }
        RootData rootData = Rj.LJLILLLLZI;
        LiveEffect liveEffect = Rj.LJLJJLL;
        if (liveEffect == null || (str2 = liveEffect.getResourceId()) == null) {
            str2 = "";
        }
        if (z) {
            str3 = "image_upload";
        } else {
            str3 = "image_list";
        }
        if (z2) {
            str4 = "display_total_success";
        } else {
            str4 = "display_total_fail";
        }
        S5G.LIZ(rootData, "notice_board_template", str2, str3, str4, "display_total", z2, Long.valueOf(System.currentTimeMillis() - this.LJLJLJ), num, str);
    }

    public static /* synthetic */ void kv0(ImageListViewModel imageListViewModel, boolean z, boolean z2, String str, int i) {
        if ((i & 4) != 0) {
            str = null;
        }
        imageListViewModel.jv0(null, str, z, z2);
    }
}
