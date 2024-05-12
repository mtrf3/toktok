package X;

import java.util.List;

/* renamed from: X.NPg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C59304NPg extends C59305NPh {
    public final C59478NVy LJJJJZI;
    public final C59478NVy LJJJLIIL;
    public final C59478NVy LJJJLL;
    public final C59478NVy LJJJLZIJ;
    public final C59478NVy LJJJZ;
    public final C59478NVy LJJL;
    public final C59296NOy LJJLI;
    public final C59478NVy LJJLIIIIJ;
    public final C59297NOz LJJLIIIJ;
    public final C59297NOz LJJLIIIJILLIZJL;
    public final C59297NOz LJJLIIIJJI;
    public final C59297NOz LJJLIIIJJIZ;
    public final C59297NOz LJJLIIIJL;
    public final C59297NOz LJJLIIIJLJLI;
    public final C59296NOy LJJLIIIJLLLLLLLZ;
    public final C59297NOz LJJLIIJ;
    public final C59478NVy LJJLIL;
    public final C59297NOz LJJLJ;
    public final C59478NVy LJJLJLI;
    public final C59296NOy LJJLL;

    public final String LIZLLL() {
        String str = (String) this.LJJJLIIL.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String LJ() {
        String str = (String) this.LJJJJZI.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final String LJFF() {
        String str = (String) this.LJJJZ.getValue();
        if (str == null) {
            return "";
        }
        return str;
    }

    public final int LJI() {
        Integer value = this.LJJLI.getValue();
        if (value != null) {
            return value.intValue();
        }
        return 0;
    }

    public C59304NPg() {
        C113444cm c113444cm = C73442uS.LJ;
        this.LJJJJZI = new C59478NVy("bundle_origin_url", c113444cm, null);
        this.LJJJLIIL = new C59478NVy("aweme_id", c113444cm, null);
        this.LJJJLL = new C59478NVy("group_id", c113444cm, null);
        this.LJJJLZIJ = new C59478NVy("enter_from", c113444cm, null);
        this.LJJJZ = new C59478NVy("preload_channel_name", c113444cm, null);
        this.LJJL = new C59478NVy("preload_scene", c113444cm, null);
        this.LJJLI = new C59296NOy("preload_web_status", 0);
        this.LJJLIIIIJ = new C59478NVy("add_common", c113444cm, null);
        this.LJJLIIIJ = new C59297NOz("show_not_official_content_warning", false);
        this.LJJLIIIJILLIZJL = new C59297NOz("control_request_url", false);
        this.LJJLIIIJJI = new C59297NOz("from_notification", false);
        this.LJJLIIIJJIZ = new C59297NOz("bundle_auto_play_audio", false);
        this.LJJLIIIJL = new C59297NOz("safeTemplate", false);
        this.LJJLIIIJLJLI = new C59297NOz("bundle_nav_bar_status_padding", false);
        this.LJJLIIIJLLLLLLLZ = new C59296NOy("preload_is_web_url", 0);
        this.LJJLIIJ = new C59297NOz("use_webview_title", false);
        this.LJJLIL = new C59478NVy("bundle_web_title", c113444cm, null);
        this.LJJLJ = new C59297NOz("is_from_lynx_land_page", false);
        this.LJJLJLI = new C59478NVy("second_page_preload_channel_name", c113444cm, null);
        this.LJJLL = new C59296NOy("preload_web_second_page", 0);
    }

    @Override // X.C59305NPh, X.C59472NVs, X.C59474NVu, X.AbstractC59475NVv
    public List<InterfaceC59479NVz<?>> LIZ() {
        return ORZ.LLIIIZ(C47261Igj.LJJIJIIJI(this.LJJJJZI, this.LJJJLIIL, this.LJJJLL, this.LJJJZ, this.LJJL, this.LJJLI, this.LJJJLZIJ, this.LJJLIIIJILLIZJL, this.LJJLIIIJJI, this.LJJLIIIJJIZ, this.LJJLIIIJL, this.LJJLIIIIJ, this.LJJLIIIJ, this.LJJJJ, this.LJJLIIIJLJLI, this.LJJLIIIJLLLLLLLZ, this.LJJLIIJ, this.LJJLIL, this.LJJJJLI, this.LJJLJ, this.LJJLJLI, this.LJJI, this.LJJLL), super.LIZ());
    }
}
