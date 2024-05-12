package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.socialbase.downloader.depend.IDDListenerS58S0100000_7;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.download.component_api.DownloadServiceManager;
import com.ss.android.ugc.aweme.feed.model.PhotoModeImageUrlModel;
import com.ss.android.ugc.aweme.image.model.SrcImageInfo;
import defpackage.b1;
import fjb.a;
import java.util.List;
import ujb.o;

@InterfaceC65848Psq(c = "com.ss.android.ugc.aweme.shortvideo.editpost.DownloadEditPostPhotoManager$downloadPhotoModeResource$1$1$1", f = "DownloadEditPostPhotoManager.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes8.dex */
public final class GMP extends AbstractC65782Prm implements InterfaceC88471Ynr<InterfaceC70422pa, InterfaceC67352kd<? super SrcImageInfo>, Object> {
    public Object LJLIL;
    public Object LJLILLLLZI;
    public Object LJLJI;
    public int LJLJJI;
    public final /* synthetic */ PhotoModeImageUrlModel LJLJJL;
    public final /* synthetic */ C76732zl LJLJJLL;
    public final /* synthetic */ C76732zl LJLJL;
    public final /* synthetic */ GAH LJLJLJ;
    public final /* synthetic */ List<PhotoModeImageUrlModel> LJLJLLL;
    public final /* synthetic */ GMN LJLL;
    public final /* synthetic */ C76732zl LJLLI;
    public final /* synthetic */ C68322mC<String> LJLLILLLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GMP(PhotoModeImageUrlModel photoModeImageUrlModel, C76732zl c76732zl, C76732zl c76732zl2, GAH gah, List<PhotoModeImageUrlModel> list, GMN gmn, C76732zl c76732zl3, C68322mC<String> c68322mC, InterfaceC67352kd<? super GMP> interfaceC67352kd) {
        super(2, interfaceC67352kd);
        this.LJLJJL = photoModeImageUrlModel;
        this.LJLJJLL = c76732zl;
        this.LJLJL = c76732zl2;
        this.LJLJLJ = gah;
        this.LJLJLLL = list;
        this.LJLL = gmn;
        this.LJLLI = c76732zl3;
        this.LJLLILLLL = c68322mC;
    }

    @Override // fjb.a
    public final InterfaceC67352kd<C76800UCe> create(Object obj, InterfaceC67352kd<?> interfaceC67352kd) {
        return new GMP(this.LJLJJL, this.LJLJJLL, this.LJLJL, this.LJLJLJ, this.LJLJLLL, this.LJLL, this.LJLLI, this.LJLLILLLL, interfaceC67352kd);
    }

    @Override // fjb.a
    public final Object invokeSuspend(Object obj) {
        List<String> list;
        List<String> list2;
        int i;
        Object obj2 = obj;
        EnumC58928NAu enumC58928NAu = EnumC58928NAu.COROUTINE_SUSPENDED;
        int i2 = this.LJLJJI;
        if (i2 != 0) {
            if (i2 == 1) {
                C141335gf.LIZJ(obj2);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C141335gf.LIZJ(obj2);
            UrlModel displayImageNoWatermark = this.LJLJJL.getDisplayImageNoWatermark();
            if (displayImageNoWatermark == null || (list = displayImageNoWatermark.getUrlList()) == null) {
                list = C61878OQg.INSTANCE;
            }
            String str = (String) ORZ.LJLLLL(list);
            int i3 = 0;
            if (str != null && o.LJJJLIIL(str, "file://", false)) {
                String substring = str.substring(7);
                kotlin.jvm.internal.o.LJIIIIZZ(substring, "this as java.lang.String).substring(startIndex)");
                if (C39579Fg7.LIZIZ(substring)) {
                    this.LJLJJLL.element++;
                    C76732zl c76732zl = this.LJLJL;
                    int i4 = c76732zl.element + 1;
                    c76732zl.element = i4;
                    this.LJLJLJ.onProgress((i4 * 100.0f) / this.LJLJLLL.size());
                    UrlModel displayImageNoWatermark2 = this.LJLJJL.getDisplayImageNoWatermark();
                    if (displayImageNoWatermark2 != null) {
                        i = displayImageNoWatermark2.getHeight();
                    } else {
                        i = 0;
                    }
                    UrlModel displayImageNoWatermark3 = this.LJLJJL.getDisplayImageNoWatermark();
                    if (displayImageNoWatermark3 != null) {
                        i3 = displayImageNoWatermark3.getWidth();
                    }
                    return new SrcImageInfo(substring, i, i3);
                }
            }
            StringBuilder LIZ = X1D.LIZ();
            String LIZIZ = b1.LIZIZ(str, LIZ, ".png", LIZ);
            GMN gmn = this.LJLL;
            C76732zl c76732zl2 = this.LJLJJLL;
            C76732zl c76732zl3 = this.LJLLI;
            C68322mC<String> c68322mC = this.LJLLILLLL;
            C76732zl c76732zl4 = this.LJLJL;
            GAH gah = this.LJLJLJ;
            List<PhotoModeImageUrlModel> list3 = this.LJLJLLL;
            PhotoModeImageUrlModel photoModeImageUrlModel = this.LJLJJL;
            this.LJLIL = list;
            this.LJLILLLLZI = LIZIZ;
            this.LJLJI = list3;
            this.LJLJJI = 1;
            C84654XKg c84654XKg = new C84654XKg(C78555UsJ.LJJII(this));
            String str2 = (String) gmn.LIZIZ.getValue();
            GMO gmo = new GMO(c76732zl2, c76732zl3, c68322mC, c76732zl4, gah, list3, c84654XKg, gmn, LIZIZ, photoModeImageUrlModel);
            if (list.isEmpty()) {
                gmo.LIZ(1148, "urls is empty");
            } else {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(LIZIZ);
                if (C39579Fg7.LIZIZ(X1D.LIZIZ(LIZ2))) {
                    gmo.onSuccess();
                } else {
                    if (list.size() > 1) {
                        list2 = list.subList(1, list.size());
                    } else {
                        list2 = C61878OQg.INSTANCE;
                    }
                    IDDListenerS58S0100000_7 iDDListenerS58S0100000_7 = new IDDListenerS58S0100000_7(gmo, 0);
                    X5R with = DownloadServiceManager.INSTANCE.getDownloadService().with((String) ListProtector.get(list, 0));
                    with.LJIIIIZZ = list2;
                    with.LIZJ = LIZIZ;
                    with.LJ = str2;
                    with.LJI = C47261Igj.LJJIJ(new HttpHeader("edit_post", "photo"));
                    with.LJII = 3;
                    with.LJIJJLI = 3;
                    with.LJIIJ = "edit_post";
                    with.LJJI = true;
                    with.LJIIJJI = iDDListenerS58S0100000_7;
                    with.LIZJ();
                }
            }
            obj2 = c84654XKg.LIZ();
            if (obj2 == enumC58928NAu) {
                return enumC58928NAu;
            }
        }
        return obj2;
    }

    @Override // X.InterfaceC88471Ynr
    public final Object invoke(InterfaceC70422pa interfaceC70422pa, InterfaceC67352kd<? super SrcImageInfo> interfaceC67352kd) {
        return ((a) create(interfaceC70422pa, interfaceC67352kd)).invokeSuspend(C76800UCe.LIZ);
    }
}
