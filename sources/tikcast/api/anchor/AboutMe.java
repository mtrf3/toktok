package tikcast.api.anchor;

import X.InterfaceC65349Pkn;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import java.util.List;

/* loaded from: classes17.dex */
public final class AboutMe {

    @InterfaceC65349Pkn("audit_status")
    public long auditStatus;

    @InterfaceC65349Pkn("image")
    public ImageModel image;

    @InterfaceC65349Pkn("switch_status")
    public boolean switchStatus;

    @InterfaceC65349Pkn("template_list")
    public List<AboutMeTemplate> templateList;

    @InterfaceC65349Pkn("user")
    public User user;

    @InterfaceC65349Pkn("id")
    public String id = "";

    @InterfaceC65349Pkn("current_template_id")
    public String currentTemplateId = "";
}
