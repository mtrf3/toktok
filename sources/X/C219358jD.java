package X;

import com.ss.android.ugc.aweme.addyours.model.AddYoursAvatar;
import com.ss.android.ugc.aweme.addyours.model.AddYoursTopic;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.tiktok.addyours.collection.AddYoursCollectionListVM;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.8jD, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C219358jD extends AbstractC65781Prl implements InterfaceC88472Yns<C219308j8, C76800UCe> {
    public final /* synthetic */ AddYoursCollectionListVM LJLIL;
    public final /* synthetic */ C219368jE LJLILLLLZI;
    public final /* synthetic */ boolean LJLJI;
    public final /* synthetic */ C219948kA LJLJJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C219358jD(AddYoursCollectionListVM addYoursCollectionListVM, C219368jE c219368jE, boolean z, C219948kA c219948kA) {
        super(1);
        this.LJLIL = addYoursCollectionListVM;
        this.LJLILLLLZI = c219368jE;
        this.LJLJI = z;
        this.LJLJJI = c219948kA;
    }

    @Override // X.InterfaceC88472Yns
    public final C76800UCe invoke(C219308j8 it) {
        int LJIIIZ;
        o.LJIIIZ(it, "it");
        C72808Sho<ITEM> c72808Sho = this.LJLIL.state;
        if (c72808Sho != 0 && (LJIIIZ = c72808Sho.LJIIIZ(this.LJLILLLLZI)) >= 0) {
            AddYoursCollectionListVM addYoursCollectionListVM = this.LJLIL;
            C219368jE c219368jE = this.LJLILLLLZI;
            boolean z = this.LJLJI;
            C219948kA c219948kA = this.LJLJJI;
            long j = c219368jE.LJLIL;
            AddYoursTopic topic = c219368jE.LJLILLLLZI;
            String text = c219368jE.LJLJI;
            UrlModel urlModel = c219368jE.LJLJJI;
            long j2 = c219368jE.LJLJJL;
            Aweme aweme = c219368jE.LJLJJLL;
            List<AddYoursAvatar> list = c219368jE.LJLJL;
            o.LJIIIZ(topic, "topic");
            o.LJIIIZ(text, "text");
            addYoursCollectionListVM.listSetItemAt(LJIIIZ, (int) new C219368jE(j, topic, text, urlModel, j2, aweme, list, z, c219948kA));
        }
        return C76800UCe.LIZ;
    }
}
