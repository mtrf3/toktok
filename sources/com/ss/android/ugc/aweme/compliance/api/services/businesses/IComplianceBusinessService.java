package com.ss.android.ugc.aweme.compliance.api.services.businesses;

import X.AbstractC37594EpC;
import X.ActivityC45651qj;
import X.C62895OmJ;
import X.C6FL;
import X.C76800UCe;
import X.C8W0;
import X.EJ6;
import X.InterfaceC63015OoF;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC65943PuN;
import X.InterfaceC72642tA;
import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProvider;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.TextWithInlineLink;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import kotlin.jvm.internal.AqS170S0100000_4;

/* loaded from: classes11.dex */
public interface IComplianceBusinessService {
    boolean LIZ(String str);

    boolean LIZIZ(String str);

    boolean LIZJ(String str);

    boolean LIZLLL(String str);

    boolean LJ(WebView webView, String str, String str2, String str3);

    MutableLiveData LJFF();

    String[] LJI();

    Object LJII();

    boolean LJIIIIZZ();

    int LJIIIZ();

    C6FL LJIIJ(Context context, int i, String str, String str2, String str3, InterfaceC63015OoF interfaceC63015OoF);

    InterfaceC65350Pko<? extends C8W0> LJIIJJI();

    void LJIIL(Context context, Aweme aweme);

    void LJIILIIL(Context context, InterfaceC72642tA<? extends IEvent> interfaceC72642tA, Aweme aweme);

    Fragment LJIILJJIL(boolean z, C62895OmJ c62895OmJ);

    Object LJIILL();

    ViewModelProvider.Factory LJIILLIIL();

    boolean LJIIZILJ();

    List<EJ6> LJIJ(WebView webView, String str);

    Class<?> LJIJI();

    Fragment LJIJJ();

    String LJIJJLI();

    void LJIL(ActivityC45651qj activityC45651qj, Aweme aweme, Comment comment);

    ViewGroup LJJ(Context context, Aweme aweme, AqS170S0100000_4 aqS170S0100000_4);

    int LJJI();

    void LJJIFFI(Activity activity, String str, String str2, InterfaceC65784Pro interfaceC65784Pro, InterfaceC65784Pro interfaceC65784Pro2);

    boolean LJJII(Activity activity);

    String LJJIII();

    InterfaceC65943PuN LJJIIJ();

    int LJJIIJZLJL();

    boolean LJJIIZ(Activity activity);

    void LJJIIZI(ActivityC45651qj activityC45651qj, String str, String str2, View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    void LJJIJ(int i, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro);

    int LJJIJIIJI();

    boolean LJJIJIIJIL(Aweme aweme);

    void LJJIJIL(Activity activity);

    void LJJIJL(ActivityC45651qj activityC45651qj, String str, String str2);

    boolean LJJIJLIJ();

    boolean LJJIL(boolean z);

    MutableLiveData LJJIZ();

    Spanned LJJJ(Context context, TextWithInlineLink textWithInlineLink);

    void LJJJI(String str, String str2, String str3, String str4);

    String LJJJIL(WebView webView, String str);

    Fragment LJJJJ();

    boolean LJJJJI();

    List<Class<? extends AbstractC37594EpC<?, ?>>> provideXBridgetIDLMethodList();
}
